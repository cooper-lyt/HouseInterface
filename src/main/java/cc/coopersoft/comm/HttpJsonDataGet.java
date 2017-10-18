package cc.coopersoft.comm;

import cc.coopersoft.comm.exception.HttpApiServerException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.io.*;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by cooper on 9/25/16.
 */
public class HttpJsonDataGet {

    private static Logger log = Logger.getLogger(HttpJsonDataGet.class.getName());

    private interface JsonParser{

        <T> T readValue(InputStream src) throws IOException;
    }

    public static class JsonClassParser<T> implements JsonParser{

        private Class<T> valueType;

        public JsonClassParser(Class<T> valueType) {
            this.valueType = valueType;
        }

        public T readValue(InputStream src) throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(src, valueType);
        }
    }


    public static class JsonTypeParser implements JsonParser{

        private JavaType valueType;

        public JsonTypeParser(JavaType valueType) {
            this.valueType = valueType;
        }

        public <T> T readValue(InputStream src) throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(src, valueType);
        }
    }


    public static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }


    public static <T> T httpPostJsonData(String address,Map<String,String> urlParams, Map<String,String> postParams ,JsonParser jsonParser) throws HttpApiServerException {
        return httpPostJsonData(paramsToUrl(address, urlParams),postParams,jsonParser);
    }

    public static <T> T httpPostJsonData(String address,Map<String,String> postParams ,JsonParser jsonParser) throws HttpApiServerException {

        List<NameValuePair> values = new ArrayList<NameValuePair>();
        for(Map.Entry<String,String> entry: postParams.entrySet()){
            values.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        try {
            Logger.getLogger(HttpJsonDataGet.class.getName()).config("post to address:" + address);
            HttpPost httpPost = new HttpPost(address);
            try {
                httpPost.setHeader("Accept-Charset", "UTF-8");
                httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");

                httpPost.setEntity(new UrlEncodedFormEntity(values, "UTF-8"));

                HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
                CloseableHttpClient closeableHttpClient = httpClientBuilder.build();


                try {
                    HttpResponse httpResponse = closeableHttpClient.execute(httpPost);
                    int responseCode = httpResponse.getStatusLine().getStatusCode();
                    Logger.getLogger(HttpJsonDataGet.class.getName()).config("post responseCode:" + responseCode);
                    if (responseCode == HttpStatus.SC_MOVED_PERMANENTLY
                            || responseCode == HttpStatus.SC_MOVED_TEMPORARILY) {

                        return httpPostJsonData(httpResponse.getLastHeader("Location").getValue(), postParams, jsonParser);
                    } else {
                        if (HttpStatus.SC_OK == responseCode) {
                            return jsonParser.readValue(httpResponse.getEntity().getContent());
                        } else {
                            throw new HttpApiServerException(responseCode);
                        }
                    }
                } finally {
                    closeableHttpClient.close();
                }
            } finally {
                httpPost.abort();
            }
        }catch (UnsupportedEncodingException e) {
            throw new HttpApiServerException(e);
        }catch (IOException e) {
            throw new HttpApiServerException(e);
        }
    }

    private static String paramsToUrl(String address, Map<String,String> params){
        String paramStr = "";

        if (params != null ) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if ("".equals(paramStr)) {
                    paramStr = "?";
                } else {
                    paramStr += "&";
                }
                paramStr += entry.getKey() + "=" + entry.getValue();
            }
        }

        return address + paramStr;
    }


    public static <T> T httpGetJsonData(String address,Map<String,String> params,JsonParser jsonParser) throws HttpApiServerException {

        try {
            HttpGet httpGet = new HttpGet(paramsToUrl(address,params));
            try {

                httpGet.setHeader("Accept-Charset", "UTF-8");
                httpGet.setHeader("Content-Type", "application/json; charset=utf-8");

                HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();

                CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
                try {
                    HttpResponse httpResponse = closeableHttpClient.execute(httpGet);

                    int responseCode = httpResponse.getStatusLine().getStatusCode();
                    if (responseCode == HttpStatus.SC_MOVED_PERMANENTLY
                            || responseCode == HttpStatus.SC_MOVED_TEMPORARILY) {
                        return httpGetJsonData(httpResponse.getLastHeader("Location").getValue(),params,jsonParser);
                    } else {
                        if (HttpStatus.SC_OK == responseCode) {
                            return jsonParser.readValue(httpResponse.getEntity().getContent());
                        } else {
                            throw new HttpApiServerException(responseCode);
                        }
                    }
                }finally {
                    closeableHttpClient.close();
                }
            }finally {
                httpGet.abort();
            }


        } catch (MalformedURLException e) {
            log.log(Level.WARNING,e.getMessage(),e);
            throw new HttpApiServerException(e);
        } catch (UnsupportedEncodingException e) {
            log.log(Level.WARNING,e.getMessage(),e);
            throw new HttpApiServerException(e);
        } catch (JsonParseException e) {
            log.log(Level.WARNING,e.getMessage(),e);
            throw new HttpApiServerException(e);
        } catch (JsonMappingException e) {
            log.log(Level.WARNING,e.getMessage(),e);
            throw new HttpApiServerException(e);
        } catch (ClientProtocolException e) {
            log.log(Level.WARNING,e.getMessage(),e);
            throw new HttpApiServerException(e);
        } catch (IOException e) {
            log.log(Level.WARNING,e.getMessage(),e);
            throw new HttpApiServerException(e);
        }
    }

    public static <T> T getData(String address,Map<String,String> params, JavaType valueType) throws HttpApiServerException {
        return httpGetJsonData(address,params, new JsonTypeParser(valueType));
    }

    public static <T> T getData(String address,Map<String,String> params, Class<T> valueType) throws HttpApiServerException {
        return httpGetJsonData(address,params, new JsonClassParser<T>(valueType));
    }

    public static <T> T postData(String address,Map<String,String> postParams, Class<T> valueType) throws HttpApiServerException{
        return httpPostJsonData(address,postParams, new JsonClassParser(valueType));
    }

    public static <T> T postData(String address,Map<String,String> urlParams ,Map<String,String> postParams, Class<T> valueType) throws HttpApiServerException{
        return httpPostJsonData(address,urlParams,postParams, new JsonClassParser(valueType));
    }

    public static <T> T postData(String address,Map<String,String> postParams, JavaType valueType) throws HttpApiServerException{
        return httpPostJsonData(address,postParams, new JsonTypeParser(valueType));
    }

    public static <T> T postData(String address,Map<String,String> urlParams,Map<String,String> postParams, JavaType valueType) throws HttpApiServerException{
        return httpPostJsonData(address,urlParams,postParams, new JsonTypeParser(valueType));
    }

    public static String convertStreamToString(InputStream is) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        is.close();
        return sb.toString();
    }

    @Deprecated
    public static HttpResponse postData(String address, List<NameValuePair> params) throws IOException {
        HttpPost httpPost = new HttpPost(address);
        httpPost.setHeader("Accept-Charset", "UTF-8");
        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        HttpClient closeableHttpClient = httpClientBuilder.build();


        HttpResponse httpResponse = closeableHttpClient.execute(httpPost);
        int responseCode = httpResponse.getStatusLine().getStatusCode();

        if (responseCode == HttpStatus.SC_MOVED_PERMANENTLY
                || responseCode == HttpStatus.SC_MOVED_TEMPORARILY) {
            //System.out.println("resend to: " + httpResponse.getLastHeader("Location").getValue());
            return postData(httpResponse.getLastHeader("Location").getValue(), params);
        }else{
            return httpResponse;
        }
    }

}

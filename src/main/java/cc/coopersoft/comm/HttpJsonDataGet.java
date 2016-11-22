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
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.*;
import java.net.MalformedURLException;
import java.util.List;

/**
 * Created by cooper on 9/25/16.
 */
public class HttpJsonDataGet {

    public static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }

    private static HttpResponse connect(HttpGet httpGet) throws IOException {

        httpGet.setHeader("Accept-Charset", "UTF-8");
        httpGet.setHeader("Content-Type", "application/json; charset=utf-8");

        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();

        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();


        return closeableHttpClient.execute(httpGet);
    }

    public static <T> T getData(String address, JavaType valueType) throws HttpApiServerException {
        try {
            HttpGet httpGet = new HttpGet(address);
            try {

                HttpResponse httpResponse = connect(httpGet);

                int responseCode = httpResponse.getStatusLine().getStatusCode();

                if (HttpStatus.SC_OK == responseCode) {

                    ObjectMapper mapper = new ObjectMapper();
                    return mapper.readValue(httpResponse.getEntity().getContent(), valueType);


                } else {
                    throw new HttpApiServerException(responseCode);
                }
            }finally {
                httpGet.abort();
            }


        } catch (MalformedURLException e) {
            throw new HttpApiServerException(e);
        } catch (UnsupportedEncodingException e) {
            throw new HttpApiServerException(e);
        } catch (JsonParseException e) {
            throw new HttpApiServerException(e);
        } catch (JsonMappingException e) {
            throw new HttpApiServerException(e);
        } catch (ClientProtocolException e) {
            throw new HttpApiServerException(e);
        } catch (IOException e) {
            throw new HttpApiServerException(e);
        }

    }

    public static <T> T getData(String address, Class<T> valueType) throws HttpApiServerException {
        try {
            HttpGet httpGet = new HttpGet(address);
            try {

                HttpResponse httpResponse = connect(httpGet);

                int responseCode = httpResponse.getStatusLine().getStatusCode();

                if (HttpStatus.SC_OK == responseCode) {

                    ObjectMapper mapper = new ObjectMapper();
                    return mapper.readValue(httpResponse.getEntity().getContent(), valueType);


                } else {
                    throw new HttpApiServerException(responseCode);
                }
            }finally {
                httpGet.abort();
            }


        } catch (MalformedURLException e) {
            throw new HttpApiServerException(e);
        } catch (UnsupportedEncodingException e) {
            throw new HttpApiServerException(e);
        } catch (JsonParseException e) {
            throw new HttpApiServerException(e);
        } catch (JsonMappingException e) {
            throw new HttpApiServerException(e);
        } catch (ClientProtocolException e) {
            throw new HttpApiServerException(e);
        } catch (IOException e) {
            throw new HttpApiServerException(e);
        }

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

    public static HttpResponse postData(String address, List<NameValuePair> params) throws IOException {
        HttpPost httpPost = new HttpPost(address);
        httpPost.setHeader("Accept-Charset", "UTF-8");
        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();


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

package cc.coopersoft.house.sale;

import cc.coopersoft.comm.HttpJsonDataGet;
import cc.coopersoft.comm.exception.HttpApiServerException;
import com.dgsoft.developersale.AttachCorpLogonInfo;
import com.dgsoft.developersale.DeveloperSaleService;
import com.dgsoft.developersale.wsinterface.DESUtil;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cooper on 18/11/2016.
 */
public class ContractService {

    public static String commitSaleContract(String address, AttachCorpLogonInfo logonInfo, String contract) throws Exception {

        String postAddress = address;
        if (!postAddress.endsWith("/")){
            postAddress += "/";
        }

        HttpPost httpPost = new HttpPost(postAddress + "interfaces/contractSubmit/saleContract/" + logonInfo.getUserId());

        List<NameValuePair> values = new ArrayList<NameValuePair>();

        values.add(new BasicNameValuePair("contract", DESUtil.encrypt(contract,logonInfo.getSessionKey())));

        httpPost.setEntity(new UrlEncodedFormEntity(values, "UTF-8"));

        httpPost.setHeader("Accept-Charset", "UTF-8");
        httpPost.setHeader("Content-Type", "text/xml; charset=utf-8");

        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();

        HttpResponse httpResponse =  closeableHttpClient.execute(httpPost);

        int responseCode =  httpResponse.getStatusLine().getStatusCode();
        if (HttpStatus.SC_OK == responseCode) {
            return HttpJsonDataGet.convertStreamToString(httpResponse.getEntity().getContent()) ;
        }else{
            throw new HttpApiServerException(responseCode);
        }
    }

}

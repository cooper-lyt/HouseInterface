package cc.coopersoft.house.sale;

import cc.coopersoft.comm.HttpJsonDataGet;
import cc.coopersoft.comm.exception.HttpApiServerException;
import com.dgsoft.developersale.AttachCorpLogonInfo;
import com.dgsoft.developersale.wsinterface.DESUtil;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
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
        postAddress += "interfaces/contractSubmit/saleContract/" + logonInfo.getUserId();

        List<NameValuePair> values = new ArrayList<NameValuePair>();

        values.add(new BasicNameValuePair("contract", DESUtil.encrypt(contract,logonInfo.getSessionKey())));


        HttpResponse httpResponse = HttpJsonDataGet.postData(postAddress,values);

        int responseCode =  httpResponse.getStatusLine().getStatusCode();

        //System.out.println("return code :" + responseCode);


        if (HttpStatus.SC_OK == responseCode) {
            return HttpJsonDataGet.convertStreamToString(httpResponse.getEntity().getContent()) ;
        }else{
            throw new HttpApiServerException(responseCode);
        }
    }

}

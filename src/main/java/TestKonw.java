import cc.coopersoft.comm.exception.HttpApiServerException;
import cc.coopersoft.comm.tools.IdCardUtils;
import cc.coopersoft.house.sale.HouseSellService;
import cc.coopersoft.house.sale.data.AttrEmp;
import cc.coopersoft.house.sale.data.HouseQueryData;
import cc.coopersoft.house.sale.data.LoginResult;
import cc.coopersoft.house.sale.data.Seller;
import com.dgsoft.common.system.PersonEntity;
import com.dgsoft.developersale.LogonStatus;
import com.dgsoft.house.AttachCorpType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Date;

/**
 * Created by cooper on 9/23/16.
 */
public class TestKonw {

    public static void main(String[] args){
       Seller s = new Seller();
       s.setId("s_id");
       s.setName("s_name");
       s.setDateTo(new Date());
       s.setSaleTel("sellTel");

        AttrEmp e = new AttrEmp();
        e.setId("e_id");
        e.setName("e_name");
        e.setCredentialsType(PersonEntity.CredentialsType.MASTER_ID);
        e.setCredentialsNumber(null);

        LoginResult lr = new LoginResult();
        lr.setAttrEmp(e);
        lr.setCorpInfo(s);
        lr.setLogonStatus(LogonStatus.LOGON);
        //lr.setType(AttachCorpType.AGENCIES);



        ObjectMapper mapper = new ObjectMapper();
        String data = null;
        try {
            data = mapper.writeValueAsString(lr);
        } catch (JsonProcessingException e1) {
            e1.printStackTrace();
        }
        System.out.println(data);


        try {
            LoginResult result = mapper.readValue("{\"result\":\"LOGON\",\"corp\":{\"ID\":\"1\",\"SALE_TEL\":null,\"dateTo\":\"1519822064\",\"NAME\":\"www\",\"type\":\"AGENCIES\"},\"emp\":{\"credentialsType\":\"SOLDIER_CARD\",\"credentialsNumber\":null,\"name\":\"55\",\"id\":\"00000023\"}}", LoginResult.class);

            System.out.println(result.getCorpInfo());
        } catch (IOException e1) {
            e1.printStackTrace();
        }


        try {
            LoginResult result = HouseSellService.login("http://127.0.0.1:6699/","2606ED5BC4516C4375A35F2CEE4C9A5","uAjggA7wQv2YOfYAQdtjF/buOyA=","VVBKARMXIUDFPVUMMZNGRLMXQIVKLBGO");
            System.out.println(result.getCorpInfo());
        } catch (HttpApiServerException e1) {
            e1.printStackTrace();
        }

    }


}

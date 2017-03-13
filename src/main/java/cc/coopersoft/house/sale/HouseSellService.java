package cc.coopersoft.house.sale;

import cc.coopersoft.comm.District;
import cc.coopersoft.comm.HttpJsonDataGet;
import cc.coopersoft.comm.exception.HttpApiServerException;
import cc.coopersoft.house.sale.data.HouseValidResult;
import cc.coopersoft.house.sale.data.HouseValidInfo;
import cc.coopersoft.house.sale.data.LoginResult;
import cc.coopersoft.house.sale.data.SaleArea;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.*;

/**
 * Created by cooper on 9/23/16.
 */
public class HouseSellService {

    public static List<District> listDistrict(String address) throws HttpApiServerException {
        address += "/api/list-district";

        List<District> result = HttpJsonDataGet.getData(address,null,HttpJsonDataGet.getCollectionType(ArrayList.class, District.class));
        Collections.sort(result, new Comparator<District>() {
            public int compare(District o1, District o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        return result;
    }

    public static List<SaleArea> listAllSaleArea(String address) throws HttpApiServerException{
        address += "/api/public/list-sale-area";
        List<SaleArea> result = HttpJsonDataGet.getData(address,null, HttpJsonDataGet.getCollectionType(ArrayList.class, SaleArea.class));
        return result;
    }

    public static LoginResult login(String address, String uid,String password,String rnd) throws HttpApiServerException {
        address += "/api/public/attr-logon";

        Map<String,String> params = new HashMap<String, String>(3);
        params.put("uid",uid);
        params.put("rnd",rnd);
        params.put("digest",password);
        return HttpJsonDataGet.postData(address,params,LoginResult.class);
    }

    public static HouseValidResult houseValid(String address,HouseValidInfo validInfo) throws HttpApiServerException {
        address += "/api/protected/house-valid";
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
            mapper.addMixIn(validInfo.getClass(), HouseValidInfo.class);
            mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false);
            Map<String,String> params = new HashMap<String, String>(1);
            params.put("data", mapper.writerWithView(HouseValidInfo.class).writeValueAsString(validInfo));
            return HttpJsonDataGet.postData(address,params,HouseValidResult.class);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("houseValidInfo to json fail",e);
        }


    }

}

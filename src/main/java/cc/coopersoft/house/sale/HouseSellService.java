package cc.coopersoft.house.sale;

import cc.coopersoft.comm.District;
import cc.coopersoft.comm.HttpJsonDataGet;
import cc.coopersoft.comm.exception.HttpApiServerException;
import cc.coopersoft.house.sale.data.HouseQueryData;
import cc.coopersoft.house.sale.data.OldHouseQueryResult;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by cooper on 9/23/16.
 */
public class HouseSellService {

    public static List<District> listDistrict(String address) throws HttpApiServerException {
        address += "/api/list-district";

        List<District> result = HttpJsonDataGet.getData(address,HttpJsonDataGet.getCollectionType(ArrayList.class, District.class));
        Collections.sort(result, new Comparator<District>() {
            public int compare(District o1, District o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        return result;

    }

    public static OldHouseQueryResult querySellHouse(String address, HouseQueryData houseQueryData) throws HttpApiServerException {
            address += "/api/query-sell-house?type=" + houseQueryData.getHouseLocateType().name()
                + "&map=" +  houseQueryData.getMapNumber()
                + "&block=" + houseQueryData.getBlockNumber()
                + "&build=" + houseQueryData.getBuildNumber()
                + "&house=" + houseQueryData.getHouseOrder()
                + "&id=" + houseQueryData.getHouseCode()
                + "&unit=" + houseQueryData.getUnitNumber();


            //System.out.println(URLEncoder.encode(address,"UTF-8"));

        return HttpJsonDataGet.getData(address,OldHouseQueryResult.class);


    }

}

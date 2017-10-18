import cc.coopersoft.comm.District;
import cc.coopersoft.comm.HttpJsonDataGet;
import cc.coopersoft.comm.exception.HttpApiServerException;
import cc.coopersoft.comm.tools.IdCardUtils;
import cc.coopersoft.house.LockType;
import cc.coopersoft.house.sale.HouseSellService;
import cc.coopersoft.house.sale.data.*;
import com.dgsoft.common.system.PersonEntity;
import com.dgsoft.developersale.LogonStatus;
import com.dgsoft.house.AttachCorpType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by cooper on 9/23/16.
 */
public class TestKonw {

    public static void main(String[] args){

        String s = "210621291116081";
        System.out.println(s.substring(6, 12));

    }


}

import cc.coopersoft.comm.exception.HttpApiServerException;
import cc.coopersoft.house.sale.HouseSellService;
import cc.coopersoft.house.sale.data.HouseQueryData;

/**
 * Created by cooper on 9/23/16.
 */
public class TestKonw {

    public static void main(String[] args){
        try {
            //System.out.println( HouseSellService.querySellHouse("http://localhost:6699/",new HouseQueryData("10","32120","1","202")).getHouse().getHouseCode());
            System.out.println( HouseSellService.listDistrict("http://localhost:6699/").size());

        } catch (HttpApiServerException e) {
            e.printStackTrace();
        }
    }


}

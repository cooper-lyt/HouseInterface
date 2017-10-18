package cc.coopersoft.house.sale.data;

import cc.coopersoft.house.LockType;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cooper on 02/03/2017.
 */
public class HouseValidResult {

    public enum ValidStatus {
        SUCCESS, HOUSE_NOT_FOUND, OWNER_FAIL, ERROR
    }


    private ValidStatus validStatus;
    private HouseSource houseSource;
    private List<SellLimit> limits = new ArrayList<SellLimit>();


    public ValidStatus getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(ValidStatus validStatus) {
        this.validStatus = validStatus;
    }

    public HouseSource getHouseSource() {
        return houseSource;
    }

    public void setHouseSource(HouseSource houseSource) {
        this.houseSource = houseSource;
    }

    public List<SellLimit> getLimits() {
        return limits;
    }

    public void setLimits(List<SellLimit> limits) {
        this.limits = limits;
    }
}

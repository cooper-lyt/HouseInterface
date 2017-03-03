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

    public static class Limit{

        public Limit() {
        }

        public Limit(LockType lockType, String description) {
            this.lockType = lockType;
            this.description = description;
        }

        private LockType lockType;
        private String description;

        @JsonProperty("TYPE")
        public LockType getLockType() {
            return lockType;
        }

        public void setLockType(LockType lockType) {
            this.lockType = lockType;
        }

        @JsonProperty("DESCRIPTION")
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    private ValidStatus validStatus;
    private HouseSaleInfo houseSaleInfo;
    private List<Limit> limits = new ArrayList<Limit>();


    public ValidStatus getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(ValidStatus validStatus) {
        this.validStatus = validStatus;
    }

    public HouseSaleInfo getHouseSaleInfo() {
        return houseSaleInfo;
    }

    public void setHouseSaleInfo(HouseSaleInfo houseSaleInfo) {
        this.houseSaleInfo = houseSaleInfo;
    }

    public List<Limit> getLimits() {
        return limits;
    }

    public void setLimits(List<Limit> limits) {
        this.limits = limits;
    }
}

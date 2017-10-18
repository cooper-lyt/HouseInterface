package cc.coopersoft.house.sale.data;

import com.dgsoft.house.PoolType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

/**
 * Created by cooper on 9/27/16.
 */

public class OldHouseContract implements java.io.Serializable {

    private String id;
    private boolean control;
    private PoolType sellerPoolType;

    @JsonIgnore
    private HouseContract houseContract;

    public OldHouseContract() {
    }

    public OldHouseContract(HouseContract houseContract) {
        this.houseContract = houseContract;
        this.id = houseContract.getId();
    }

    @NotNull
    @Size(max = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HouseContract getHouseContract() {
        return houseContract;
    }

    public void setHouseContract(HouseContract houseContract) {
        this.houseContract = houseContract;
        this.id = houseContract.getId();
    }

    public boolean isControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }


    public PoolType getSellerPoolType() {
        return sellerPoolType;
    }

    public void setSellerPoolType(PoolType sellerPoolType) {
        this.sellerPoolType = sellerPoolType;
    }
}

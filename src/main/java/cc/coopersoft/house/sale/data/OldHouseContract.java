package cc.coopersoft.house.sale.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by cooper on 9/27/16.
 */

public class OldHouseContract implements java.io.Serializable {

    private String id;
    private boolean control;

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
}

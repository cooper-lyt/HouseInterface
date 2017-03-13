package cc.coopersoft.house.sale.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by cooper on 04/03/2017.
 */
public class SaleArea implements java.io.Serializable {

    public enum SaleAreaType{
        SALE,SCHOOL//,METRO
    }

    private String id;
    private String name;
    private SaleAreaType type;
    private int pri;
    private String district;
    private boolean enable;

    @JsonProperty("ID")
    @NotNull
    @Size(max = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NAME")
    @NotNull
    @Size(max = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("TYPE")
    @NotNull
    public SaleAreaType getType() {
        return type;
    }

    public void setType(SaleAreaType type) {
        this.type = type;
    }

    @JsonProperty("PRI")
    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

    @JsonProperty("DISTRICT")
    @NotNull
    @Size(max = 32)
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @JsonProperty("ENABLE")
    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}

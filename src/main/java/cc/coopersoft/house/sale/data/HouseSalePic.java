package cc.coopersoft.house.sale.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by cooper on 14/06/2017.
 */
public class HouseSalePic implements java.io.Serializable {

    private String id;
    private String title;
    private String description;

    @JsonIgnore
    private HouseSaleInfo houseSaleInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HouseSaleInfo getHouseSaleInfo() {
        return houseSaleInfo;
    }

    public void setHouseSaleInfo(HouseSaleInfo houseSaleInfo) {
        this.houseSaleInfo = houseSaleInfo;
    }
}

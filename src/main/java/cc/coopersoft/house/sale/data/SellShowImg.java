package cc.coopersoft.house.sale.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import static javax.swing.text.StyleConstants.Size;

/**
 * Created by cooper on 9/17/16.
 */
public class SellShowImg implements java.io.Serializable {

    private String id;
    private String title;
    private String description;
    private HouseSellInfo houseSellInfo;


    public SellShowImg() {
    }
    
    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HouseSellInfo getHouseSellInfo() {
        return houseSellInfo;
    }

    public void setHouseSellInfo(HouseSellInfo houseSellInfo) {
        this.houseSellInfo = houseSellInfo;
    }
}

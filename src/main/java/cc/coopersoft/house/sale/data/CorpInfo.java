package cc.coopersoft.house.sale.data;

import com.dgsoft.house.AttachCorpType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Date;

/**
 * Created by cooper on 01/03/2017.
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = Seller.class, name ="AGENCIES" ), @JsonSubTypes.Type(value = Developer.class,name = "DEVELOPER")})
public class CorpInfo {

    private String id;
    private String name;
    private Date dateTo;


    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }
}

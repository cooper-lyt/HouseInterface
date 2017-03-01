package cc.coopersoft.house.sale.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by cooper on 01/03/2017.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "type")
public class Seller extends CorpInfo {

    private String saleTel;

    @JsonProperty("SALE_TEL")
    public String getSaleTel() {
        return saleTel;
    }

    public void setSaleTel(String saleTel) {
        this.saleTel = saleTel;
    }
}

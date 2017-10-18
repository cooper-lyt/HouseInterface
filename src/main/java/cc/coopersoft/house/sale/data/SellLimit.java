package cc.coopersoft.house.sale.data;

import cc.coopersoft.house.SaleLimitType;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by cooper on 06/08/2017.
 */
public class SellLimit {


    public SellLimit() {
    }

    public SellLimit(SaleLimitType limitType, String description) {
        this.limitType = limitType;
        this.description = description;
    }

    public SellLimit(SaleLimitType limitType, String description, Date queryTime) {
        this.limitType = limitType;
        this.description = description;
        this.queryTime = queryTime;
    }

    private SaleLimitType limitType;
    private String description;
    private Date queryTime;

    @JsonProperty("TYPE")
    public SaleLimitType getLimitType() {
        return limitType;
    }

    public void setLimitType(SaleLimitType limitType) {
        this.limitType = limitType;
    }

    @JsonProperty("DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("QUERY_TIME")
    public Date getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Date queryTime) {
        this.queryTime = queryTime;
    }
}

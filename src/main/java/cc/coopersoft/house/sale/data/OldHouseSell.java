package cc.coopersoft.house.sale.data;

import com.dgsoft.common.system.PersonEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by cooper on 9/17/16.
 */

public class OldHouseSell implements java.io.Serializable,PersonEntity {

    private String id;
    private Date applyTime;
    private Date showTime;
    private Date endTime;
    private String checkBusinessId;
    private String sellBusinessId;
    private String tel;
    private String powerCardNumber;
    private BigDecimal price;
    private CredentialsType credentialsType;
    private String credentialsNumber;
    private String personName;

    private HouseSellCompany houseSellCompany;
    private Set<HouseSellCompany> houseSellCompanies = new HashSet<HouseSellCompany>(0);
    private HouseSellInfo houseSellInfo;


    public OldHouseSell() {
    }

    @JsonProperty( "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @JsonProperty( "APPLY_TIME")
    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
    
    @JsonProperty( "SHOW_TIME")
    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }
    
    @JsonProperty( "END_TIME")
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @JsonProperty( "CHECK_BIZ_ID")
    public String getCheckBusinessId() {
        return checkBusinessId;
    }

    public void setCheckBusinessId(String checkBusinessId) {
        this.checkBusinessId = checkBusinessId;
    }

    @JsonProperty( "SELL_BIZ_ID")
    public String getSellBusinessId() {
        return sellBusinessId;
    }

    public void setSellBusinessId(String sellBusinessId) {
        this.sellBusinessId = sellBusinessId;
    }


    @JsonProperty( "TEL")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @JsonProperty( "POWER_CARD_NUMBER")
    public String getPowerCardNumber() {
        return powerCardNumber;
    }

    public void setPowerCardNumber(String powerCardNumber) {
        this.powerCardNumber = powerCardNumber;
    }

    @JsonProperty( "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @JsonProperty( "CREDENTIALS_TYPE")
    public PersonEntity.CredentialsType getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(CredentialsType credentialsType) {
        this.credentialsType = credentialsType;
    }

    @JsonProperty( "CREDENTIALS_NUMBER")
    public String getCredentialsNumber() {
        return credentialsNumber;
    }

    public void setCredentialsNumber(String s) {
        this.credentialsNumber = s;
    }

    @JsonProperty( "OWNER_NAME")
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String s) {
        this.personName = s;
    }


    public HouseSellCompany getHouseSellCompany() {
        return houseSellCompany;
    }

    public void setHouseSellCompany(HouseSellCompany houseSellCompany) {
        this.houseSellCompany = houseSellCompany;
    }

    public Set<HouseSellCompany> getHouseSellCompanies() {
        return houseSellCompanies;
    }

    public void setHouseSellCompanies(Set<HouseSellCompany> houseSellCompanies) {
        this.houseSellCompanies = houseSellCompanies;
    }

    public HouseSellInfo getHouseSellInfo() {
        return houseSellInfo;
    }

    public void setHouseSellInfo(HouseSellInfo houseSellInfo) {
        this.houseSellInfo = houseSellInfo;
    }
}

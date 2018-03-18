package cc.coopersoft.house.sale.data;

import com.dgsoft.common.system.PersonEntity;
import com.dgsoft.common.system.PowerPersonEntity;
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

    private String ownerName;
    private PersonEntity.CredentialsType credentialsType;
    private String credentialsNumber;
    private String address;
    private String tel;
    private PowerPersonEntity.LegalType legalType;

    private String ownerTel;


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

    @JsonProperty("OWNER_NAME")
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @JsonProperty("CREDENTIALS_TYPE")
    public PersonEntity.CredentialsType getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(PersonEntity.CredentialsType credentialsType) {
        this.credentialsType = credentialsType;
    }

    @JsonProperty("LICENSE_NUMBER")
    public String getCredentialsNumber() {
        return credentialsNumber;
    }

    public void setCredentialsNumber(String credentialsNumber) {
        this.credentialsNumber = credentialsNumber;
    }

    @JsonProperty("ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("TEL")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @JsonProperty("LEGAL_TYPE")
    public PowerPersonEntity.LegalType getLegalType() {
        return legalType;
    }

    public void setLegalType(PowerPersonEntity.LegalType legalType) {
        this.legalType = legalType;
    }

    @JsonProperty("OWNER_TEL")
    public String getOwnerTel() {
        return ownerTel;
    }

    public void setOwnerTel(String ownerTel) {
        this.ownerTel = ownerTel;
    }
}

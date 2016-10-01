package cc.coopersoft.house.sale.data;

import com.dgsoft.common.system.PersonEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by cooper on 9/25/16.
 */
public class SellProxyPerson implements java.io.Serializable, PersonEntity {

    private String id;

    private CredentialsType credentialsType;
    private String credentialsNumber;
    private String personName;
    private String tel;

    public SellProxyPerson() {
    }

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("CREDENTIALS_TYPE")
    public CredentialsType getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(CredentialsType credentialsType) {
        this.credentialsType = credentialsType;
    }

    @JsonProperty("CREDENTIALS_NUMBER")
    public String getCredentialsNumber() {
        return credentialsNumber;
    }

    public void setCredentialsNumber(String credentialsNumber) {
        this.credentialsNumber = credentialsNumber;
    }

    @JsonProperty("PERSON_NAME")
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @JsonProperty("TEL")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

package cc.coopersoft.house.sale.data;

import com.dgsoft.common.system.PersonEntity;

/**
 * Created by cooper on 24/04/2017.
 */
public class HouseSourceProxyPerson implements PersonEntity, java.io.Serializable{


    private String id;
    private CredentialsType credentialsType;
    private String credentialsNumber;
    private String personName;
    private String tel;

    public HouseSourceProxyPerson() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CredentialsType getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(CredentialsType credentialsType) {
        this.credentialsType = credentialsType;
    }

    public String getCredentialsNumber() {
        return credentialsNumber;
    }

    public void setCredentialsNumber(String credentialsNumber) {
        this.credentialsNumber = credentialsNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

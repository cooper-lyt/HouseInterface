package cc.coopersoft.house.sale.data;

import cc.coopersoft.house.ProxyType;
import com.dgsoft.common.system.PersonEntity;
import com.dgsoft.common.system.ProxyPersonEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by cooper on 24/04/2017.
 */
public class HouseSourceProxyPerson implements ProxyPersonEntity, java.io.Serializable{


    private String id;
    private CredentialsType credentialsType;
    private String credentialsNumber;
    private String personName;
    private String phone;
    private ProxyType proxyType;
    private String address;



    public HouseSourceProxyPerson() {
    }

    public HouseSourceProxyPerson(String id) {
        this.id = id;
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


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ProxyType getProxyType() {
        return proxyType;
    }

    public void setProxyType(ProxyType proxyType) {
        this.proxyType = proxyType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

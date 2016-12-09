package cc.coopersoft.house.sale.data;

import cc.coopersoft.house.ProxyType;
import com.dgsoft.common.system.PersonEntity;
import com.dgsoft.common.system.ProxyPersonEntity;
import com.dgsoft.common.system.Sex;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by cooper on 9/27/16.
 */
public class PowerProxyPerson implements ProxyPersonEntity, java.io.Serializable {

    private String id;
    private ProxyType proxyType;

    private String personName;
    private PersonEntity.CredentialsType credentialsType;
    private String credentialsNumber;

    private String phone;
    private String rootAddress;
    private String address;

    @JsonIgnore
    private PowerPerson powerPerson;

    private Date birthday;
    private Sex sex;
    private String postCode;

    @JsonIgnore
    private String fingerprint;

    @JsonIgnore
    private String paperCopyInfo;


    public PowerProxyPerson() {
    }

    public PowerProxyPerson(PowerPerson powerPerson) {
        this.powerPerson = powerPerson;
        this.id = powerPerson.getId();
    }

    @NotNull
    @Size(max = 32)
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PowerPerson getPowerPerson() {
        return powerPerson;
    }

    public void setPowerPerson(PowerPerson powerPerson) {
        this.powerPerson = powerPerson;
        this.id = powerPerson.getId();
    }

    @NotNull
    @Size(max = 50)
    public String getPersonName() {
        return this.personName;
    }

    public void setPersonName(String name) {
        this.personName = name;
    }

    @NotNull
    public PersonEntity.CredentialsType getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(PersonEntity.CredentialsType credentialsType) {
        this.credentialsType = credentialsType;
    }

    @NotNull
    @Size(max = 100)
    public String getCredentialsNumber() {
        return credentialsNumber;
    }

    public void setCredentialsNumber(String cerdentialsNumber) {
        this.credentialsNumber = cerdentialsNumber;
    }

    @Size(max = 15)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Size(max = 50)
    public String getRootAddress() {
        return rootAddress;
    }

    public void setRootAddress(String rootAddress) {
        this.rootAddress = rootAddress;
    }

    @Size(max = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @NotNull
    public ProxyType getProxyType() {
        return proxyType;
    }

    public void setProxyType(ProxyType proxyType) {
        this.proxyType = proxyType;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Size(max = 9)
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }


    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getPaperCopyInfo() {
        return paperCopyInfo;
    }

    public void setPaperCopyInfo(String paperCopyInfo) {
        this.paperCopyInfo = paperCopyInfo;
    }

}

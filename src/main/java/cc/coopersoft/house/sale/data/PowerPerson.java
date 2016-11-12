package cc.coopersoft.house.sale.data;

import com.dgsoft.common.system.OwnerPersonEntity;
import com.dgsoft.common.system.PersonEntity;
import com.dgsoft.common.system.Sex;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by cooper on 9/15/15.
 */

public class PowerPerson implements OwnerPersonEntity, java.io.Serializable {



    public enum ContractPersonType{
        BUYER,SELLER
    }


    private String id;
    private String personName;
    private PersonEntity.CredentialsType credentialsType;
    private String credentialsNumber;
    private String relation;
    private BigDecimal poolArea;
    private BigDecimal poolPerc;

    private String legalPerson;
    private HouseContract houseContract;
    private LegalType legalType;

    private String phone;
    private String rootAddress;
    private String address;

    private Date birthday;
    private Sex sex;
    private String postCode;

    private int pri;
    private ContractPersonType contractPersonType;
    private PowerProxyPerson powerProxyPerson;

    public PowerPerson() {
    }

    public PowerPerson(HouseContract houseContract, ContractPersonType contractPersonType, int pri) {
        this.houseContract = houseContract;
        this.contractPersonType = contractPersonType;
        this.pri = pri;
    }

    @NotNull
    @Size(max = 32)
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Size(max = 32)
    public String getRelation() {
        return this.relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public BigDecimal getPoolArea() {
        return this.poolArea;
    }

    public void setPoolArea(BigDecimal poolArea) {
        this.poolArea = poolArea;
    }

    public BigDecimal getPoolPerc() {
        return this.poolPerc;
    }

    public void setPoolPerc(BigDecimal perc) {
        this.poolPerc = perc;
    }

    @Size(max = 15)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Size(max = 50)
    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    @NotNull
    public HouseContract getHouseContract() {
        return houseContract;
    }

    public void setHouseContract(HouseContract houseContract) {
        this.houseContract = houseContract;
    }

    public OwnerPersonEntity.LegalType getLegalType() {
        return legalType;
    }

    public void setLegalType(LegalType legalType) {
        this.legalType = legalType;
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

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

    @NotNull
    public ContractPersonType getContractPersonType() {
        return contractPersonType;
    }

    public void setContractPersonType(ContractPersonType contractPersonType) {
        this.contractPersonType = contractPersonType;
    }

    public PowerProxyPerson getPowerProxyPerson() {
        return powerProxyPerson;
    }

    public void setPowerProxyPerson(PowerProxyPerson powerProxyPerson) {
        this.powerProxyPerson = powerProxyPerson;
    }


}

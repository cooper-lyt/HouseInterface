package cc.coopersoft.house.sale.data;

import com.dgsoft.common.system.PersonEntity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * Created by cooper on 23/02/2017.
 */
public class HouseSource implements PersonEntity, java.io.Serializable{

    public HouseSource() {
    }

    public HouseSource(String id, String groupId, HouseValidInfo validInfo, HouseSaleInfo houseSaleInfo ){
        this.id = id;
        this.groupId = groupId;
        this.powerCardNumber = validInfo.getPowerCardNumber();
        this.credentialsNumber = validInfo.getCredentialsNumber();
        this.credentialsType = validInfo.getCredentialsType();
        this.personName = validInfo.getPersonName();
        this.tel = validInfo.getTel();
        this.houseSaleInfo = houseSaleInfo;
    }


    private String id;

    private String powerCardNumber;
    private CredentialsType credentialsType;
    private String credentialsNumber;
    private String personName;
    private String tel;
    private String groupId;
    private String checkView;


    private Long version;

    private HouseSaleInfo houseSaleInfo;
    private HouseSourceProxyPerson proxyPerson;
    private Set<HouseSourceCompany> houseSourceCompanies;

    @NotNull
    @Size(max = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NotNull
    @Size(max = 50)
    public String getPowerCardNumber() {
        return powerCardNumber;
    }

    public void setPowerCardNumber(String powerCardNumber) {
        this.powerCardNumber = powerCardNumber;
    }

    @NotNull
    public PersonEntity.CredentialsType getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(CredentialsType credentialsType) {
        this.credentialsType = credentialsType;
    }

    @NotNull
    @Size(max = 100)
    public String getCredentialsNumber() {
        return credentialsNumber;
    }

    public void setCredentialsNumber(String credentialsNumber) {
        this.credentialsNumber = credentialsNumber;
    }

    @NotNull
    @Size(max = 50)
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @NotNull
    @Size(max = 16)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }


    @NotNull
    @Size(max = 32)
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public HouseSaleInfo getHouseSaleInfo() {
        return houseSaleInfo;
    }

    public void setHouseSaleInfo(HouseSaleInfo houseSaleInfo) {
        this.houseSaleInfo = houseSaleInfo;
    }

    public String getCheckView() {
        return checkView;
    }

    public void setCheckView(String checkView) {
        this.checkView = checkView;
    }

    public HouseSourceProxyPerson getProxyPerson() {
        return proxyPerson;
    }

    public void setProxyPerson(HouseSourceProxyPerson proxyPerson) {
        this.proxyPerson = proxyPerson;
    }

    public Set<HouseSourceCompany> getHouseSourceCompanies() {
        return houseSourceCompanies;
    }

    public void setHouseSourceCompanies(Set<HouseSourceCompany> houseSourceCompanies) {
        this.houseSourceCompanies = houseSourceCompanies;
    }
}

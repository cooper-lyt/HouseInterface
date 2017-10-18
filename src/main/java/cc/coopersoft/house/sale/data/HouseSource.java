package cc.coopersoft.house.sale.data;

import com.dgsoft.common.system.PersonEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

/**
 * Created by cooper on 23/02/2017.
 */
public class HouseSource implements PersonEntity, java.io.Serializable{

    public enum SaleType{
        DEVELOPER,SELLER;
    }

    public enum HouseSourceStatus{
        //合同提交，建立，房源审核中， 取消， 已销售，展示中，房源审核通过, 审核失败
        SUBMIT,PREPARE,CHECK,CANCEL,SELL,SHOWING,CHECK_PASS,CHECK_FAIL
    }

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

    private String houseCode;
    private String sourceId;
    private SaleType saleType;
    private Date applyTime;
    private HouseSourceStatus status;
    private String searchKey;
    private String saleTitle;
    private Date checkTime;
    private Date updateTime;

    private String businessId;

    private String messages;

    @JsonIgnore
    private HouseContract houseContract;


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


    @JsonProperty("HOUSE_CODE")
    @NotNull
    @Size(max = 32)
    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    @NotNull
    public HouseSourceStatus getStatus() {
        return status;
    }

    public void setStatus(HouseSourceStatus status) {
        this.status = status;
    }

    @NotNull
    public SaleType getSaleType() {
        return saleType;
    }

    public void setSaleType(SaleType saleType) {
        this.saleType = saleType;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    @NotNull
    @Size(max = 32)
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @NotNull
    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    @NotNull
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @NotNull
    @Size(max = 200)
    public String getSaleTitle() {
        return saleTitle;
    }

    public void setSaleTitle(String saleTitle) {
        this.saleTitle = saleTitle;
    }

    @JsonIgnore
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public HouseContract getHouseContract() {
        return houseContract;
    }

    public void setHouseContract(HouseContract houseContract) {
        this.houseContract = houseContract;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

}

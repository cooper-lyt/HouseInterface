package cc.coopersoft.house.sale.data;

import cc.coopersoft.house.HousePowerCard;
import cc.coopersoft.house.UseType;
import com.dgsoft.common.system.OwnerPersonEntity;
import com.dgsoft.common.system.PersonEntity;
import com.dgsoft.common.system.ProxyPersonEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by cooper on 23/02/2017.
 */
public class HouseSource implements OwnerPersonEntity, java.io.Serializable{

    @JsonIgnore
    public ProxyPersonEntity getPowerProxyPerson() {
        return getProxyPerson();
    }

    @JsonIgnore
    public void setPowerProxyPerson(ProxyPersonEntity proxyPerson) {
        setProxyPerson((HouseSourceProxyPerson) proxyPerson);
    }

    public enum SaleType{
        DEVELOPER,SELLER;
    }

    public enum HouseSourceStatus{
        //签约合同提交，建立，房源审核中， 取消， 已销售，展示中，房源审核通过

        SUBMIT,PREPARE,CHECK,
        // CANCEL,
        // SELL,
        SHOWING,
        //CHECK_PASS
    }

    public enum MessageType{
        CHECK_FAIL,CANCEL
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
        this.powerCardType = validInfo.getPowerCardType();
        this.houseSaleInfo = houseSaleInfo;
    }


    private String id;

    private String powerCardNumber;
    private HousePowerCard powerCardType;
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

    private Date checkTime;
    private Date updateTime;
    private boolean allowJoin;

    private String businessId;

    private String messages;
    private String address;

    private MessageType messageType;

    private UseType useType;
    private String designUseType;
    private String mapNumber;
    private String blockNumber;
    private String buildNumber;
    private String houseOrder;
    private String structure;
    private String inFloorName;
    private Integer floorCount;
    private String district;
    private BigDecimal houseArea;
    private BigDecimal useArea;






    private Long version;

    private HouseSaleInfo houseSaleInfo;
    private HouseSourceProxyPerson proxyPerson;
    private Set<HouseSourceCompany> houseSourceCompanies = new HashSet<HouseSourceCompany>(0);

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

    @JsonProperty("DISTRICT_CODE")
    @Size(max = 32)
    @NotNull
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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

    @JsonIgnore
    public Set<HouseSourceCompany> getHouseSourceCompanies() {
        return houseSourceCompanies;
    }

    @JsonIgnore
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

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
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

    public HousePowerCard getPowerCardType() {
        return powerCardType;
    }

    public void setPowerCardType(HousePowerCard powerCardType) {
        this.powerCardType = powerCardType;
    }

    public boolean isAllowJoin() {
        return allowJoin;
    }

    public void setAllowJoin(boolean allowJoin) {
        this.allowJoin = allowJoin;
    }

    @JsonProperty("ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("USE_TYPE")
    public UseType getUseType() {
        return useType;
    }

    public void setUseType(UseType useType) {
        this.useType = useType;
    }

    @JsonProperty("DESIGN_USE_TYPE")
    public String getDesignUseType() {
        return designUseType;
    }

    public void setDesignUseType(String designUseType) {
        this.designUseType = designUseType;
    }

    @JsonProperty("MAP_NUMBER")
    public String getMapNumber() {
        return mapNumber;
    }

    public void setMapNumber(String mapNumber) {
        this.mapNumber = mapNumber;
    }
    @JsonProperty("BLOCK_NUMBER")
    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }
    @JsonProperty("BUILD_NUMBER")
    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }
    @JsonProperty("HOUSE_ORDER")
    public String getHouseOrder() {
        return houseOrder;
    }

    public void setHouseOrder(String houseOrder) {
        this.houseOrder = houseOrder;
    }
    @JsonProperty("STRUCTURE")
    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    @JsonProperty("IN_FLOOR_NAME")
    public String getInFloorName() {
        return inFloorName;
    }

    public void setInFloorName(String inFloorName) {
        this.inFloorName = inFloorName;
    }

    @JsonProperty("FLOOR_COUNT")
    public Integer getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(Integer floorCount) {
        this.floorCount = floorCount;
    }

    @JsonProperty("HOUSE_AREA")
    @NotNull
    public BigDecimal getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(BigDecimal houseArea) {
        this.houseArea = houseArea;
    }

    @JsonProperty("USE_AREA")
    public BigDecimal getUseArea() {
        return useArea;
    }

    public void setUseArea(BigDecimal useArea) {
        this.useArea = useArea;
    }


}

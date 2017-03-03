package cc.coopersoft.house.sale.data;

import com.dgsoft.common.system.PersonEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

/**
 * Created by cooper on 22/02/2017.
 */

public class HouseValidInfo implements PersonEntity, java.io.Serializable {

    public enum ValidType {
        MBBH_NUMBER,HOUSE_CODE,UNIT_NUMBER
    }

    public HouseValidInfo() {

    }

    public HouseValidInfo(ValidType validType) {
        this.validType = validType;
    }

    private CredentialsType credentialsType;
    private String credentialsNumber;
    private String powerCardNumber;
    private String personName;
    private String tel;


    private ValidType validType;

    private String mapNumber;
    private String blockNumber;
    private String buildNumber;
    private String houseNumber;

    private String unitNumber;

    private String houseCode;

    @JsonView(HouseValidInfo.class)
    @JsonProperty("credentialsNumber")
    public String getCredentialsNumber() {
        return credentialsNumber;
    }

    public void setCredentialsNumber(String credentialsNumber) {
        this.credentialsNumber = credentialsNumber;
    }

    @JsonView(HouseValidInfo.class)
    @JsonProperty("powerCardNumber")
    public String getPowerCardNumber() {
        return powerCardNumber;
    }

    public void setPowerCardNumber(String powerCardNumber) {
        this.powerCardNumber = powerCardNumber;
    }

    @JsonView(HouseValidInfo.class)
    @JsonProperty("validType")
    public ValidType getValidType() {
        return validType;
    }

    public void setValidType(ValidType validType) {
        this.validType = validType;
    }

    @JsonView(HouseValidInfo.class)
    @JsonProperty("mapNumber")
    public String getMapNumber() {
        return mapNumber;
    }

    public void setMapNumber(String mapNumber) {
        this.mapNumber = mapNumber;
    }

    @JsonView(HouseValidInfo.class)
    @JsonProperty("blockNumber")
    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    @JsonView(HouseValidInfo.class)
    @JsonProperty("buildNumber")
    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    @JsonView(HouseValidInfo.class)
    @JsonProperty("houseNumber")
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @JsonView(HouseValidInfo.class)
    @JsonProperty("unitNumber")
    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    @JsonView(HouseValidInfo.class)
    @JsonProperty("houseCode")
    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    @JsonView(HouseValidInfo.class)
    @JsonProperty("credentialsType")
    public CredentialsType getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(CredentialsType credentialsType) {
        this.credentialsType = credentialsType;
    }

    @JsonView(HouseValidInfo.class)
    @JsonProperty("personName")
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @JsonView(HouseValidInfo.class)
    @JsonProperty("tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

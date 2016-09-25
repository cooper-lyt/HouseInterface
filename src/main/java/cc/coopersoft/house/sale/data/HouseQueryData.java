package cc.coopersoft.house.sale.data;

import com.dgsoft.common.system.PersonEntity;

/**
 * Created by cooper on 9/22/16.
 */
public class HouseQueryData implements PersonEntity {


    public enum HouseLocateType{
        MAP_NUMBER,HOUSE_CODE,UNIT_NUMBER
    }

    public HouseQueryData() {
    }

    public HouseQueryData(String mapNumber, String blockNumber, String buildNumber, String houseOrder) {
        this.mapNumber = mapNumber;
        this.blockNumber = blockNumber;
        this.buildNumber = buildNumber;
        this.houseOrder = houseOrder;
    }

    private String mapNumber;

    private String blockNumber;

    private String buildNumber;

    private String houseOrder;

    private String houseCode;

    private String unitNumber;

    private String personName;

    private String ownerCardNumber;

    private PersonEntity.CredentialsType credentialsType;

    private String credentialsNumber;

    private String ownerTel;

    private HouseLocateType houseLocateType = HouseLocateType.MAP_NUMBER;

    public String getMapNumber() {
        return mapNumber;
    }

    public void setMapNumber(String mapNumber) {
        this.mapNumber = mapNumber;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getHouseOrder() {
        return houseOrder;
    }

    public void setHouseOrder(String houseOrder) {
        this.houseOrder = houseOrder;
    }

    public String getOwnerCardNumber() {
        return ownerCardNumber;
    }

    public void setOwnerCardNumber(String ownerCardNumber) {
        this.ownerCardNumber = ownerCardNumber;
    }

    public PersonEntity.CredentialsType getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(PersonEntity.CredentialsType credentialsType) {
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

    public void setPersonName(String s) {
        this.personName = personName;
    }

    public String getOwnerTel() {
        return ownerTel;
    }

    public void setOwnerTel(String ownerTel) {
        this.ownerTel = ownerTel;
    }

    public HouseLocateType getHouseLocateType() {
        return houseLocateType;
    }

    public void setHouseLocateType(HouseLocateType houseLocateType) {
        this.houseLocateType = houseLocateType;
    }

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }
}

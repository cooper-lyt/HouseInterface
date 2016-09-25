package cc.coopersoft.house.sale.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by cooper on 9/23/16.
 */
public class OldHouseQueryData implements java.io.Serializable{

    private String houseCode;
    private String houseOrder;
    private String houseUnitName;
    private String inFloorName;
    private BigDecimal houseArea;
    private BigDecimal useArea;
    private BigDecimal commArea;
    private BigDecimal shineArea;
    private BigDecimal loftArea;
    private String houseType;
    private String useType;
    private String structure;
    private String knotSize;
    private String address;
    private String eastWall;
    private String westWall;
    private String southWall;
    private String northWall;
    private String direction;

    private String unitNumber;
    private String buildNumber;
    private String buildDevNumber;
    private String DoorNumber;
    private String sectionName;
    private String district;

    public OldHouseQueryData() {
    }

    @JsonProperty("HOUSE_CODE")
    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    @JsonProperty("HOUSE_ORDER")
    public String getHouseOrder() {
        return houseOrder;
    }

    public void setHouseOrder(String houseOrder) {
        this.houseOrder = houseOrder;
    }

    @JsonProperty("HOUSE_UNIT_NAME")
    public String getHouseUnitName() {
        return houseUnitName;
    }

    public void setHouseUnitName(String houseUnitName) {
        this.houseUnitName = houseUnitName;
    }

    @JsonProperty("IN_FLOOR_NAME")
    public String getInFloorName() {
        return inFloorName;
    }

    public void setInFloorName(String inFloorName) {
        this.inFloorName = inFloorName;
    }

    @JsonProperty("HOUSE_AREA")
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

    @JsonProperty("COMM_AREA")
    public BigDecimal getCommArea() {
        return commArea;
    }

    public void setCommArea(BigDecimal commArea) {
        this.commArea = commArea;
    }

    @JsonProperty("SHINE_AREA")
    public BigDecimal getShineArea() {
        return shineArea;
    }

    public void setShineArea(BigDecimal shineArea) {
        this.shineArea = shineArea;
    }

    @JsonProperty("LOFT_AREA")
    public BigDecimal getLoftArea() {
        return loftArea;
    }

    public void setLoftArea(BigDecimal loftArea) {
        this.loftArea = loftArea;
    }

    @JsonProperty("HOUSE_TYPE")
    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    @JsonProperty("USE_TYPE")
    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    @JsonProperty("STRUCTURE")
    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    @JsonProperty("UNIT_NUMBER")
    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    @JsonProperty("KNOT_SIZE")
    public String getKnotSize() {
        return knotSize;
    }

    public void setKnotSize(String knotSize) {
        this.knotSize = knotSize;
    }

    @JsonProperty("ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("EAST_WALL")
    public String getEastWall() {
        return eastWall;
    }

    public void setEastWall(String eastWall) {
        this.eastWall = eastWall;
    }

    @JsonProperty("WEST_WALL")
    public String getWestWall() {
        return westWall;
    }

    public void setWestWall(String westWall) {
        this.westWall = westWall;
    }

    @JsonProperty("SOUTH_WALL")
    public String getSouthWall() {
        return southWall;
    }

    public void setSouthWall(String southWall) {
        this.southWall = southWall;
    }

    @JsonProperty("NORTH_WALL")
    public String getNorthWall() {
        return northWall;
    }

    public void setNorthWall(String northWall) {
        this.northWall = northWall;
    }

    @JsonProperty("DIRECTION")
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @JsonProperty("BUILD_NO")
    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    @JsonProperty("DEVELOPER_NUMBER")
    public String getBuildDevNumber() {
        return buildDevNumber;
    }

    public void setBuildDevNumber(String buildDevNumber) {
        this.buildDevNumber = buildDevNumber;
    }

    @JsonProperty("DOOR_NO")
    public String getDoorNumber() {
        return DoorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        DoorNumber = doorNumber;
    }

    @JsonProperty("SECTION_NAME")
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @JsonProperty("DISTRICT_ID")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}

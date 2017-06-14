package cc.coopersoft.house.sale.data;

import cc.coopersoft.house.UseType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * Created by cooper on 26/02/2017.
 */

public class HouseSaleInfo implements java.io.Serializable{

    private String id;

    private String title;
    private String tags;
    private String description;
    private String environment;
    private BigDecimal lat;
    private BigDecimal lng;
    private Integer zoom;
    private int roomCount;
    private int livingRoom;
    private String district;
    private String localArea;
    private String schoolArea;
    private String metroArea;
    private String direction;
    private String decorate;
    private int createYear;
    private boolean elevator;
    private String cover;
    private int inFloor;

    private UseType useType;
    private String inFloorName;
    private BigDecimal houseArea;
    private BigDecimal useArea;
    private String structure;
    private String address;

    private Set<HouseSalePic> houseSalePics;

    public HouseSaleInfo() {
    }

    @NotNull
    @Size(max = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NotNull
    @Size(max = 64)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Size(max = 512)
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Size(max = 512)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Size(max = 512)
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public Integer getZoom() {
        return zoom;
    }

    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(int livingRoom) {
        this.livingRoom = livingRoom;
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

    @Size(max = 32)
    public String getLocalArea() {
        return localArea;
    }

    public void setLocalArea(String localArea) {
        this.localArea = localArea;
    }

    @Size(max = 32)
    public String getSchoolArea() {
        return schoolArea;
    }

    public void setSchoolArea(String schoolArea) {
        this.schoolArea = schoolArea;
    }

    @Size(max = 32)
    public String getMetroArea() {
        return metroArea;
    }

    public void setMetroArea(String metroArea) {
        this.metroArea = metroArea;
    }

    @Size(max = 32)
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Size(max = 512)
    public String getDecorate() {
        return decorate;
    }

    public void setDecorate(String decorate) {
        this.decorate = decorate;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    public boolean isElevator() {
        return elevator;
    }

    public void setElevator(boolean elevator) {
        this.elevator = elevator;
    }

    @Size(max = 32)
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getInFloor() {
        return inFloor;
    }

    public void setInFloor(int inFloor) {
        this.inFloor = inFloor;
    }
//
//    @NotNull
//    public HouseSource getHouseSource() {
//        return houseSource;
//    }
//
//    public void setHouseSource(HouseSource houseSource) {
//        this.houseSource = houseSource;
//    }

    @JsonProperty("USE_TYPE")
    @NotNull
    public UseType getUseType() {
        return useType;
    }

    public void setUseType(UseType useType) {
        this.useType = useType;
    }

    @JsonProperty("IN_FLOOR_NAME")
    @NotNull
    @Size(max = 50)
    public String getInFloorName() {
        return inFloorName;
    }

    public void setInFloorName(String inFloorName) {
        this.inFloorName = inFloorName;
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

    @JsonProperty("STRUCTURE")
    @NotNull
    @Size(max = 32)
    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    @JsonProperty("ADDRESS")
    @NotNull
    @Size(max = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Set<HouseSalePic> getHouseSalePics() {
        return houseSalePics;
    }

    public void setHouseSalePics(Set<HouseSalePic> houseSalePics) {
        this.houseSalePics = houseSalePics;
    }
}

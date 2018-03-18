package cc.coopersoft.house.sale.data;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by cooper on 26/02/2017.
 */

public class HouseSaleInfo implements java.io.Serializable{

    public enum ShowAreaType{
        TO_END_TIME,TO_SELL
    }

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

    private String localArea;
    private String schoolArea;
    private String metroArea;
    private String direction;
    private String decorate;
    private int createYear;
    private boolean elevator;
    private String cover;
    private int inFloor;


    private String address;


    private int floorCount;
    private int kitchenCount;
    private int toiletCount;

    private ShowAreaType showAreaType;
    private Date endTime;
    private BigDecimal price;
    private BigDecimal sumPrice;


    private Set<HouseSalePic> houseSalePics = new HashSet<HouseSalePic>(0);

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



    @JsonProperty("FLOOR_COUNT")
    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public int getKitchenCount() {
        return kitchenCount;
    }

    public void setKitchenCount(int kitchenCount) {
        this.kitchenCount = kitchenCount;
    }

    public int getToiletCount() {
        return toiletCount;
    }

    public void setToiletCount(int toiletCount) {
        this.toiletCount = toiletCount;
    }

    public ShowAreaType getShowAreaType() {
        return showAreaType;
    }

    public void setShowAreaType(ShowAreaType showAreaType) {
        this.showAreaType = showAreaType;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(BigDecimal sumPrice) {
        this.sumPrice = sumPrice;
    }

}

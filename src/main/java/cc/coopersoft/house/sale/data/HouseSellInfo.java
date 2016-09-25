package cc.coopersoft.house.sale.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cooper on 9/17/16.
 */

public class HouseSellInfo implements java.io.Serializable{

    private String id;
    private String title;
    private String tags;
    private String description;
    private String environment;
    private BigDecimal lat;
    private BigDecimal lng;
    private Integer zoom;
    private int roomCount;
    private int livingRoomCount;
    private String localArea;
    private String schoolArea;
    private String metroArea;
    private String direction;
    private String decorate;
    private int createYear;
    private boolean elevator;
    private String img;

    private List<SellShowImg> sellShowImgs = new ArrayList<SellShowImg>(0);

    public HouseSellInfo() {
    }

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("TAGS")
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @JsonProperty("DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("ENVIRONMENT")
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @JsonProperty("LAT")
    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    @JsonProperty("LNG")
    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    @JsonProperty("ZOOM")
    public Integer getZoom() {
        return zoom;
    }

    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    @JsonProperty("ROOM_COUNT")
    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    @JsonProperty("LIVING_ROOM")
    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    public void setLivingRoomCount(int livingRoomCount) {
        this.livingRoomCount = livingRoomCount;
    }

    @JsonProperty("LOCAL_AREA")
    public String getLocalArea() {
        return localArea;
    }

    public void setLocalArea(String localArea) {
        this.localArea = localArea;
    }

    @JsonProperty("SCHOOL_AREA")
    public String getSchoolArea() {
        return schoolArea;
    }

    public void setSchoolArea(String schoolArea) {
        this.schoolArea = schoolArea;
    }

    @JsonProperty("METRO_AREA")
    public String getMetroArea() {
        return metroArea;
    }

    public void setMetroArea(String metroArea) {
        this.metroArea = metroArea;
    }

    @JsonProperty("DIRECTION")
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @JsonProperty("DECORATE")
    public String getDecorate() {
        return decorate;
    }

    public void setDecorate(String decorate) {
        this.decorate = decorate;
    }

    @JsonProperty("CREATE_YEAR")
    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    @JsonProperty("ELEVATOR")
    public boolean isElevator() {
        return elevator;
    }

    public void setElevator(boolean elevator) {
        this.elevator = elevator;
    }

    @JsonProperty("IMG")
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<SellShowImg> getSellShowImgs() {
        return sellShowImgs;
    }

    public void setSellShowImgs(List<SellShowImg> sellShowImgs) {
        this.sellShowImgs = sellShowImgs;
    }
}

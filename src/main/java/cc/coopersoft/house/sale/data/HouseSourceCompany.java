package cc.coopersoft.house.sale.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by cooper on 24/04/2017.
 */
public class HouseSourceCompany implements java.io.Serializable{

    private String id;

    private String groupId;
    private HouseSource houseSource;
    private String context;
    private String title;
    private String memo;

    @JsonIgnore
    private HouseContract houseContract;

    public HouseSourceCompany() {
    }

    public HouseSourceCompany(String id, String groupId, HouseSource houseSource) {
        this.id = id;
        this.groupId = groupId;
        this.houseSource = houseSource;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public HouseSource getHouseSource() {
        return houseSource;
    }

    public void setHouseSource(HouseSource houseSource) {
        this.houseSource = houseSource;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @JsonIgnore
    public HouseContract getHouseContract() {
        return houseContract;
    }

    @JsonIgnore
    public void setHouseContract(HouseContract houseContract) {
        this.houseContract = houseContract;
    }
}

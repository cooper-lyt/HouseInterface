package cc.coopersoft.house.sale.data;

/**
 * Created by cooper on 24/04/2017.
 */
public class HouseSourceCompany implements java.io.Serializable{

    private String id;

    private String groupId;
    private HouseSource houseSource;

    public HouseSourceCompany() {
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
}

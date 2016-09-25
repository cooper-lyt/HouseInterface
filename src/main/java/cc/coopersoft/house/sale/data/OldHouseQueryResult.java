package cc.coopersoft.house.sale.data;

/**
 * Created by cooper on 9/23/16.
 */
public class OldHouseQueryResult {

    public enum ResultStatus{
        OK,EXISTS
    }

    private ResultStatus status;

    private OldHouseQueryData house;

    public OldHouseQueryData getHouse() {
        return house;
    }

    public void setHouse(OldHouseQueryData house) {
        this.house = house;
    }

    public ResultStatus getStatus() {
        return status;
    }

    public void setStatus(ResultStatus status) {
        this.status = status;
    }
}

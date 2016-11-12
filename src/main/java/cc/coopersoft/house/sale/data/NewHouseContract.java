package cc.coopersoft.house.sale.data;

import com.dgsoft.house.SalePayType;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by cooper on 9/27/16.
 */
public class NewHouseContract implements java.io.Serializable{

    private String id;

    private SalePayType salePayType;
    private String projectCode;


    private String projectCerNumber;

    private HouseContract houseContract;

    public NewHouseContract() {
    }

    public NewHouseContract(HouseContract houseContract) {
        this.houseContract = houseContract;
    }


    @NotNull
    @Size(max = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HouseContract getHouseContract() {
        return houseContract;
    }

    public void setHouseContract(HouseContract houseContract) {
        this.houseContract = houseContract;
    }

    @Size(max = 32)
    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }


    @Size(max = 100)
    public String getProjectCerNumber() {
        return projectCerNumber;
    }

    public void setProjectCerNumber(String projectCerNumber) {
        this.projectCerNumber = projectCerNumber;
    }


    @NotNull
    public SalePayType getSalePayType() {
        return salePayType;
    }

    public void setSalePayType(SalePayType salePayType) {
        this.salePayType = salePayType;
    }




}

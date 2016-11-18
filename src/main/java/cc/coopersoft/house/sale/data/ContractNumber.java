package cc.coopersoft.house.sale.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by cooper on 9/15/15.
 */
public class ContractNumber implements java.io.Serializable  {

    private String contractNumber;
    @JsonIgnore
    private HouseContract houseContract;
    private String ownerName;
    private String password;

    public ContractNumber() {
    }

    public ContractNumber(String contractNumber, HouseContract houseContract) {
        this.contractNumber = contractNumber;
        this.houseContract = houseContract;
    }

    @NotNull
    @Size(max = 32)
    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    @NotNull
    public HouseContract getHouseContract() {
        return houseContract;
    }

    public void setHouseContract(HouseContract houseContract) {
        this.houseContract = houseContract;
    }

    @Size(max = 64)
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Size(max = 64)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

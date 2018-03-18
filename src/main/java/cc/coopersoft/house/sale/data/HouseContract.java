package cc.coopersoft.house.sale.data;

import com.dgsoft.house.PoolType;
import com.dgsoft.house.SalePayType;
import com.dgsoft.house.SaleType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by cooper on 9/14/15.
 */

public class HouseContract implements java.io.Serializable {

    public enum ContractStatus{
        PREPARE, SUBMIT, RECORD
    }

    private String id;

    private String groupId;
    private String houseCode;
    private SaleType type;

    private Date createTime;
    private ContractStatus status;
    private String attachEmpId;
    private String attachEmpName;
    private BigDecimal price;
    private String context;
    private String houseDescription;
    private int contractVersion;
    private BigDecimal houseArea;

    private PoolType poolType;

    private Set<PowerPerson> powerPersons = new HashSet<PowerPerson>(0);
    private Set<ContractNumber> contractNumbers = new HashSet<ContractNumber>(0);

    private NewHouseContract newHouseContract;
    private OldHouseContract oldHouseContract;

    private SaleProxyPerson saleProxyPerson;

    private SalePayType salePayType;


    @JsonIgnore
    private int version;
    @JsonIgnore
    private String contractIndex;

    @JsonIgnore
    private Date commitTime;

    private String fileId;


    public HouseContract() {
    }

    public HouseContract(String id,String groupId, Date createTime,
                         ContractStatus status, String attachEmpId,
                         String attachEmpName, PoolType poolType) {
        this.id = id;
        this.groupId = groupId;
       // this.projectCode = projectCode;
        this.createTime = createTime;
        this.status = status;
        this.attachEmpId = attachEmpId;
        this.attachEmpName = attachEmpName;
        this.poolType = poolType;
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
    @Size(max = 32)
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


    @NotNull
    @Size(max = 32)
    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    @NotNull
    public SaleType getType() {
        return type;
    }

    public void setType(SaleType type) {
        this.type = type;
    }

    @NotNull
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @NotNull
    public ContractStatus getStatus() {
        return status;
    }

    public void setStatus(ContractStatus status) {
        this.status = status;
    }

    @NotNull
    @Size(max = 32)
    public String getAttachEmpId() {
        return attachEmpId;
    }

    public void setAttachEmpId(String attachEmpId) {
        this.attachEmpId = attachEmpId;
    }

    public String getAttachEmpName() {
        return attachEmpName;
    }

    public void setAttachEmpName(String attachEmpName) {
        this.attachEmpName = attachEmpName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getContext() {
        return context;
    }


    public void setContext(String context) {
        this.context = context;
    }

    public int getContractVersion() {
        return contractVersion;
    }

    public void setContractVersion(int contractVersion) {
        this.contractVersion = contractVersion;
    }


    @NotNull
    public PoolType getPoolType() {
        return poolType;
    }

    public void setPoolType(PoolType poolType) {
        this.poolType = poolType;
    }

    @NotNull
    public BigDecimal getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(BigDecimal houseArea) {
        this.houseArea = houseArea;
    }

    @NotNull
    public SalePayType getSalePayType() {
        return salePayType;
    }

    public void setSalePayType(SalePayType salePayType) {
        this.salePayType = salePayType;
    }

    public Set<PowerPerson> getPowerPersons() {
        return powerPersons;
    }

    public void setPowerPersons(Set<PowerPerson> powerPersons) {
        this.powerPersons = powerPersons;
    }

    public List<PowerPerson> getBusinessPoolList(){
        List<PowerPerson> result = new ArrayList<PowerPerson>(getPowerPersons());
        Collections.sort(result, new Comparator<PowerPerson>() {

            public int compare(PowerPerson o1, PowerPerson o2) {
                return Integer.valueOf(o1.getPri()).compareTo(o2.getPri());
            }
        });
        return result;
    }


    public Set<ContractNumber> getContractNumbers() {
        return contractNumbers;
    }

    public void setContractNumbers(Set<ContractNumber> contractNumbers) {
        this.contractNumbers = contractNumbers;
    }

    @NotNull
    @Size(max = 52)
    public String getHouseDescription() {
        return houseDescription;
    }

    public void setHouseDescription(String houseDescription) {
        this.houseDescription = houseDescription;
    }

    public NewHouseContract getNewHouseContract() {
        return newHouseContract;
    }

    public void setNewHouseContract(NewHouseContract newHouseContract) {
        this.newHouseContract = newHouseContract;
    }

    public OldHouseContract getOldHouseContract() {
        return oldHouseContract;
    }

    public void setOldHouseContract(OldHouseContract oldHouseContract) {
        this.oldHouseContract = oldHouseContract;
    }

    public SaleProxyPerson getSaleProxyPerson() {
        return saleProxyPerson;
    }

    public void setSaleProxyPerson(SaleProxyPerson saleProxyPerson) {
        this.saleProxyPerson = saleProxyPerson;
    }

    public List<ContractNumber> getContractNumberList(){
        List<ContractNumber> result = new ArrayList<ContractNumber>(getContractNumbers());
        Collections.sort(result, new Comparator<ContractNumber>() {

            public int compare(ContractNumber o1, ContractNumber o2) {
                return o1.getContractNumber().compareTo(o2.getContractNumber());
            }
        });
        return result;
    }


    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getContractIndex() {
        return contractIndex;
    }

    public void setContractIndex(String contractIndex) {
        this.contractIndex = contractIndex;
    }
}

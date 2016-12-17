package com.dgsoft.developersale;

import com.dgsoft.house.*;
import com.dgsoft.house.impl.HousePledgeInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;

/**
 * Created by cooper on 9/4/15.
 */
public class SaleHouse {

    private final static EnumSet<HouseStatus> ALLOW_SALE_STATUS = EnumSet.of(HouseStatus.PROJECT_PLEDGE, HouseStatus.INIT_REG_CONFIRM, HouseStatus.INIT_REG);


    private String houseCode;
    private String displayHouseCode;
    private String houseOrder;
    private String houseUnitName;
    private String inFloorName;
    private BigDecimal houseArea;
    private BigDecimal useArea;
    private BigDecimal commArea;
    private BigDecimal shineArea;
    private BigDecimal loftArea;
    private BigDecimal commParam;
    private HouseProperty houseType;
    private String useType;
    private String structure;
    private String knotSize;
    private String address;
    private String eastWall;
    private String westWall;
    private String southWall;
    private String northWall;
    private String direction;

    private SaleStatus status;

    private Boolean inBiz;
    private SaleType saleType;



    private HouseStatus houseStatus;

    private boolean locked;

    private boolean saled;

    private boolean haveDownRoom;

    private String ownerCardNumber;

    private Date landEndUseTime;


    private List<PledgeInfo> pledgeInfoList = new ArrayList<PledgeInfo>();



    private SaleStatus getSaleStatus(){
        if (isLocked() || (getHouseType() == null)  ||
            (!HouseProperty.SALE_HOUSE.equals(getHouseType()) && !HouseProperty.LIMIT_PRICE_HOUSE.equals(getHouseType()))){
            return SaleStatus.NO_SALE;
        }
        if (isSaled()){
            return SaleStatus.CONTRACT_SUBMIT;
        }


        if (getHouseStatus() == null){
            return SaleStatus.CAN_SALE;
        }else if (HouseStatus.COURT_CLOSE.equals(getHouseStatus())) {
            return SaleStatus.COURT_CLOSE;
        } else if (HouseStatus.CONTRACTS_RECORD.equals(getHouseStatus())) {
            return SaleStatus.CONTRACTS_RECORD;
        }else if (HouseStatus.PROJECT_PLEDGE.equals(getHouseStatus())){
            return SaleStatus.PROJECT_PLEDGE;
        } else if(ALLOW_SALE_STATUS.contains(getHouseStatus())){
            return SaleStatus.CAN_SALE;
        }else{
            return SaleStatus.HAVE_SALE;
        }

    }

    public SaleHouse(SaleBuild saleBuild, JSONObject jsonObject){
        this(jsonObject);
        this.saleBuild = saleBuild;
    }

    public SaleHouse(JSONObject jsonObject) {

        try {
            JSONArray jsonArray = jsonObject.getJSONArray("pledge");
            this.pledgeInfoList = new ArrayList<PledgeInfo>(jsonArray.length());
            for(int i = 0; i < jsonArray.length(); i++){
                pledgeInfoList.add(new HousePledgeInfo(jsonArray.getJSONObject(i)));
            }
        } catch (JSONException e) {
            this.pledgeInfoList = new ArrayList<PledgeInfo>(0);
        }


        try {
            this.inBiz = jsonObject.getBoolean("inBiz");
        } catch (JSONException e) {
            this.inBiz = null;
        }

        try {
            this.saleType = SaleType.valueOf(jsonObject.getString("saleType"));
        } catch (JSONException e) {
            this.saleType = null;
        }
        try {
            this.landEndUseTime = new Date(jsonObject.getLong("landEndUseTime"));
        } catch (JSONException e) {
            this.landEndUseTime = null;
        }

        try {
            String statusName = jsonObject.getString("status");
            if (statusName == null || statusName.trim().equals("")){
                this.houseStatus = null;
            }else
                this.houseStatus = HouseStatus.valueOf(statusName);
        } catch (JSONException e) {
            this.houseStatus = null;
        }

        try {
            this.locked = jsonObject.getBoolean("locked");
        } catch (JSONException e) {
            this.locked = false;
        }


        try {
            this.saled = jsonObject.getBoolean("saled");
        } catch (JSONException e) {
            this.saled = false;
        }




        try {
            houseCode = jsonObject.getString("houseCode");
        } catch (JSONException e) {
            houseCode = null;
        }
        try {
            displayHouseCode = jsonObject.getString("displayHouseCode");
        } catch (JSONException e) {
            displayHouseCode = null;
        }
        try {
            houseOrder = jsonObject.getString("houseOrder");
        } catch (JSONException e) {
            houseOrder = null;
        }
        try {
            houseUnitName = jsonObject.getString("houseUnitName");
        } catch (JSONException e) {
            houseUnitName = null;
        }
        try {
            inFloorName = jsonObject.getString("inFloorName");
        } catch (JSONException e) {
            inFloorName = null;
        }
        try {
            houseArea = new BigDecimal(jsonObject.getString("houseArea"));
        } catch (JSONException e) {
            houseArea = null;
        }
        try {
            useArea = new BigDecimal(jsonObject.getString("useArea"));
        } catch (JSONException e) {
            useArea = null;
        }
        try {
            commArea = new BigDecimal(jsonObject.getString("commArea"));
        } catch (JSONException e) {
            commArea = null;
        }
        try {
            shineArea = new BigDecimal(jsonObject.getString("shineArea"));
        } catch (JSONException e) {
            shineArea = null;
        }
        try {
            loftArea = new BigDecimal(jsonObject.getString("loftArea"));
        } catch (JSONException e) {
            loftArea = null;
        }
        try {
            commParam = new BigDecimal(jsonObject.getString("commParam"));
        } catch (JSONException e) {
            commParam = null;
        }
        try {
            houseType = HouseProperty.valueOf(jsonObject.getString("houseType"));
        } catch (JSONException e) {
            houseType = null;
        }
        try {
            useType = jsonObject.getString("useType");
        } catch (JSONException e) {
            useType = null;
        }
        try {
            structure = jsonObject.getString("structure");
        } catch (JSONException e) {
            structure = null;
        }
        try {
            knotSize = jsonObject.getString("knotSize");
        } catch (JSONException e) {
            knotSize = null;
        }
        try {
            address = jsonObject.getString("address");
        } catch (JSONException e) {
            address = null;
        }
        try {
            eastWall = jsonObject.getString("eastWall");
        } catch (JSONException e) {
            eastWall = null;
        }
        try {
            westWall = jsonObject.getString("westWall");
        } catch (JSONException e) {
            westWall = null;
        }
        try {
            southWall = jsonObject.getString("southWall");
        } catch (JSONException e) {
            southWall = null;
        }
        try {
            northWall = jsonObject.getString("northWall");
        } catch (JSONException e) {
            northWall = null;
        }
        try {
            direction = jsonObject.getString("direction");
        } catch (JSONException e) {
            direction = null;
        }

        try {
            ownerCardNumber = jsonObject.getString("ownerCardNumber");
        } catch (JSONException e) {
            ownerCardNumber = null;
        }


        this.status = getSaleStatus();

    }


    public List<PledgeInfo> getPledgeInfoList() {
        return pledgeInfoList;
    }

    public void setPledgeInfoList(List<PledgeInfo> pledgeInfoList) {
        this.pledgeInfoList = pledgeInfoList;
    }

    public SaleBuild getSaleBuild() {
        return saleBuild;
    }

    public void setSaleBuild(SaleBuild saleBuild) {
        this.saleBuild = saleBuild;
    }

    public HouseStatus getHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(HouseStatus houseStatus) {
        this.houseStatus = houseStatus;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isSaled() {
        return saled;
    }

    public void setSaled(boolean saled) {
        this.saled = saled;
    }

    public SaleStatus getStatus() {
        return status;
    }

    public void setStatus(SaleStatus status) {
        this.status = status;
    }

    public Boolean getInBiz() {
        return inBiz;
    }

    public void setInBiz(Boolean inBiz) {
        this.inBiz = inBiz;
    }

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    public String getDisplayHouseCode() {
        return displayHouseCode;
    }

    public void setDisplayHouseCode(String displayHouseCode) {
        this.displayHouseCode = displayHouseCode;
    }

    public String getHouseOrder() {
        return houseOrder;
    }

    public void setHouseOrder(String houseOrder) {
        this.houseOrder = houseOrder;
    }

    public String getHouseUnitName() {
        return houseUnitName;
    }

    public void setHouseUnitName(String houseUnitName) {
        this.houseUnitName = houseUnitName;
    }

    public String getInFloorName() {
        return inFloorName;
    }

    public void setInFloorName(String inFloorName) {
        this.inFloorName = inFloorName;
    }

    public BigDecimal getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(BigDecimal houseArea) {
        this.houseArea = houseArea;
    }

    public BigDecimal getUseArea() {
        return useArea;
    }

    public void setUseArea(BigDecimal useArea) {
        this.useArea = useArea;
    }

    public BigDecimal getCommArea() {
        return commArea;
    }

    public void setCommArea(BigDecimal commArea) {
        this.commArea = commArea;
    }

    public BigDecimal getShineArea() {
        return shineArea;
    }

    public void setShineArea(BigDecimal shineArea) {
        this.shineArea = shineArea;
    }

    public BigDecimal getLoftArea() {
        return loftArea;
    }

    public void setLoftArea(BigDecimal loftArea) {
        this.loftArea = loftArea;
    }

    public BigDecimal getCommParam() {
        return commParam;
    }

    public void setCommParam(BigDecimal commParam) {
        this.commParam = commParam;
    }

    public HouseProperty getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseProperty houseType) {
        this.houseType = houseType;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getStructure() {
        return structure;
    }

    public String getKnotSize() {
        return knotSize;
    }

    public void setKnotSize(String knotSize) {
        this.knotSize = knotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEastWall() {
        return eastWall;
    }

    public void setEastWall(String eastWall) {
        this.eastWall = eastWall;
    }

    public String getWestWall() {
        return westWall;
    }

    public void setWestWall(String westWall) {
        this.westWall = westWall;
    }

    public String getSouthWall() {
        return southWall;
    }

    public void setSouthWall(String southWall) {
        this.southWall = southWall;
    }

    public String getNorthWall() {
        return northWall;
    }

    public void setNorthWall(String northWall) {
        this.northWall = northWall;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public boolean isHaveDownRoom() {
        return haveDownRoom;
    }

    public void setHaveDownRoom(boolean haveDownRoom) {
        this.haveDownRoom = haveDownRoom;
    }

    //------------
    private SaleBuild saleBuild;


    public String getDistrictName() {
        return saleBuild.getDistrictName();
    }

    public String getDistrictCode() {
        return saleBuild.getDistrictCode();
    }

    public String getSectionName() {
        return saleBuild.getSectionName();
    }

    public String getSectionCode() {
        return saleBuild.getSectionCode();
    }

    public String getBuildName() {
        return saleBuild.getBuildName();
    }

    public String getBuildCode() {
        return saleBuild.getBuildCode();
    }

    public String getStreetCode() {
        return saleBuild.getStreetCode();
    }

    public String getMapNumber() {
        return saleBuild.getMapNumber();
    }

    public String getBlockNo() {
        return saleBuild.getBlockNo();
    }

    public String getBuildNo() {
        return saleBuild.getBuildNo();
    }

    public String getDoorNo() {
        return saleBuild.getDoorNo();
    }

    public int getFloorCount() {
        return saleBuild.getFloorCount();
    }

    public int getUpFloorCount() {
        return saleBuild.getUpFloorCount();
    }

    public int getDownFloorCount() {
        return saleBuild.getDownFloorCount();
    }

    public String getBuildType() {
        return saleBuild.getBuildType();
    }



    public String getBuildDevNumber() {
        return saleBuild.getBuildDevNumber();
    }

    public String getCompleteYear() {
        return saleBuild.getCompleteYear();
    }

    public String getDeveloperName() {
        return saleBuild.getDeveloperName();
    }

    public String getDeveloperCode() {
        return saleBuild.getDeveloperCode();
    }

    public String getProjectName() {
        return saleBuild.getProjectName();
    }

    public String getProjectCode() {
        return saleBuild.getProjectCode();
    }

    public Date getMapTime() {
        return saleBuild.getMapTime();
    }

    public SaleType getSaleType() {
        return saleType;
    }

    public void setSaleType(SaleType saleType) {
        this.saleType = saleType;
    }

    public String getOwnerCardNumber() {
        return ownerCardNumber;
    }

    public void setOwnerCardNumber(String ownerCardNumber) {
        this.ownerCardNumber = ownerCardNumber;
    }


    public Date getLandEndUseTime() {
        return landEndUseTime;
    }

}

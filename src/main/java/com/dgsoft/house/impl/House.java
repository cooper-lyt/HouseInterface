package com.dgsoft.house.impl;

import com.dgsoft.developersale.SaleBuild;
import com.dgsoft.house.HouseInfo;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by cooper on 9/4/15.
 */
public class House implements HouseInfo {



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
    private String houseType;
    private String useType;
    private String structure;
    private String knotSize;
    private String address;
    private String eastWall;
    private String westWall;
    private String southWall;
    private String northWall;
    private String direction;


    private boolean haveDownRoom;

    public House(SaleBuild saleBuild, JSONObject jsonObject) {
        this.saleBuild = saleBuild;
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
            houseArea = new BigDecimal(jsonObject.getDouble("houseArea"));
        } catch (JSONException e) {
            houseArea = null;
        }
        try {
            useArea = new BigDecimal(jsonObject.getDouble("useArea"));
        } catch (JSONException e) {
            useArea = null;
        }
        try {
            commArea = new BigDecimal(jsonObject.getDouble("commArea"));
        } catch (JSONException e) {
            commArea = null;
        }
        try {
            shineArea = new BigDecimal(jsonObject.getDouble("shineArea"));
        } catch (JSONException e) {
            shineArea = null;
        }
        try {
            loftArea = new BigDecimal(jsonObject.getDouble("loftArea"));
        } catch (JSONException e) {
            loftArea = null;
        }
        try {
            commParam = new BigDecimal(jsonObject.getDouble("commParam"));
        } catch (JSONException e) {
            commParam = null;
        }
        try {
            houseType = jsonObject.getString("houseType");
        } catch (JSONException e) {
            houseType = null;
        }
        try {
            useType = jsonObject.getString("houseType");
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

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
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

    public String getStructure() {
        return saleBuild.getStructure();
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
}

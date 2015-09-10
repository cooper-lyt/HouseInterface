package com.dgsoft.developersale;

import com.dgsoft.house.BuildInfo;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

/**
 * Created by cooper on 9/4/15.
 */
public class SaleBuild implements BuildInfo , java.io.Serializable{

    private String buildName;
    private String buildCode;
    private String mapNumber;
    private String blockNo;
    private String buildNo;
    private String completeYear;
    private String streetCode;

    private String doorNo;
    private Integer unintCount;
    private String buildDevNumber;


    private String buildType;
    private String structure;

    private int upFloorCount;
    private int downFloorCount;

    private Date mapTime;


    private ProjectSellCard projectSellCard;



    public SaleBuild(ProjectSellCard projectSellCard, JSONObject jsonObject) {
        this.projectSellCard = projectSellCard;
        try {
            this.buildName = jsonObject.getString("buildName");
        } catch (JSONException e) {
            this.buildName = null;
        }
        try {
            this.buildCode = jsonObject.getString("buildCode");
        } catch (JSONException e) {
            this.buildCode = null;
        }
        try {
            this.mapNumber = jsonObject.getString("mapNumber");
        } catch (JSONException e) {
            this.mapNumber = null;
        }
        try {
            this.blockNo = jsonObject.getString("blockNo");
        } catch (JSONException e) {
            this.blockNo = null;
        }
        try {
            this.buildNo = jsonObject.getString("buildNo");
        } catch (JSONException e) {
            this.buildNo = null;
        }
        try {
            this.completeYear = jsonObject.getString("completeYear");
        } catch (JSONException e) {
            this.completeYear = null;
        }
        try {
            this.streetCode = jsonObject.getString("streetCode");
        } catch (JSONException e) {
            this.streetCode = null;
        }
        try {
            this.doorNo = jsonObject.getString("doorNo");
        } catch (JSONException e) {
            this.doorNo = null;
        }
        try {
            this.unintCount = jsonObject.getInt("unintCount");
        } catch (JSONException e) {
            this.unintCount = null;
        }
        try {
            this.buildDevNumber = jsonObject.getString("buildDevNumber");
        } catch (JSONException e) {
            this.buildDevNumber = null;
        }
        try {
            this.buildType = jsonObject.getString("buildType");
        } catch (JSONException e) {
            this.buildType = null;
        }
        try {
            this.structure = jsonObject.getString("structure");
        } catch (JSONException e) {
            this.structure = null;
        }
        try {
            this.upFloorCount = jsonObject.getInt("upFloorCount");
        } catch (JSONException e) {
            this.upFloorCount = 0;
        }
        try {
            this.downFloorCount = jsonObject.getInt("downFloorCount");
        } catch (JSONException e) {
            this.downFloorCount = 0;
        }
        try {
            this.mapTime = new Date(jsonObject.getLong("mapTime"));
        } catch (JSONException e) {
            this.mapTime = null;
        }


    }

    public ProjectSellCard getProjectSellCard() {
        return projectSellCard;
    }

    public void setProjectSellCard(ProjectSellCard projectSellCard) {
        this.projectSellCard = projectSellCard;
    }

    public Date getMapTime() {
        return mapTime;
    }

    public void setMapTime(Date mapTime) {
        this.mapTime = mapTime;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getBuildCode() {
        return buildCode;
    }

    public void setBuildCode(String buildCode) {
        this.buildCode = buildCode;
    }

    public String getMapNumber() {
        return mapNumber;
    }

    public void setMapNumber(String mapNumber) {
        this.mapNumber = mapNumber;
    }

    public String getBlockNo() {
        return blockNo;
    }

    public void setBlockNo(String blockNo) {
        this.blockNo = blockNo;
    }

    public String getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(String buildNo) {
        this.buildNo = buildNo;
    }

    public String getCompleteYear() {
        return completeYear;
    }

    public void setCompleteYear(String completeYear) {
        this.completeYear = completeYear;
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public Integer getUnintCount() {
        return unintCount;
    }

    public void setUnintCount(Integer unintCount) {
        this.unintCount = unintCount;
    }

    public String getBuildDevNumber() {
        return buildDevNumber;
    }

    public void setBuildDevNumber(String buildDevNumber) {
        this.buildDevNumber = buildDevNumber;
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public int getUpFloorCount() {
        return upFloorCount;
    }

    public void setUpFloorCount(int upFloorCount) {
        this.upFloorCount = upFloorCount;
    }

    public int getDownFloorCount() {
        return downFloorCount;
    }

    public void setDownFloorCount(int downFloorCount) {
        this.downFloorCount = downFloorCount;
    }

    public int getFloorCount() {
        return getUpFloorCount() + getDownFloorCount();
    }

    public String getDeveloperName() {
        return projectSellCard.getSaleProject().getDeveloperName();
    }

    public String getDeveloperCode() {
        return projectSellCard.getSaleProject().getDeveloperCode();
    }

    public String getProjectName() {
        return projectSellCard.getSaleProject().getProjectName();
    }

    public String getProjectCode() {
        return projectSellCard.getSaleProject().getProjectCode();
    }

    public String getDistrictName() {
        return projectSellCard.getSaleProject().getDistrictName();
    }

    public String getDistrictCode() {
        return projectSellCard.getSaleProject().getDistrictCode();
    }

    public String getSectionName() {
        return projectSellCard.getSaleProject().getSectionName();
    }

    public String getSectionCode() {
        return projectSellCard.getSaleProject().getSectionCode();
    }
}

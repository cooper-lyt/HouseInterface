package com.dgsoft.developersale;

import com.dgsoft.house.ProjectInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cooper on 9/5/15.
 */
public class SaleProject implements ProjectInfo ,java.io.Serializable{


    private String developerName;
    private String developerCode;

    private String projectName;
    private String projectCode;

    private String districtName;
    private String districtCode;

    private String sectionName;
    private String sectionCode;

    private List<ProjectSellCard> projectSellCardList;

    public SaleProject() {
        projectSellCardList = new ArrayList<ProjectSellCard>(0);
    }

    public SaleProject(JSONObject jsonObject,String developerCode, String developerName) {

            this.developerName = developerName;


            this.developerCode = developerCode;

        try {
            this.projectName = jsonObject.getString("projectName");
        } catch (JSONException e) {
            this.projectName = null;
        }
        try {
            this.projectCode = jsonObject.getString("projectCode");
        } catch (JSONException e) {
            this.projectCode = null;
        }
        try {
            this.districtName = jsonObject.getString("districtName");
        } catch (JSONException e) {
            this.districtName = null;
        }
        try {
            this.districtCode = jsonObject.getString("districtCode");
        } catch (JSONException e) {
            this.districtCode = null;
        }
        try {
            this.sectionName = jsonObject.getString("sectionName");
        } catch (JSONException e) {
            this.sectionName = null;
        }
        try {
            this.sectionCode = jsonObject.getString("sectionCode");
        } catch (JSONException e) {
            this.sectionCode = null;
        }


        try {
            JSONArray saleCards = jsonObject.getJSONArray("saleCards");
            projectSellCardList = new ArrayList<ProjectSellCard>(saleCards.length());
            for(int i = 0; i < saleCards.length(); i++){
                projectSellCardList.add(new ProjectSellCard(this,saleCards.getJSONObject(i)));
            }
        } catch (JSONException e) {
            projectSellCardList = new ArrayList<ProjectSellCard>(0);
        }

    }


    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getDeveloperCode() {
        return developerCode;
    }

    public void setDeveloperCode(String developerCode) {
        this.developerCode = developerCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    public List<ProjectSellCard> getProjectSellCardList() {
        return projectSellCardList;
    }

    public void setProjectSellCardList(List<ProjectSellCard> projectSellCardList) {
        this.projectSellCardList = projectSellCardList;
    }

    public List<SaleBuild> getSaleBuildList(){
        List<SaleBuild> result = new ArrayList<SaleBuild>();
        for(ProjectSellCard sellCard: getProjectSellCardList()){
            result.addAll(sellCard.getSaleBuildList());
        }
        return result;
    }
}

package com.dgsoft.developersale;

import com.dgsoft.house.SaleType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by cooper on 9/5/15.
 */
public class ProjectSellCard implements  java.io.Serializable{

    private SaleType cardType;
    private String  cardNumber;
    private String address;
    private String landCardType;
    private String landCardNumber;
    private BigDecimal landArea;
    private String landUseType;
    private Date landEndUseTime;

    private String landGetMode;
    private String landAddress;

    private String createCardNumber;
    private String createPrepareCardNumber;
    private String developerName;
    private String name;
    private String mappingCropName;

    private SaleProject saleProject;

    private List<SaleBuild> saleBuildList;

    public ProjectSellCard() {
    }

    public ProjectSellCard(SaleProject saleProject,JSONObject jsonObject) {
        this.saleProject = saleProject;

        try {
            this.mappingCropName = jsonObject.getString("mappingCropName");
        } catch (JSONException e) {
            this.mappingCropName = null;
        }

        try {
            this.developerName = jsonObject.getString("developerName");
        } catch (JSONException e) {
            this.developerName = null;
        }

        try {
            this.cardType = SaleType.valueOf(jsonObject.getString("cardType"));
        } catch (JSONException e) {
            this.cardType = null;
        }
        try {
            this.cardNumber = jsonObject.getString("cardNumber");
        } catch (JSONException e) {
            this.cardNumber = null;
        }
        try {
            this.address = jsonObject.getString("address");
        } catch (JSONException e) {
            this.address = null;
        }
        try {
            this.landCardType = jsonObject.getString("landCardType");
        } catch (JSONException e) {
            this.landCardType = null;
        }
        try {
            this.landCardNumber = jsonObject.getString("landCardNumber");
        } catch (JSONException e) {
            this.landCardNumber = null;
        }
        try {
            this.landArea = new BigDecimal(jsonObject.getDouble("landArea"));
        } catch (JSONException e) {
            this.landArea = null;
        }
        try {
            this.landUseType = jsonObject.getString("landUseType");
        } catch (JSONException e) {
            this.landUseType = null;
        }
        try {
            this.landEndUseTime = new Date(jsonObject.getLong("landEndUseTime"));
        } catch (JSONException e) {
            this.landEndUseTime = null;
        }

        try {
            this.landGetMode = jsonObject.getString("landGetMode");
        } catch (JSONException e) {
            this.landGetMode = null;
        }

        try {
            this.landAddress = jsonObject.getString("landAddress");
        } catch (JSONException e) {
            this.landAddress = null;
        }

        try {
            this.createCardNumber = jsonObject.getString("createCardNumber");
        } catch (JSONException e) {
            this.createCardNumber = null;
        }
        try {
            this.createPrepareCardNumber = jsonObject.getString("createPrepareCardNumber");
        } catch (JSONException e) {
            this.createPrepareCardNumber = null;
        }


        try {
            this.name = jsonObject.getString("name");
        } catch (JSONException e) {
            this.name = null;
        }
        try {
            JSONArray saleBuilds = jsonObject.getJSONArray("saleBuilds");
            saleBuildList = new ArrayList<SaleBuild>(saleBuilds.length());
            for(int i = 0; i < saleBuilds.length(); i++){
                saleBuildList.add(new SaleBuild(this,saleBuilds.getJSONObject(i)));
            }
        } catch (JSONException e) {
            saleBuildList = new ArrayList<SaleBuild>(0);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SaleBuild> getSaleBuildList() {
        return saleBuildList;
    }

    public void setSaleBuildList(List<SaleBuild> saleBuildList) {
        this.saleBuildList = saleBuildList;
    }

    public SaleProject getSaleProject() {
        return saleProject;
    }

    public void setSaleProject(SaleProject saleProject) {
        this.saleProject = saleProject;
    }

    public SaleType getCardType() {
        return cardType;
    }

    public void setCardType(SaleType cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLandCardType() {
        return landCardType;
    }

    public void setLandCardType(String landCardType) {
        this.landCardType = landCardType;
    }

    public String getLandCardNumber() {
        return landCardNumber;
    }

    public void setLandCardNumber(String landCardNumber) {
        this.landCardNumber = landCardNumber;
    }

    public BigDecimal getLandArea() {
        return landArea;
    }

    public void setLandArea(BigDecimal landArea) {
        this.landArea = landArea;
    }

    public String getLandUseType() {
        return landUseType;
    }

    public void setLandUseType(String landUseType) {
        this.landUseType = landUseType;
    }

    public Date getLandEndUseTime() {
        return landEndUseTime;
    }

    public void setLandEndUseTime(Date landEndUseTime) {
        this.landEndUseTime = landEndUseTime;
    }


    public String getCreateCardNumber() {
        return createCardNumber;
    }

    public void setCreateCardNumber(String createCardNumber) {
        this.createCardNumber = createCardNumber;
    }

    public String getCreatePrepareCardNumber() {
        return createPrepareCardNumber;
    }

    public void setCreatePrepareCardNumber(String createPrepareCardNumber) {
        this.createPrepareCardNumber = createPrepareCardNumber;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getLandGetMode() {
        return landGetMode;
    }

    public void setLandGetMode(String landGetMode) {
        this.landGetMode = landGetMode;
    }

    public String getLandAddress() {
        return landAddress;
    }

    public void setLandAddress(String landAddress) {
        this.landAddress = landAddress;
    }

    public String getMappingCropName() {
        return mappingCropName;
    }

    public void setMappingCropName(String mappingCropName) {
        this.mappingCropName = mappingCropName;
    }
}

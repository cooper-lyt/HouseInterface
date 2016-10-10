package com.dgsoft.developersale;

import com.dgsoft.house.AttachCorpInfo;
import com.dgsoft.house.AttachCorpType;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

/**
 * Created by cooper on 9/18/15.
 */
public class JsonAttachCorp implements AttachCorpInfo{

    private JSONObject jsonObject;

    public JsonAttachCorp(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public String getName() {
        try {
            return jsonObject.getString("name");
        } catch (JSONException e) {
            return null;
        }
    }

    public String getAddress() {
        try {
            return jsonObject.getString("address");
        } catch (JSONException e) {
            return null;
        }
    }

    public String getPostCode() {
        try {
            return jsonObject.getString("postCode");
        } catch (JSONException e) {
            return null;
        }
    }

    public String getLicenseNumber() {
        try {
            return jsonObject.getString("licenseNumber");
        } catch (JSONException e) {
            return null;
        }
    }

    public String getCerCode() {
        try {
            return jsonObject.getString("cerCode");
        } catch (JSONException e) {
            return null;
        }
    }

    public String getOwnerPerson() {
        try {
            return jsonObject.getString("ownerPerson");
        } catch (JSONException e) {
            return null;
        }
    }

    public String getOwnerTel() {
        try {
            return jsonObject.getString("ownerTel");
        } catch (JSONException e) {
            return null;
        }
    }

    public Date getDateTo() {
        try {
            return new Date(jsonObject.getLong("checkDateTo"));
        }catch (JSONException e){
            return null;
        }
    }

    public int getServiceDay() {
        return (int) ((getDateTo().getTime() - new Date().getTime()) / (1000*3600*24));
    }

    public AttachCorpType getAttachCorpType() {
        try {
            return AttachCorpType.valueOf(jsonObject.getString("type"));
        } catch (JSONException e) {
            return null;
        }
    }


}

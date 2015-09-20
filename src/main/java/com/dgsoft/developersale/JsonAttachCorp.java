package com.dgsoft.developersale;

import com.dgsoft.house.AttachCorpInfo;
import org.json.JSONException;
import org.json.JSONObject;

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
}

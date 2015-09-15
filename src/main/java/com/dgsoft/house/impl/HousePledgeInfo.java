package com.dgsoft.house.impl;

import com.dgsoft.house.PledgeInfo;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

/**
 * Created by cooper on 9/15/15.
 */
public class HousePledgeInfo implements PledgeInfo {

    private JSONObject jsonObject;

    public HousePledgeInfo(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public String getType() {
        try {
            return jsonObject.getString("type");
        } catch (JSONException e) {
            return null;
        }
    }

    public String getOwnerPersonName() {
        try {
            return jsonObject.getString("ownerPersonName");
        } catch (JSONException e) {
            return null;
        }
    }

    public String getPledgePersonName() {
        try {
            return jsonObject.getString("pledgePersonName");
        } catch (JSONException e) {
            return null;
        }
    }

    public String getPledgeCorpName() {
        try {
            return jsonObject.getString("pledgeCorpName");
        } catch (JSONException e) {
            return null;
        }
    }

    public Date getBeginTime() {
        try {
            return new Date(jsonObject.getLong("beginTime"));
        } catch (JSONException e) {
            return null;
        }
    }

    public Date getEndTime() {
        try {
            return new Date(jsonObject.getLong("endTime"));
        } catch (JSONException e) {
            return null;
        }
    }
}

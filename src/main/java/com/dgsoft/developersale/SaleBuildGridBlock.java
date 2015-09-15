package com.dgsoft.developersale;

import com.dgsoft.house.BuildGridMapBlockInfo;
import com.dgsoft.house.HouseInfo;
import com.dgsoft.house.impl.House;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by cooper on 9/7/15.
 */
public class SaleBuildGridBlock implements BuildGridMapBlockInfo {

    private int colspan;

    private int rowspan;

    private HouseInfo house;

    private String status;

    public SaleBuildGridBlock(JSONObject jsonObject) {
        try {
            this.colspan = jsonObject.getInt("colspan");
        } catch (JSONException e) {
            this.colspan = 1;
        }
        try {
            this.rowspan = jsonObject.getInt("rowspan");
        } catch (JSONException e) {
            this.rowspan = 1;
        }

        try {
            this.status = jsonObject.getString("status");
        } catch (JSONException e) {
            this.status = null;
        }

        try {
            this.locked = jsonObject.getBoolean("locked");
        } catch (JSONException e) {
            this.locked = false;
        }

        try {
            JSONObject houseJsonObj = jsonObject.getJSONObject("house");
            if (houseJsonObj == null){
                this.house = null;
            }else {
                this.house = new House(houseJsonObj);
            }
        } catch (JSONException e) {
            this.house = null;
        }

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public HouseInfo getHouse() {
        return house;
    }

    public void setHouse(HouseInfo house) {
        this.house = house;
    }

    public int getRowspan() {
        return rowspan;
    }

    public void setRowspan(int rowspan) {
        this.rowspan = rowspan;
    }

    public int getColspan() {
        return colspan;
    }

    public void setColspan(int colspan) {
        this.colspan = colspan;
    }

    private boolean locked;
}

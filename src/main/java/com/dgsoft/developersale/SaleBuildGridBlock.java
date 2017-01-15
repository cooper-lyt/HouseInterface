package com.dgsoft.developersale;

import com.dgsoft.house.BuildGridMapBlockInfo;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by cooper on 9/7/15.
 */
public class SaleBuildGridBlock implements BuildGridMapBlockInfo {


    private int colspan;

    private int rowspan;

    private SaleHouse house;


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
            JSONObject houseJsonObj = jsonObject.getJSONObject("house");
            if (houseJsonObj == null){
                this.house = null;
            }else {
                this.house = new SaleHouse(houseJsonObj);
            }
        } catch (JSONException e) {
            this.house = null;
        }



    }

    public SaleHouse getHouse() {
        return house;
    }

    public void setHouse(SaleHouse house) {
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
}

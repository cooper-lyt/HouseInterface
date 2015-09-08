package com.dgsoft.developersale;

import com.dgsoft.house.BuildGridMapBlockInfo;
import com.dgsoft.house.BuildGridMapInfo;
import com.dgsoft.house.BuildGridMapRowInfo;
import com.dgsoft.house.BuildGridMapTitleInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cooper on 9/7/15.
 */
public class SaleBuildGridMap implements BuildGridMapInfo {

    private String name;

    private List<BuildGridMapTitleInfo> titles;

    private List<BuildGridMapRowInfo> rows;

    public SaleBuildGridMap(JSONObject jsonObject) {
        try {
            this.name = jsonObject.getString("name");
        } catch (JSONException e) {
            this.name = null;
        }
        try {
            JSONArray titleJsonArray = jsonObject.getJSONArray("titles");
            titles = new ArrayList<BuildGridMapTitleInfo>(titleJsonArray.length());
            for(int i =0 ; i < titleJsonArray.length(); i++){

                titles.add(new SaleBuildGridMapTitle(titleJsonArray.getJSONObject(i)));
            }

        } catch (JSONException e) {
            titles = new ArrayList<BuildGridMapTitleInfo>(0);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BuildGridMapTitleInfo> getTitles() {
        return titles;
    }

    public void setTitles(List<BuildGridMapTitleInfo> titles) {
        this.titles = titles;
    }

    public List<BuildGridMapRowInfo> getRows() {
        return rows;
    }

    public void setRows(List<BuildGridMapRowInfo> rows) {
        this.rows = rows;
    }
}

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
public class SaleBuildGridMap implements BuildGridMapInfo,java.io.Serializable {

    private String name;

    private List<BuildGridMapTitleInfo> titles;

    private List<BuildGridMapRowInfo> rows;

    private int pageIndex;

    public SaleBuildGridMap(int pageIndex, JSONObject jsonObject) {
        this.pageIndex = pageIndex;
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


        try {
            JSONArray titleJsonArray = jsonObject.getJSONArray("rows");
            rows = new ArrayList<BuildGridMapRowInfo>(titleJsonArray.length());
            for(int i =0 ; i < titleJsonArray.length(); i++){

                rows.add(new SaleBuildGridMapRow(titleJsonArray.getJSONObject(i)));
            }

        } catch (JSONException e) {
            rows = new ArrayList<BuildGridMapRowInfo>(0);
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


    public int getColCount(){
        int result = 0;
        for (BuildGridMapTitleInfo title : getTitles()) {
            result += title.getColspan();
        }
        return result;
    }

    public List<BuildGridMapTitleInfo> getUnitTitles(){
        List<BuildGridMapTitleInfo> result = new ArrayList<BuildGridMapTitleInfo>(getTitles());
        if (!result.isEmpty())
            result.remove(0);
        return result;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }
}

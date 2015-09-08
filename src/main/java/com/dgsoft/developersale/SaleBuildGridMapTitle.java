package com.dgsoft.developersale;

import com.dgsoft.house.BuildGridMapTitleInfo;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by cooper on 9/7/15.
 */
public class SaleBuildGridMapTitle implements BuildGridMapTitleInfo {

    private String title;

    private int colspan;

    public SaleBuildGridMapTitle(JSONObject jsonObject) {
        try {
            this.title = jsonObject.getString("title");
        } catch (JSONException e) {
            this.title = null;
        }
        try {
            this.colspan = jsonObject.getInt("colspan");
        } catch (JSONException e) {
            this.colspan = 1;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getColspan() {
        return colspan;
    }

    public void setColspan(int colspan) {
        this.colspan = colspan;
    }
}

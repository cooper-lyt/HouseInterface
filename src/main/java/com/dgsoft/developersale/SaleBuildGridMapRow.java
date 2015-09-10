package com.dgsoft.developersale;

import com.dgsoft.house.BuildGridMapBlockInfo;
import com.dgsoft.house.BuildGridMapRowInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cooper on 9/7/15.
 */
public class SaleBuildGridMapRow implements BuildGridMapRowInfo,java.io.Serializable {

    private String title;
    private List<BuildGridMapBlockInfo> blocks;

    public SaleBuildGridMapRow(JSONObject jsonObject) {
        try {
            this.title = jsonObject.getString("title");
        } catch (JSONException e) {
            this.title = null;
        }
        try {
            JSONArray blockArray  = jsonObject.getJSONArray("blocks");
            blocks = new ArrayList<BuildGridMapBlockInfo>(blockArray.length());
            for(int i =0 ; i < blockArray.length(); i++){
                blocks.add(new SaleBuildGridBlock(blockArray.getJSONObject(i)));
            }
        } catch (JSONException e) {
            blocks = new ArrayList<BuildGridMapBlockInfo>(0);
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<BuildGridMapBlockInfo> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<BuildGridMapBlockInfo> blocks) {
        this.blocks = blocks;
    }
}

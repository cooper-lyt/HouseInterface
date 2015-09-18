package com.dgsoft.common.system;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by cooper on 9/18/15.
 */
public class JsonDictionaryWord implements DictionaryWord{

    private JSONObject jsonObject;

    public JsonDictionaryWord(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public String getId() {
        try {
            return jsonObject.getString("ID");
        } catch (JSONException e) {
            return null;
        }
    }

    public String getKey() {
        try {
            return jsonObject.getString("KEY");
        } catch (JSONException e) {
            return null;
        }
    }

    public String getValue() {
        try {
            return jsonObject.getString("VALUE");
        } catch (JSONException e) {
            return null;
        }
    }

    public String getDescription() {
        try {
            return jsonObject.getString("DESCRIPTION");
        } catch (JSONException e) {
            return null;
        }
    }
}

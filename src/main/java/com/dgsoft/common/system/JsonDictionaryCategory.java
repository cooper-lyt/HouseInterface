package com.dgsoft.common.system;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cooper on 9/18/15.
 */
public class JsonDictionaryCategory implements DictionaryCategory{

    private JSONArray jsonArray;
    private String id;

    public JsonDictionaryCategory(String id, JSONArray jsonArray) {
        this.jsonArray = jsonArray;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<DictionaryWord> getWordList() {
        List<DictionaryWord> result = new ArrayList<DictionaryWord>(jsonArray.length());
        for(int i = 0 ; i < jsonArray.length(); i++){
            try {
                result.add(new JsonDictionaryWord(jsonArray.getJSONObject(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

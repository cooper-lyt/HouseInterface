package com.dgsoft.common.system;

import com.dgsoft.common.system.wsinterface.WordDictionaryServiceService;
import org.json.JSONArray;
import org.json.JSONException;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cooper on 9/18/15.
 */
public abstract class DictionaryService {

    protected abstract String getWsdlLocation();


    private WordDictionaryServiceService webService;

    public DictionaryService() throws MalformedURLException {
        webService = new WordDictionaryServiceService(getWsdlLocation());
    }

    public List<DictionaryWord> getWordList(String categoryId){
        try {

            JSONArray jsonArray = new JSONArray(webService.getWordDictionaryServicePort().getDictionaryWords(categoryId));

             List<DictionaryWord> result = new ArrayList<DictionaryWord>(jsonArray.length());
            for(int i = 0 ; i < jsonArray.length(); i++){
                result.add(new JsonDictionaryWord(jsonArray.getJSONObject(i)));
            }
            return result;

        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String getWordValue(String wordId){
        return webService.getWordDictionaryServicePort().getDictionaryWordValue(wordId);
    }


}

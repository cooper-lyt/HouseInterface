package com.dgsoft.common.system;

import java.util.List;

/**
 * Created by cooper on 9/18/15.
 */
public interface DictionaryCategory {

    String getId();

    List<DictionaryWord>  getWordList();
}

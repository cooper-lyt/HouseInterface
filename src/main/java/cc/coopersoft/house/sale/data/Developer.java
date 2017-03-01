package cc.coopersoft.house.sale.data;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by cooper on 01/03/2017.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "type")
public class Developer extends CorpInfo {
}

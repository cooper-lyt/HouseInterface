package com.dgsoft.house;

import java.util.Date;

/**
 * Created by cooper on 9/4/15.
 */
public interface CorpInfo {

    Date getRecordDate();
    String getAddress();
    String getOwnerTel();
    String getOwnerName();

    String getPostCode();

    String getLicenseNumber();
    String getCerCode();

    Date getDateTo();

    String getName();

}

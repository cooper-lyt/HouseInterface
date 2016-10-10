package com.dgsoft.house;

import java.util.Date;

/**
 * Created by cooper on 9/18/15.
 */
public interface AttachCorpInfo {

    String getName();

    String getAddress();

    String getPostCode();

    String getLicenseNumber();

    String getCerCode();

    String getOwnerPerson();

    String getOwnerTel();

    Date getDateTo();

    int getServiceDay();

    AttachCorpType getAttachCorpType();


}

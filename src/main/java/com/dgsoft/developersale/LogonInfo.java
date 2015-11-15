package com.dgsoft.developersale;

import com.dgsoft.house.AttachCorpInfo;

/**
 * Created by cooper on 9/15/15.
 */
public interface LogonInfo {

    LogonStatus getLogonStatus();

    String getEmployeeName();

    String getOrgName();

    String getGroupCode();

    String getGroupName();

    String getUserId();

    String getSessionKey();

    AttachCorpInfo getAttachCorpInfo();
}

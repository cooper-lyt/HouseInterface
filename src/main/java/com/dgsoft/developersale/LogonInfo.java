package com.dgsoft.developersale;

/**
 * Created by cooper on 9/15/15.
 */
public interface LogonInfo {

    LogonStatus getLogonStatus();

    String getEmployeeName();

    String getCorpName();

    String getOrgName();

    String getGroupCode();
}

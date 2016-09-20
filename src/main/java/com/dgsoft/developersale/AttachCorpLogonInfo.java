package com.dgsoft.developersale;

import com.dgsoft.house.AttachCorpInfo;

/**
 * Created by cooper on 9/20/16.
 */
public class AttachCorpLogonInfo implements java.io.Serializable, LogonInfo {
    protected LogonStatus logonStatus;
    protected AttachCorpInfo attachCorpInfo;
    private String sessionKey;
    private String employeeName;
    private String orgName;
    private String userId;
    private String groupName;
    private String groupCode;

    public AttachCorpLogonInfo(AttachCorpInfo attachCorpInfo, LogonStatus logonStatus) {
        this.attachCorpInfo = attachCorpInfo;
        this.logonStatus = logonStatus;
    }

    public LogonStatus getLogonStatus() {
        return logonStatus;
    }

    public void setLogonStatus(LogonStatus logonStatus) {
        this.logonStatus = logonStatus;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public AttachCorpInfo getAttachCorpInfo() {
        return attachCorpInfo;
    }

    public void setAttachCorpInfo(AttachCorpInfo attachCorpInfo) {
        this.attachCorpInfo = attachCorpInfo;
    }

    public String getOrgName() {
        return orgName;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

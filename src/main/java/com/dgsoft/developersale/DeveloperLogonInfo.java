package com.dgsoft.developersale;

import com.dgsoft.house.AttachCorpInfo;

/**
 * Created by cooper on 9/7/15.
 */
public class DeveloperLogonInfo implements java.io.Serializable, LogonInfo{

    private LogonStatus logonStatus;

    private String sessionKey;

    private String employeeName;

    private String orgName;

    private SaleProject saleProject;

    private String userId;

    private AttachCorpInfo attachCorpInfo;


    public DeveloperLogonInfo(LogonStatus logonStatus) {
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
        return getSaleProject().getProjectCode();
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public SaleProject getSaleProject() {
        return saleProject;
    }

    public void setSaleProject(SaleProject saleProject) {
        this.saleProject = saleProject;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

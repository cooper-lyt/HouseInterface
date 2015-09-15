package com.dgsoft.developersale;

/**
 * Created by cooper on 9/7/15.
 */
public class DeveloperLogonInfo implements java.io.Serializable, LogonInfo{

    private LogonStatus logonStatus;

    private String sessionKey;

    private String employeeName;

    private String corpName;

    private String orgName;

    private SaleProject saleProject;


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

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
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
}

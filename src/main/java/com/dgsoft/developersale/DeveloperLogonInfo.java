package com.dgsoft.developersale;

import com.dgsoft.house.AttachCorpInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by cooper on 9/7/15.
 */
public class DeveloperLogonInfo implements java.io.Serializable, LogonInfo{

    private LogonStatus logonStatus;

    private String sessionKey;

    private String employeeName;

    private String orgName;

    private List<SaleProject> saleProjects;

    private String userId;

    private AttachCorpInfo attachCorpInfo;

    private String groupName;

    private String groupCode;

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

    public List<SaleProject> getSaleProjects() {
        return saleProjects;
    }

    public void setSaleProjects(List<SaleProject> saleProjects) {
        this.saleProjects = saleProjects;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<SaleBuild> getSaleBuildList(){
        List<SaleBuild> result = new ArrayList<SaleBuild>();
        for(SaleProject project: getSaleProjects()){
            result.addAll(project.getSaleBuildList());
        }
        Collections.sort(result, new Comparator<SaleBuild>() {
            public int compare(SaleBuild o1, SaleBuild o2) {
                int result = o1.getProjectCode().compareTo(o2.getProjectCode());
                if (result == 0){
                    return o1.getBuildCode().compareTo(o2.getBuildCode());
                }else{
                    return result;
                }
            }
        });
        return result;
    }
}

package com.dgsoft.developersale;

import com.dgsoft.house.AttachCorpInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by cooper on 9/7/15.
 */
public class DeveloperLogonInfo extends AttachCorpLogonInfo {

    private List<SaleProject> saleProjects;

    public DeveloperLogonInfo(AttachCorpInfo attachCorpInfo, LogonStatus logonStatus) {
        super(attachCorpInfo, logonStatus);
    }

    public List<SaleProject> getSaleProjects() {
        return saleProjects;
    }

    public void setSaleProjects(List<SaleProject> saleProjects) {
        this.saleProjects = saleProjects;
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

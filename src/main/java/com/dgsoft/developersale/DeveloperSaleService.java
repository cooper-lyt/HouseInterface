package com.dgsoft.developersale;

import com.dgsoft.developersale.wsinterface.DESUtil;
import com.dgsoft.developersale.wsinterface.DeveloperServiceService;

import java.util.ArrayList;
import java.util.List;

import com.dgsoft.house.AttachCorpInfo;
import com.dgsoft.house.AttachCorpType;
import com.dgsoft.house.SaleType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by cooper on 9/7/15.
 */
public abstract class DeveloperSaleService {

    protected abstract String getWsdlLocation();

    protected DeveloperServiceService webService;

    public DeveloperSaleService() {
        webService = new DeveloperServiceService(getWsdlLocation());
    }

    public AttachCorpLogonInfo logon(String userId, String password, String random) {

        try {
            String data = webService.getDeveloperServicePort().logon(userId, password, random);
            if (data == null) {
                return null;
            }
            String resultStr = DESUtil.decrypt(data, userId);

            JSONObject resultJsonObject = new JSONObject(resultStr);

            LogonStatus logonStatus = LogonStatus.valueOf(resultJsonObject.getString("logonStatus"));

            if (!logonStatus.equals(LogonStatus.LOGON)){
                return new AttachCorpLogonInfo(null,logonStatus);
            }

            AttachCorpInfo attachCorpInfo = new JsonAttachCorp(resultJsonObject.getJSONObject("attachCorpInfo"));

            AttachCorpLogonInfo result;

            if (AttachCorpType.DEVELOPER.equals(attachCorpInfo.getAttachCorpType())){
                result = new DeveloperLogonInfo(attachCorpInfo,logonStatus);

                List<SaleProject> saleProjects = new ArrayList<SaleProject>();


                JSONArray projectArray = resultJsonObject.getJSONArray("projects");
                for(int i = 0; i < projectArray.length(); i++){
                    saleProjects.add(new SaleProject(projectArray.getJSONObject(i),result.getGroupCode(),result.getGroupName()));

                }
                ((DeveloperLogonInfo)result).setSaleProjects(saleProjects);
            }else if (AttachCorpType.AGENCIES.equals(attachCorpInfo.getAttachCorpType())){
                result = new AgenciesLogonInfo(attachCorpInfo,logonStatus);
            }else{
                return null;
            }




            result.setSessionKey(resultJsonObject.getString("sessionKey"));
            result.setEmployeeName(resultJsonObject.getString("employeeName"));
            //result.setCorpName(resultJsonObject.getString("corpName"));
            result.setOrgName(resultJsonObject.getString("orgName"));

            result.setGroupName(resultJsonObject.getString("groupName"));
            result.setGroupCode(resultJsonObject.getString("groupCode"));


            result.setUserId(userId);

            return result;



        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<SaleBuildGridMap> getBuildGridMap(String buildCode){

        String data = webService.getDeveloperServicePort().getBuildGridMap(buildCode);
        if (data == null){
            return null;
        }
        try {

            JSONArray buildJsonArray = new JSONArray(data);
            List<SaleBuildGridMap> result = new ArrayList<SaleBuildGridMap>(buildJsonArray.length());
            for (int i = 0 ; i < buildJsonArray.length(); i++){
                result.add(new SaleBuildGridMap(i,buildJsonArray.getJSONObject(i)));
            }
            return result;

        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public List<String> applyContractNumber(LogonInfo logonInfo, int count , SaleType type){
        String data = webService.getDeveloperServicePort().applyContractNumber(logonInfo.getUserId(), count, type.name());
        if (data == null){
            return null;
        }
        try {
            String resultStr = DESUtil.decrypt(data, logonInfo.getSessionKey());
            JSONArray jsonArray = new JSONArray(resultStr);
            List<String> result = new ArrayList<String>(jsonArray.length());
            for (int i = 0 ; i < jsonArray.length(); i++){
                result.add(jsonArray.getString(i));
            }
            return result;

        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }


    public SaleHouse getHouseInfoBySale(DeveloperLogonInfo logonInfo, String houseCode){
        String data = webService.getDeveloperServicePort().getHouseInfoBySale(logonInfo.getUserId(), houseCode);
        if (data == null){
            return null;
        }
        try {
            String resultStr = DESUtil.decrypt(data, logonInfo.getSessionKey());

            JSONObject jsonObject = new JSONObject(resultStr);
            SaleBuild saleBuild = null;
            for (SaleProject project: logonInfo.getSaleProjects()){
                for(SaleBuild build: project.getSaleBuildList()){
                    if (build.getBuildCode().equals(jsonObject.getString("buildCode"))){
                        saleBuild = build;
                        break;
                    }
                }
                if (saleBuild != null){
                    break;
                }
            }


            return new SaleHouse(saleBuild,jsonObject);

        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

}

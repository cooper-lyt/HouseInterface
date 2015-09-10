package com.dgsoft.developersale;

import com.dgsoft.developersale.wsinterface.DESUtil;
import com.dgsoft.developersale.wsinterface.DeveloperServiceService;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;

/**
 * Created by cooper on 9/7/15.
 */
public abstract class DeveloperSaleService {

    protected abstract String getWsdlLocation();

    private DeveloperServiceService webService;

    public DeveloperSaleService() throws MalformedURLException {
        webService = new DeveloperServiceService(getWsdlLocation());
    }

    public LogonInfo logon(String userId, String password, String random) {

        try {
            String data = webService.getDeveloperServicePort().logon(userId, password, random);
            if (data == null) {
                return null;
            }
            String resultStr = DESUtil.decrypt(data, userId);

            JSONObject resultJsonObject = new JSONObject(resultStr);

            LogonInfo result = new LogonInfo(LogonStatus.valueOf(resultJsonObject.getString("logonStatus")));
            if (!result.getLogonStatus().equals(LogonStatus.LOGON)){
                return result;
            }

            result.setSessionKey(resultJsonObject.getString("sessionKey"));
            result.setEmployeeName(resultJsonObject.getString("employeeName"));
            result.setCorpName(resultJsonObject.getString("corpName"));
            result.setOrgName(resultJsonObject.getString("orgName"));
            result.setSaleProject(new SaleProject(resultJsonObject.getJSONObject("project")));

            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
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
                result.add(new SaleBuildGridMap(buildJsonArray.getJSONObject(i)));
            }
            return result;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

}

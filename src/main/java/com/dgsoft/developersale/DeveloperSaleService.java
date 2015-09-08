package com.dgsoft.developersale;

import com.dgsoft.developersale.wsinterface.DESUtil;
import com.dgsoft.developersale.wsinterface.DeveloperServiceService;
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

    public LogonInfo logon(String userKey, String userId, String password, String random) {

        try {
            String data = webService.getDeveloperServicePort().logon(userId, password, random);
            if (data == null) {
                return null;
            }
            String resultStr = DESUtil.decrypt(data, userKey);

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
            return null;
        }
    }

}

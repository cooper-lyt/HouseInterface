package cc.coopersoft.house.sale.data;

import com.dgsoft.developersale.LogonStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by cooper on 01/03/2017.
 */
public class LoginResult {

    private LogonStatus logonStatus;

    private String token;

    private CorpInfo corpInfo;

    private AttrEmp attrEmp;

    private String key;

    @JsonProperty("result")
    public LogonStatus getLogonStatus() {
        return logonStatus;
    }

    public void setLogonStatus(LogonStatus logonStatus) {
        this.logonStatus = logonStatus;
    }

    @JsonProperty("corp")
    public CorpInfo getCorpInfo() {
        return corpInfo;
    }

    public void setCorpInfo(CorpInfo corpInfo) {
        this.corpInfo = corpInfo;
    }

    @JsonProperty("emp")
    public AttrEmp getAttrEmp() {
        return attrEmp;
    }

    public void setAttrEmp(AttrEmp attrEmp) {
        this.attrEmp = attrEmp;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

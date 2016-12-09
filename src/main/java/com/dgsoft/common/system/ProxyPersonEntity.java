package com.dgsoft.common.system;

import cc.coopersoft.house.ProxyType;

/**
 * Created by cooper on 24/11/2016.
 */
public interface ProxyPersonEntity extends PersonEntity {

    ProxyType getProxyType();

    void setProxyType(ProxyType proxyType);

    public String getPhone();

    public void setPhone(String phone);

}

package com.dgsoft.common.system;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by cooper on 9/29/16.
 */
public interface OwnerPersonEntity extends PersonEntity{

    ProxyPersonEntity getPowerProxyPerson();

    void setPowerProxyPerson(ProxyPersonEntity proxyPerson);


}

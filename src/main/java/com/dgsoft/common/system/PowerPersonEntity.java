package com.dgsoft.common.system;

/**
 * Created by cooper on 24/11/2016.
 */
public interface PowerPersonEntity extends OwnerPersonEntity {

    ProxyPersonEntity getPowerProxyPerson();

    void setPowerProxyPerson(ProxyPersonEntity proxyPerson);


}

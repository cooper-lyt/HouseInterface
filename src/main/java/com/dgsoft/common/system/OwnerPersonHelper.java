package com.dgsoft.common.system;

import cc.coopersoft.house.ProxyType;

import java.math.BigDecimal;

/**
 * Created by cooper on 9/29/16.
 */
public abstract class OwnerPersonHelper<T extends OwnerPersonEntity> extends PersonHelper<T> {


    protected abstract ProxyPersonEntity createProxyPerson();

    private PersonHelper<ProxyPersonEntity> proxyPersonHelper;

    public OwnerPersonHelper(T entity) {
        super(entity);
        if (entity.getPowerProxyPerson() != null){
            proxyPersonHelper = new PersonHelper<ProxyPersonEntity>(entity.getPowerProxyPerson());
        }else{
            proxyPersonHelper = new PersonHelper<ProxyPersonEntity>();
        }
    }

    public ProxyType getProxyType() {
        if (getPersonEntity().getPowerProxyPerson() == null){
            return null;
        }else{
            return getPersonEntity().getPowerProxyPerson().getProxyType();
        }

    }

    public void setProxyType(ProxyType proxyType) {
        if (proxyType == null){
            getPersonEntity().setPowerProxyPerson(null);
            proxyPersonHelper.setPersonEntity(null);
        }else{
            if (getPersonEntity().getPowerProxyPerson() == null){
                //new PowerProxyPerson(getPersonEntity())
                getPersonEntity().setPowerProxyPerson(createProxyPerson());
                proxyPersonHelper.setPersonEntity( getPersonEntity().getPowerProxyPerson());
            }
            getPersonEntity().getPowerProxyPerson().setProxyType(proxyType);
        }
    }

    public PersonHelper<ProxyPersonEntity> getProxyPersonHelper() {
        return proxyPersonHelper;
    }



}

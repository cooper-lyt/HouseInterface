package com.dgsoft.common.system;

import java.util.UUID;

/**
 * Created by cooper on 9/19/14.
 */
public class PersonHelper<E extends PersonEntity>  {

    private String uuid;


    public PersonHelper(E entity) {
        this.entity = entity;
        uuid = UUID.randomUUID().toString().replace("-","").toUpperCase();
        if (entity.getCredentialsType() == null){
            entity.setCredentialsType(PersonEntity.CredentialsType.MASTER_ID);
        }

    }

    public PersonHelper() {
        uuid = UUID.randomUUID().toString().replace("-","").toUpperCase();
    }

    private E entity;

    public E getPersonEntity() {
        return entity;
    }

    public void setPersonEntity(E entity){
        this.entity = entity;
        if (entity != null && entity.getCredentialsType() == null){
            entity.setCredentialsType(PersonEntity.CredentialsType.MASTER_ID);
        }
    }

    public PersonEntity.CredentialsType getCredentialsType() {
        return getPersonEntity().getCredentialsType();
    }

    public void setCredentialsType(PersonEntity.CredentialsType credentialsType) {
        getPersonEntity().setCredentialsType(credentialsType);
    }

    public String getCredentialsNumber() {
        return getPersonEntity().getCredentialsNumber();
    }

    public void setCredentialsNumber(String credentialsNumber) {
        if (credentialsNumber == null){
            getPersonEntity().setCredentialsNumber(credentialsNumber);
        }else
            getPersonEntity().setCredentialsNumber(credentialsNumber.trim().toUpperCase());
    }

    public String getPersonName() {
        return getPersonEntity().getPersonName();
    }

    public void setPersonName(String name) {
        if (name == null){
            getPersonEntity().setPersonName(null);
        }else
            getPersonEntity().setPersonName(name.trim());
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    //    private boolean isManager = false;
//
//    public boolean isManager() {
//        return isManager;
//    }
//
//    protected void setManager(boolean isManager) {
//        this.isManager = isManager;
//    }

//    public void readFromCard() {
//
//        isManager = true;
//    }



}

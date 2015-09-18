package com.dgsoft.common.system;

import java.util.UUID;

/**
 * Created by cooper on 9/19/14.
 */
public abstract class PersonHelperBase<E extends PersonEntity>  {

    private String uuid;


    public PersonHelperBase(E entity) {
        this.entity = entity;
        isManager = false;
        uuid = UUID.randomUUID().toString();
    }

    private E entity;

    public E getPersonEntity() {
        return entity;
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
        getPersonEntity().setCredentialsNumber(credentialsNumber);
    }

    public String getPersonName() {
        return getPersonEntity().getPersonName();
    }

    public void setPersonName(String name) {
        getPersonEntity().setPersonName(name);
    }

    public String getUuid() {
        return uuid;
    }

    private boolean isManager = false;

    public boolean isManager() {
        return isManager;
    }

    protected void setManager(boolean isManager) {
        this.isManager = isManager;
    }

    public void readFromCard() {

        isManager = true;
    }

    protected void fillPerson(PersonIDCard person){
        setCredentialsType(PersonEntity.CredentialsType.MASTER_ID);
        setPersonName(person.getName());
        setCredentialsNumber(person.getNumber());

        //TODO otherInfo
    }

    public void typeChange() {

        isManager = false;
        if ((getCredentialsType() != null) &&  getCredentialsType().equals(PersonEntity.CredentialsType.OTHER)) {
            setCredentialsNumber(UUID.randomUUID().toString());
        } else {
            setCredentialsNumber(null);
        }

    }

    protected abstract PersonIDCard findStorePersonIDCard(String credentialsNumber);


    public void numberChange() {
        isManager = false;
        if ((getCredentialsNumber() != null) &&
                getCredentialsType().equals(PersonEntity.CredentialsType.MASTER_ID)){
            PersonIDCard person = findStorePersonIDCard(getCredentialsNumber());
            if (person != null) {
                fillPerson(person);
                isManager = true;
            }
        }
    }


}

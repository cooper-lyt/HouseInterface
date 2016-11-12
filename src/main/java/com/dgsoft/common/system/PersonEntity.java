package com.dgsoft.common.system;

/**
 * Created by cooper on 8/20/14.
 */
public interface PersonEntity {

    public enum CredentialsType{
        MASTER_ID(false),COMPANY_CODE(true),CORP_CODE(true),
        SOLDIER_CARD(false),PASSPORT(false),TW_ID(false),OTHER(false);

        private boolean corp;

        public boolean isCorp() {
            return corp;
        }

        CredentialsType(boolean corp) {
            this.corp = corp;
        }
    }

    CredentialsType getCredentialsType();

    void setCredentialsType(CredentialsType credentialsType);

    String getCredentialsNumber();

    void setCredentialsNumber(String credentialsNumber);

    String getPersonName();

    void setPersonName(String personName);

}

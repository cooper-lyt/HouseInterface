package com.dgsoft.common.system;

/**
 * Created by cooper on 8/20/14.
 */
public interface PersonEntity {

    public enum CredentialsType{
        MASTER_ID(false),COMPANY_CODE(true),CORP_CODE(true),
        SOLDIER_CARD(false),PASSPORT(false),OTHER(false);

        private boolean corp;

        public boolean isCorp() {
            return corp;
        }

        CredentialsType(boolean corp) {
            this.corp = corp;
        }
    }

    public CredentialsType getCredentialsType();

    public void setCredentialsType(CredentialsType credentialsType);

    public String getCredentialsNumber();

    public void setCredentialsNumber(String credentialsNumber);

    public String getPersonName();

    public void setPersonName(String personName);


}

package com.dgsoft.common.system;

import java.math.BigDecimal;

/**
 * Created by cooper on 24/11/2016.
 */
public interface PowerPersonEntity extends OwnerPersonEntity {



    public enum LegalType{
        LEGAL_OWNER(true),OWNER_PARTNER(true) ,LEGAL_MANAGER(false);

        private boolean owner;

        LegalType(boolean owner) {
            this.owner = owner;
        }
    }

    BigDecimal getPoolPerc();

    void setPoolPerc(BigDecimal perc);

    BigDecimal getPoolArea();

    void setPoolArea(BigDecimal area);

    LegalType getLegalType();

    void setLegalType(LegalType legalType);

    String getLegalPerson();

    void setLegalPerson(String legalPerson);

    String getRootAddress();

    void setRootAddress(String address);
}

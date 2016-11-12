package com.dgsoft.common.system;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by cooper on 9/29/16.
 */
public interface OwnerPersonEntity extends PersonEntity{

    public enum LegalType{
        LEGAL_OWNER,LEGAL_MANAGER
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

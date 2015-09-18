package com.dgsoft.common.system;

import java.util.Date;

/**
 * Created by cooper on 9/17/15.
 */
public interface PersonIDCard{

    public enum Sex{
        FEMALE, MALE;
    }

    String getNumber();

    String getName();

    Sex getSex();

    String getCredentialsOrgan();

    Date getValidDateBegin();

    Date getValidDateEnd();

    String getAddress();

    Date getDateOfBirth();

    String getEthnic();

}

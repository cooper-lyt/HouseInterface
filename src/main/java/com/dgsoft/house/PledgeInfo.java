package com.dgsoft.house;

import java.util.Date;

/**
 * Created by cooper on 9/15/15.
 */
public interface PledgeInfo {

    String getType();

    String getOwnerPersonName();

    String getPledgePersonName();

    String getPledgeCorpName();

    Date getBeginTime();

    Date getEndTime();

}

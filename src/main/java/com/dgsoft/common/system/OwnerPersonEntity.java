package com.dgsoft.common.system;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by cooper on 9/29/16.
 */
public interface OwnerPersonEntity extends PersonEntity{

    BigDecimal getPoolPerc();

    void setPoolPerc(BigDecimal perc);

    BigDecimal getPoolArea();

    void setPoolArea(BigDecimal area);


}

package com.dgsoft.common.system;

import java.math.BigDecimal;

/**
 * Created by cooper on 9/29/16.
 */
public class OwnerPersonHelper<T extends OwnerPersonEntity> extends PersonHelper<T> {

    private BigDecimal houseArea;

    public OwnerPersonHelper(T entity, BigDecimal houseArea) {
        super(entity);
        this.houseArea = houseArea;
    }

    public BigDecimal getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(BigDecimal houseArea) {
        this.houseArea = houseArea;
    }

    public BigDecimal getPoolPerc(){
        return getPersonEntity().getPoolPerc();
    }

    public void setPoolPerc(BigDecimal perc){
        getPersonEntity().setPoolPerc(perc);
        if (perc != null) {
            getPersonEntity().setPoolArea(houseArea.multiply(perc.divide(new BigDecimal(100))));
        }else{
            getPersonEntity().setPoolArea(null);
        }
    }

    public BigDecimal getPoolArea(){
        return getPersonEntity().getPoolArea();
    }

    public void setPoolArea(BigDecimal area){
        getPersonEntity().setPoolArea(area);
        if (area != null){
            getPersonEntity().setPoolPerc(area.divide(houseArea).multiply(new BigDecimal(100)));
        }else{
            getPersonEntity().setPoolPerc(null);
        }
    }

}

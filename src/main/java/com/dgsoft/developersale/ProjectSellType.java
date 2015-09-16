package com.dgsoft.developersale;

/**
 * Created by cooper on 9/6/15.
 */
public enum ProjectSellType {
    NOW_SELL("NN"), MAP_SELL("MN"), OLD_SELL("OH");

    String numberPrefx;

    public String getNumberPrefx() {
        return numberPrefx;
    }

    ProjectSellType(String numberPrefx){
        this.numberPrefx = numberPrefx;
    }

}

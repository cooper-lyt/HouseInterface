package com.dgsoft.house;

/**
 * Created by cooper on 9/6/15.
 */
public enum SaleType {
    //现售商品房， 预销售商品房， 二手房， 用与旧数据未知的合同类型
    NOW_SELL("NN","v1","v2","v3"), MAP_SELL("MN","v1","v2"), OLD_SELL("OH","v1"), OTHER("OTHER","v1") ;

    String numberPrefx;

    public String getNumberPrefx() {
        return numberPrefx;
    }

    private String[] versions;

    public int getCurrentVersion(){
        return versions.length;
    }

    public String getCurrentPatch() {
        if (versions.length > 0) {
            return this.name() + "-" + versions[versions.length - 1];
        }
        return null;
    }

    public String getPatchByVersion(int version){
        if (version > this.versions.length)
            return null;
        return this.name() + "-" + versions[version-1];
    }

    SaleType(String numberPrefx, String... versions){
        this.numberPrefx = numberPrefx;
        this.versions = versions;

    }

}

package com.dgsoft.house;

/**
 * Created by cooper on 9/6/15.
 */
public enum SaleType {
    NOW_SELL("NN","v1"), MAP_SELL("MN", "v1"), OLD_SELL("OH","v1");

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
        return versions[version-1];
    }

    SaleType(String numberPrefx, String... versions){
        this.numberPrefx = numberPrefx;
        this.versions = versions;

    }

}

package com.dgsoft.house;

/**
 * Created by cooper on 9/5/15.
 */
public interface BuildGridMapBlockInfo {


    int getColspan();

    int getRowspan();

    HouseInfo getHouse();

    boolean isLocked();

    HouseStatus getStatus();
}

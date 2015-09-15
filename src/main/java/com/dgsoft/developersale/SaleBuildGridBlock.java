package com.dgsoft.developersale;

import com.dgsoft.house.BuildGridMapBlockInfo;
import com.dgsoft.house.HouseInfo;
import com.dgsoft.house.HouseStatus;
import com.dgsoft.house.PledgeInfo;
import com.dgsoft.house.impl.House;
import com.dgsoft.house.impl.HousePledgeInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/**
 * Created by cooper on 9/7/15.
 */
public class SaleBuildGridBlock implements BuildGridMapBlockInfo {

    private final static EnumSet<HouseStatus> ALLOW_SALE_STATUS = EnumSet.of(HouseStatus.PROJECT_PLEDGE, HouseStatus.INIT_REG_CONFIRM, HouseStatus.INIT_REG);


    public enum SaleStauts{
        //可售， 不可售， 已售， 签约，备案， 查封，草签，在建工程抵押
        CAN_SALE, NO_SALE, HAVE_SALE, CONTRACT_SUBMIT, CONTRACTS_RECORD,COURT_CLOSE, PREPARE_CONTRACT,PROJECT_PLEDGE;
    }

    private int colspan;

    private int rowspan;

    private HouseInfo house;

    private HouseStatus status;

    private boolean locked;

    private boolean saled;

    private List<PledgeInfo> pledgeInfoList = new ArrayList<PledgeInfo>();


    public SaleBuildGridBlock(JSONObject jsonObject) {
        try {
            this.colspan = jsonObject.getInt("colspan");
        } catch (JSONException e) {
            this.colspan = 1;
        }
        try {
            this.rowspan = jsonObject.getInt("rowspan");
        } catch (JSONException e) {
            this.rowspan = 1;
        }

        try {
            String statusName = jsonObject.getString("status");
            if (statusName == null || statusName.trim().equals("")){
                this.status = null;
            }else
                this.status = HouseStatus.valueOf(statusName);
        } catch (JSONException e) {
            this.status = null;
        }

        try {
            this.locked = jsonObject.getBoolean("locked");
        } catch (JSONException e) {
            this.locked = false;
        }


        try {
            this.saled = jsonObject.getBoolean("saled");
        } catch (JSONException e) {
            this.saled = false;
        }



        try {
            JSONObject houseJsonObj = jsonObject.getJSONObject("house");
            if (houseJsonObj == null){
                this.house = null;
            }else {
                this.house = new House(houseJsonObj);
            }
        } catch (JSONException e) {
            this.house = null;
        }

        try {
            JSONArray jsonArray = jsonObject.getJSONArray("pledge");
            this.pledgeInfoList = new ArrayList<PledgeInfo>(jsonArray.length());
            for(int i = 0; i < jsonArray.length(); i++){
                pledgeInfoList.add(new HousePledgeInfo(jsonArray.getJSONObject(i)));
            }
        } catch (JSONException e) {
            this.pledgeInfoList = new ArrayList<PledgeInfo>(0);
        }

    }

    public HouseStatus getStatus() {
        return status;
    }

    public void setStatus(HouseStatus status) {
        this.status = status;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public HouseInfo getHouse() {
        return house;
    }

    public void setHouse(HouseInfo house) {
        this.house = house;
    }

    public int getRowspan() {
        return rowspan;
    }

    public void setRowspan(int rowspan) {
        this.rowspan = rowspan;
    }

    public int getColspan() {
        return colspan;
    }

    public void setColspan(int colspan) {
        this.colspan = colspan;
    }

    public boolean isSaled() {
        return saled;
    }

    public void setSaled(boolean saled) {
        this.saled = saled;
    }

    public List<PledgeInfo> getPledgeInfoList() {
        return pledgeInfoList;
    }

    public void setPledgeInfoList(List<PledgeInfo> pledgeInfoList) {
        this.pledgeInfoList = pledgeInfoList;
    }

    public SaleStauts getSaleStatus(){
        if (isLocked()){
            return SaleStauts.NO_SALE;
        }
        if (isSaled()){
            return SaleStauts.CONTRACT_SUBMIT;
        }


        if (getStatus() == null){
            return SaleStauts.CAN_SALE;
        }else if (HouseStatus.COURT_CLOSE.equals(getStatus())) {
            return SaleStauts.COURT_CLOSE;
        } else if (HouseStatus.CONTRACTS_RECORD.equals(getStatus())) {
            return SaleStauts.CONTRACTS_RECORD;
        }else if (HouseStatus.PROJECT_PLEDGE.equals(getStatus())){
            return SaleStauts.PROJECT_PLEDGE;
        } else if(ALLOW_SALE_STATUS.contains(getStatus())){
            return SaleStauts.CAN_SALE;
        }else{
            return SaleStauts.HAVE_SALE;
        }


    }

}

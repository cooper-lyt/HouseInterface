package com.dgsoft.developersale;

/**
 * Created by cooper on 9/16/15.
 */
public enum SaleStatus {


        //可售， 不可售， 已售， 签约，备案， 查封，草签，在建工程抵押
        CAN_SALE(true), NO_SALE(false), HAVE_SALE(false), CONTRACT_SUBMIT(false), CONTRACTS_RECORD(false),COURT_CLOSE(false), PREPARE_CONTRACT(false),PROJECT_PLEDGE(true);


    private boolean canSale;

    public boolean isCanSale(){
        return canSale;
    }

    SaleStatus(boolean canSale){
        this.canSale = canSale;
    }

}

package cc.coopersoft.house;

/**
 * Created by cooper on 24/10/2017.
 * 房屋的权力证， 不包括项目的，包括房产颁发的和其它部门颁发的
 */
public enum HousePowerCard {

    //不动产权证，不动产登记证明，房产证，共有权证，土地证，他项权证，预抵证，预告证，在抵证，转移预告，转移预抵
    NEW_OWNER(false,true), NEW_OTHER_OWNER(false,false),
    OWNER_RSHIP(true,true),POOL_RSHIP(true,true),LAND(true,false),MORTGAGE_CARD(true,false),NOTICE(true,false),NOTICE_MORTGAGE(true,false),PROJECT_MORTGAGE(true,false),NOTICE_DIVERT(true,false),NOTICE_DIVERT_MORTGAGE(true,false);

    private boolean disable;

    private boolean ownerCer;

    public boolean isDisable() {
        return disable;
    }

    public boolean isOwnerCer() {
        return ownerCer;
    }

    HousePowerCard(boolean disable, boolean ownerCer) {
        this.disable = disable;
        this.ownerCer = ownerCer;
    }
}

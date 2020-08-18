package com.ms.module.supers.inter.data;

import com.ms.module.supers.inter.supper.ISupper;

public interface IData extends ISupper {

    IAppData getAppData();
    IUserData  getUserData();
    IMatrixData getMatrixData();
    IAliyunSTSData getAliyunSTSData();


}


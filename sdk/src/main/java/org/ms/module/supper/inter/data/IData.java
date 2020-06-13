package org.ms.module.supper.inter.data;

import org.ms.module.supper.inter.supper.ISupper;

public interface IData extends ISupper {

    IAppData getAppData();
    IUserData  getUserData();
    IMatrixData getMatrixData();
    IAliyunSTSData getAliyunSTSData();


}


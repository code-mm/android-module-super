package org.ms.module.data.impl;

import org.ms.module.supper.inter.data.IAliyunOSSData;
import org.ms.module.supper.inter.data.IAppData;
import org.ms.module.supper.inter.data.IDataAdapter;
import org.ms.module.supper.inter.data.IMatrixData;
import org.ms.module.supper.inter.data.IUserData;

public class DataImpl extends IDataAdapter {


    @Override
    public IAppData getAppData() {
        return new AppDataImpl();
    }

    @Override
    public IUserData getUserData() {
        return new UserDataImpl();
    }

    @Override
    public IMatrixData getMatrixData() {
        return null;
    }

    @Override
    public IAliyunOSSData getAliyunOSSData() {
        return super.getAliyunOSSData();
    }
}

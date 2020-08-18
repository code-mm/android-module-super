package com.ms.module.impl.data;


import com.ms.module.supers.inter.data.IAliyunSTSData;
import com.ms.module.supers.inter.data.IAppData;
import com.ms.module.supers.inter.data.IDataAdapter;
import com.ms.module.supers.inter.data.IMatrixData;
import com.ms.module.supers.inter.data.IUserData;

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
        return new MatrixDataImpl();
    }

    @Override
    public IAliyunSTSData getAliyunSTSData() {
        return new AliyunSTSDataImpl();
    }
}

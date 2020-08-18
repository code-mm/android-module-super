package com.ms.module.supers.inter.data;

public class IDataAdapter implements IData {

    @Override
    public IAppData getAppData() {
        System.out.println(IData.class.getSimpleName()+"未实现");
        return null;
    }

    @Override
    public IUserData getUserData() {
        System.out.println(IData.class.getSimpleName()+"未实现");
        return null;
    }

    @Override
    public IMatrixData getMatrixData() {
        System.out.println(IData.class.getSimpleName()+"未实现");
        return null;
    }

    @Override
    public IAliyunSTSData getAliyunSTSData() {
        System.out.println(IData.class.getSimpleName()+"未实现");
        return null;
    }
}
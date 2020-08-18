package com.ms.module.supers.inter.common;

public class ICommonAdapter  implements ICommon{
    @Override
    public void init() {
        System.out.println(ICommon.class.getSimpleName()+"未实现");
    }

    @Override
    public void initServerBaseUrl() {
        System.out.println(ICommon.class.getSimpleName()+"未实现");
    }
}
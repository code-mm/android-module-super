package com.ms.module.supers.internal;

import com.ms.module.supers.inter.common.ICommon;
import com.ms.module.supers.inter.common.ICommonAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;


public class CommonModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.common.CommonImpl";

    private ICommon iCommon;


    @Override
    public ICommon get() {
        if (iCommon == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof ICommon) {
                    iCommon = (ICommon) o;
                    if (iCommon != null) {
                        return iCommon;
                    } else {
                        iCommon = new ICommonAdapter();
                        return iCommon;
                    }
                } else {
                    iCommon = new ICommonAdapter();
                    return iCommon;
                }
            } else {
                iCommon = new ICommonAdapter();
                return iCommon;
            }
        }
        return iCommon;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
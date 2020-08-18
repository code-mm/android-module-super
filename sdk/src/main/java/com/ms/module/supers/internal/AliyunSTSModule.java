package com.ms.module.supers.internal;

import com.ms.module.supers.inter.aliyun.sts.ISTS;
import com.ms.module.supers.inter.module.ModuleAdapter;

public class AliyunSTSModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.aliyun.STSImpl";

    private ISTS sts;

    @Override
    public ISTS get() {
        if (sts == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof ISTS) {
                    sts = (ISTS) o;
                    if (sts != null) {
                        return sts;
                    } else {
                        return sts = () -> {

                        };

                    }
                }
            } else {
                return sts = () -> {

                };
            }
        }
        return sts;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
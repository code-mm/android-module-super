package org.ms.module.supper.internal;

import org.ms.module.supper.inter.aliyun.sts.ISTS;
import org.ms.module.supper.inter.module.ModuleAdapter;

public class AliyunSTSModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.aliyun.STSImpl";

    private ISTS ists;

    @Override
    public ISTS get() {
        if (ists == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof ISTS) {
                    ists = (ISTS) o;
                    if (ists != null) {
                        return ists;
                    } else {
                        ists= () -> {

                        };
                    }
                }
            }
        }
        return ists;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
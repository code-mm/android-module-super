package org.ms.module.supper.internal;

import org.ms.module.supper.inter.aliyun.sts.ISTS;
import org.ms.module.supper.inter.module.ModuleAdapter;

public class AliyunSTSModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.aliyun.STSImpl";

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
                        sts = () -> {

                        };
                    }
                }
            } else {
                sts = () -> {

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
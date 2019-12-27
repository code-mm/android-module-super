package org.ms.module.supper.internal;


import org.ms.module.supper.inter.api.IAPI;
import org.ms.module.supper.inter.module.ModuleAdapter;

public class ApiModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.api.impl.ApiImpl";

    private IAPI iapi;


    @Override
    public IAPI get() {
        if (iapi == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IAPI) {
                    iapi = (IAPI) o;
                }
            }
        }
        return iapi;
    }


    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
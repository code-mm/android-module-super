package org.ms.module.supper.internal;


import org.ms.module.supper.inter.api.IAPI;
import org.ms.module.supper.inter.api.IAPIAdapter;
import org.ms.module.supper.inter.module.ModuleAdapter;

public class ApiModule extends ModuleAdapter {
    private static final String CLASSPATH = "org.ms.module.impl.api.ApiImpl";
    private IAPI iapi;

    @Override
    public IAPI get() {
        if (iapi == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IAPI) {
                    iapi = (IAPI) o;
                    if (iapi != null) {
                        return iapi;
                    } else {
                        iapi = new IAPIAdapter();
                    }
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
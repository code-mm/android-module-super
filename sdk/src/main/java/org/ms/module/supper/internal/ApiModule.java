package org.ms.module.supper.internal;


import org.ms.module.supper.inter.api.IAPI;
import org.ms.module.supper.inter.api.IAPIAdapter;
import org.ms.module.supper.inter.module.ModuleAdapter;

public class ApiModule extends ModuleAdapter {
    private static final String CLASSPATH = "org.ms.module.impl.api.ApiImpl";
    private IAPI api;

    @Override
    public IAPI get() {
        if (api == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IAPI) {
                    api = (IAPI) o;
                    if (api != null) {
                        return api;
                    } else {
                        api = new IAPIAdapter();
                    }
                }
            } else {
                api = new IAPIAdapter();
            }
        }
        return api;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
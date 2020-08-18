package com.ms.module.supers.internal;


import com.ms.module.supers.inter.api.IAPI;
import com.ms.module.supers.inter.api.IAPIAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

public class ApiModule extends ModuleAdapter {
    private static final String CLASSPATH = "com.ms.module.impl.api.ApiImpl";
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
                        return api;
                    }
                }else{
                    api = new IAPIAdapter();
                    return api;
                }
            } else {
                api = new IAPIAdapter();
                return api;
            }
        }
        return api;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
package com.ms.module.supers.internal;


import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.utils.IUtils;
import com.ms.module.supers.inter.utils.IUtilsAdapter;

public class UtilsModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.utils.UtilsImpl";

    private IUtils utils;

    @Override
    public IUtils get() {
        if (utils == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IUtils) {
                    utils = (IUtils) o;
                    if (utils != null) {
                        return utils;
                    } else {
                        utils = new IUtilsAdapter();
                        return utils;
                    }
                } else {
                    utils = new IUtilsAdapter();
                    return utils;
                }
            } else {
                utils = new IUtilsAdapter();
            }
        }
        return utils;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
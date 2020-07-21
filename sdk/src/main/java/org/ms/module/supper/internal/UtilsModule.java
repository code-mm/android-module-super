package org.ms.module.supper.internal;


import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.utils.IUtils;
import org.ms.module.supper.inter.utils.IUtilsAdapter;

public class UtilsModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.utils.UtilsImpl";

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
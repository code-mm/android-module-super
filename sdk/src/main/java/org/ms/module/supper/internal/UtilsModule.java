package org.ms.module.supper.internal;


import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.utils.IUtils;
import org.ms.module.supper.inter.utils.IUtilsAdapter;

public class UtilsModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.utils.UtilsImpl";

    private IUtils iUtils;


    @Override
    public IUtils get() {
        if (iUtils == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IUtils) {
                    iUtils = (IUtils) o;
                    if (iUtils != null) {
                        return iUtils;
                    } else {
                        iUtils = new IUtilsAdapter();
                    }
                }
            }
        }
        return iUtils;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
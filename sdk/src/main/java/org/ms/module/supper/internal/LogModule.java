package org.ms.module.supper.internal;

import org.ms.module.supper.inter.log.ILog;
import org.ms.module.supper.inter.log.IlogAdapter;
import org.ms.module.supper.inter.module.ModuleAdapter;

public class LogModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.log.LogImpl";

    private ILog ilog;

    @Override
    public ILog get() {
        if (ilog == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof ILog) {
                    ilog = (ILog) o;
                    if (ilog != null) {
                        return ilog;
                    } else {
                        ilog = new IlogAdapter();
                    }
                }
            }
        }
        return ilog;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
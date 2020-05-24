package org.ms.module.supper.internal;

import org.ms.module.supper.inter.log.ILog;
import org.ms.module.supper.inter.log.IlogAdapter;
import org.ms.module.supper.inter.module.ModuleAdapter;

public class LogModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.log.LogImpl";

    private ILog log;

    @Override
    public ILog get() {
        if (log == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof ILog) {
                    log = (ILog) o;
                    if (log != null) {
                        return log;
                    } else {
                        log = new IlogAdapter();
                    }
                }
            }else{
                log = new IlogAdapter();
            }
        }
        return log;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
package com.ms.module.supers.internal;

import com.ms.module.supers.inter.log.ILog;
import com.ms.module.supers.inter.log.IlogAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

public class LogModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.log.LogImpl";

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
                        return log;
                    }
                }
            }else{
                log = new IlogAdapter();
                return log;
            }
        }
        return log;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
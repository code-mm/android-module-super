package org.ms.module.supper.internal;

import org.ms.module.supper.inter.data.IData;
import org.ms.module.supper.inter.exception.IException;
import org.ms.module.supper.inter.exception.IExceptionAdapter;
import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.supper.ISupper;

public class ExceptionModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.exception.ExceptionImpl";

    IException exception;

    @Override
    public IException get() {
        if (exception == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IException) {
                    exception = (IException) o;
                    if (exception != null) {
                        return exception;
                    } else {
                        exception = new IExceptionAdapter();
                    }
                }
            }
        }
        return exception;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
package com.ms.module.supers.internal;

import com.ms.module.supers.inter.exception.IException;
import com.ms.module.supers.inter.exception.IExceptionAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

public class ExceptionModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.exception.ExceptionImpl";

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
                        return exception;
                    }
                }
            }else{
                exception = new IExceptionAdapter();
                return exception;
            }
        }
        return exception;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
package com.ms.module.impl.exception;

import com.ms.module.supers.client.Modules;
import com.ms.module.supers.inter.exception.IExceptionAdapter;

public class ExceptionImpl extends IExceptionAdapter {
    String debug = "debug";

    @Override
    public void handlerInit() {
        ModuleExceptionHandler.init();
    }

    @Override
    public void printStackTrace(Throwable e) {

        if (e != null) {
            if (Modules.getControlSwitch().getPrintStackTrace()) {
                e.printStackTrace();
            } else {
                Modules.getLogModule().d("", "" + e.getMessage());
            }
        }
    }
}

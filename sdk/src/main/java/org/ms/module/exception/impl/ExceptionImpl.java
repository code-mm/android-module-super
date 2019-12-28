package org.ms.module.exception.impl;

import org.ms.module.exception.ModuleExceptionHandler;
import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.exception.IException;
import org.ms.module.supper.inter.module.Module;

public class ExceptionImpl implements IException {
    String debug = "debug";

    @Override
    public void handlerInit() {
        ModuleExceptionHandler.init();
    }

    @Override
    public void printStackTrace(Exception e) {

        if (e != null) {
            if (Modules.getControlSwitch().getPrintStackTrace()) {
                e.printStackTrace();
            } else {
                Modules.getLogModule().d("", "" + e.getMessage());
            }
        }
    }
}


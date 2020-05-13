package org.ms.module.impl.exception;

import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.exception.IException;
import org.ms.module.supper.inter.exception.IExceptionAdapter;

public class ExceptionImpl extends IExceptionAdapter {
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

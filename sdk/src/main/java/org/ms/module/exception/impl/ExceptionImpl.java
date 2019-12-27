package org.ms.module.exception.impl;

import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.exception.IException;
import org.ms.module.supper.inter.module.Module;

public class ExceptionImpl implements IException {
    String debug = "debug";
    @Override
    public void printStackTrace(Exception e) {

        if (e != null) {
            if (debug.equals("debug")) {
                e.printStackTrace();
            } else if (debug.equals("out")) {
                Modules.getLogModule().d("log : ", e.getMessage().toString());
            } else {

            }
        }


    }
}

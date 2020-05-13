package org.ms.module.impl.controllswitch;

import org.ms.module.supper.inter.controll.IControllSwitchAdapter;
import org.ms.module.supper.internal.ControllSwitchModule;

public class ControllSwitchImpl extends IControllSwitchAdapter {


    private boolean logout;

    @Override
    public void setLogOut(boolean flag) {
        logout = flag;
    }

    @Override
    public boolean getLogOut() {
        return logout;
    }


    private boolean stack;

    @Override
    public void setPrintStackTrace(boolean flag) {
        stack = flag;
    }

    @Override
    public boolean getPrintStackTrace() {
        return stack;
    }


    boolean requestlog = false;

    @Override
    public void setRequestLog(boolean flag) {
        requestlog = flag;
    }

    @Override
    public boolean getRequestLog() {
        return requestlog;
    }
}





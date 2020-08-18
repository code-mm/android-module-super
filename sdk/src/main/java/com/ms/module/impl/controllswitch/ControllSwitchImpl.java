package com.ms.module.impl.controllswitch;

import com.ms.module.supers.inter.controll.IControllSwitchAdapter;

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





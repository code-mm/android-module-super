package org.ms.module.impl.request;

import org.ms.module.supper.inter.net.IRequestSettingAdapter;

public class RequestSettingImpl extends IRequestSettingAdapter {

    private int connectTimeout;
    private int writeTimeout;
    private int readTimeout;

    private boolean logOut;

    @Override
    public void setConnectTimeout(int value) {
        super.setConnectTimeout(value);
        connectTimeout = value;
    }

    @Override
    public int getConnectTimeout() {
        return connectTimeout;
    }

    @Override
    public void setWriteTimeout(int value) {
        super.setWriteTimeout(value);
        writeTimeout = value;
    }

    @Override
    public int getWriteTimeout() {
        return writeTimeout;
    }

    @Override
    public void setReadTimeout(int value) {
        super.setReadTimeout(value);
        readTimeout = value;
    }

    @Override
    public int getReadTimeout() {
        return readTimeout;
    }


    @Override
    public void setRequestLogOut(boolean flag) {
        super.setRequestLogOut(flag);
        logOut = flag;
    }

    @Override
    public boolean getRequestLogOut() {
        return logOut;
    }
}

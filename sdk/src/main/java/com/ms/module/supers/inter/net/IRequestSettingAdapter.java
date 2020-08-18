package com.ms.module.supers.inter.net;

public class IRequestSettingAdapter implements IRequestSetting{

    @Override
    public void setConnectTimeout(int value) {

    }

    @Override
    public int getConnectTimeout() {
        return 0;
    }

    @Override
    public void setReadTimeout(int value) {

    }

    @Override
    public int getReadTimeout() {
        return 0;
    }

    @Override
    public void setWriteTimeout(int value) {

    }

    @Override
    public int getWriteTimeout() {
        return 0;
    }

    @Override
    public void setRequestLogOut(boolean flag) {

    }

    @Override
    public boolean getRequestLogOut() {
        return false;
    }
}

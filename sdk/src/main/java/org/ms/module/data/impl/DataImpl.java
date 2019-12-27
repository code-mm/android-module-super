package org.ms.module.data.impl;

import android.app.Application;

import org.ms.module.data.__DATA__;
import org.ms.module.supper.inter.data.IDataAdapter;

public class DataImpl extends IDataAdapter {

    @Override
    public Application getApplication() {
        return __DATA__.mApplication;
    }

    @Override
    public void setApplication(Application application) {
        __DATA__.mApplication = application;
    }

    @Override
    public void setAppId(String id) {
        super.setAppId(id);
    }

    @Override
    public String getAppId() {
        return super.getAppId();
    }

    @Override
    public void setAppVersion(String version) {
        super.setAppVersion(version);
    }


    @Override
    public String getAppVersion() {
        return super.getAppVersion();
    }

    @Override
    public void setUserId(String userId) {
        super.setUserId(userId);
    }

    @Override
    public String getUserId() {
        return super.getUserId();
    }

    @Override
    public void setUserName(String userName) {
        super.setUserName(userName);
    }

    @Override
    public String getUserName() {
        return super.getUserName();
    }
}

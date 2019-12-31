package org.ms.module.data.impl;

import android.app.Application;

import org.ms.module.data.__APP_DATA__;
import org.ms.module.supper.inter.data.IAppData;

public class AppDataImpl implements IAppData {
    @Override
    public void setApplication(Application application) {
        if(application!=null)
        {
            __APP_DATA__.mApplication=application;
        }
    }

    @Override
    public Application getApplication() {
        return __APP_DATA__.mApplication;
    }

    @Override
    public void setAppVersion(String version) {



    }

    @Override
    public String getAppVersion() {
        return null;
    }

    @Override
    public void setAppId(String id) {

    }

    @Override
    public String getAppId() {
        return null;
    }
}

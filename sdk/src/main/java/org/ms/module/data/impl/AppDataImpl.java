package org.ms.module.data.impl;

import android.app.Application;

import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.data.IAppData;

public class AppDataImpl implements IAppData {
    public static Application application;
    private static String appVersion;
    private static String appid;
    private static String secret;


    @Override
    public void setApplication(Application application) {
        if (application != null) {
            this.application = application;
        }
    }

    @Override
    public Application getApplication() {
        return application;
    }

    @Override
    public void setAppVersion(String version) {
        appVersion = version;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "setAppVersion".toLowerCase(), version);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "setAppVersion".toLowerCase(), version);
    }

    @Override
    public String getAppVersion() {
        return appVersion;
    }

    @Override
    public void setAppId(String id) {
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "setAppId".toLowerCase(), id);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "setAppId".toLowerCase(), id);
    }

    @Override
    public String getAppId() {
        return appid;
    }

    @Override
    public void setAppSecret(String secret) {
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "setAppSecret".toLowerCase(), secret);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "setAppSecret".toLowerCase(), secret);
    }

    @Override
    public String getAppSecret() {
        return secret;
    }
}

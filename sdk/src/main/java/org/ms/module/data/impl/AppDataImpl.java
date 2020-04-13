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
    public void setAppVersion(String value) {
        appVersion = value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "AppVersion".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "AppVersion".toLowerCase(), value);
    }

    @Override
    public String getAppVersion() {


        if (appVersion != null && !"".equals(appVersion)) {
            return appVersion;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "AppVersion".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "AppVersion".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }

        return null;
    }

    @Override
    public void setAppId(String value) {
        this.appid=value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "AppId".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "AppId".toLowerCase(), value);
    }

    @Override
    public String getAppId() {
        if (appid != null && !"".equals(appid)) {
            return appid;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "AppId".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "AppId".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }

        return null;
    }

    @Override
    public void setAppSecret(String value) {

        secret=value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "AppSecret".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "AppSecret".toLowerCase(), value);
    }

    @Override
    public String getAppSecret() {

        if (secret != null && !"".equals(secret)) {
            return secret;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "AppSecret".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "AppSecret".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }

        return null;
    }
}

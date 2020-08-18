package com.ms.module.supers.inter.data;

import android.app.Application;

public interface IAppData {

    void setApplication(Application application);

    Application getApplication();

    void setAppVersion(String version);

    String getAppVersion();

    void setAppId(String id);

    String getAppId();

    void setAppSecret(String secret);

    String getAppSecret();

    void setUtdid(String utdid);

    String getUtdid();

    void setIp(String values);
    String getIp();

}

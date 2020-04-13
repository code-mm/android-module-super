package org.ms.module.supper.inter.data;

import android.app.Application;

import java.util.List;


public interface IAppData {

    void setApplication(Application application);

    Application getApplication();

    void setAppVersion(String version);

    String getAppVersion();

    void setAppId(String id);

    String getAppId();

    void setAppSecret(String secret);

    String getAppSecret();

}

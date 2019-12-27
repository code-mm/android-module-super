package org.ms.module.supper.inter.data;

import android.app.Application;

import org.ms.module.supper.inter.supper.ISupper;


public interface IAppData extends ISupper {


    void setApplication(Application application);

    Application getApplication();

    void setAppVersion(String version);

    String getAppVersion();

    void setAppId(String id);

    String getAppId();

}

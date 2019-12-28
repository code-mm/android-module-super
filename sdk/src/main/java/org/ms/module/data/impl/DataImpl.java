package org.ms.module.data.impl;

import android.app.Application;

import org.ms.module.data.__DATA__;
import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.data.IDataAdapter;
import org.ms.module.supper.inter.module.Module;

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
        Modules.getMmkvModule().put("AppId", id);
        Modules.getDataPersistenceModule().put("setAppId", id);
        __DATA__.mAppId = id;
    }

    @Override
    public String getAppId() {
        if (__DATA__.mAppId != null && !__DATA__.mAppId.equals("")) {
            return __DATA__.mAppId;
        }

        String values0 = Modules.getMmkvModule().get("AppId");

        if (values0 != null && !values0.equals("")) {
            return values0;
        }

        String values1 = Modules.getDataPersistenceModule().get("AppId");
        if (values1 != null && !values1.equals("")) {
            return values1;
        }
        return null;

    }

    @Override
    public void setAppVersion(String version) {

    }


    @Override
    public String getAppVersion() {
        return super.getAppVersion();
    }

    @Override
    public void setUserId(String userId) {
        __DATA__.mUserId = userId;
        Modules.getMmkvModule().put("UserId", userId);
        Modules.getDataPersistenceModule().put("UserId", userId);

    }

    @Override
    public String getUserId() {

        if (__DATA__.mUserId != null && !__DATA__.mUserId.equals("")) {
            return __DATA__.mUserId;
        }

        String values0 = Modules.getMmkvModule().get("UserId");

        if (values0 != null && !values0.equals("")) {
            return values0;
        }

        String values1 = Modules.getDataPersistenceModule().get("UserId");
        if (values1 != null && !values1.equals("")) {
            return values1;
        }
        return null;

    }


    @Override
    public void setUsername(String username) {
        __DATA__.mUsername = username;
        Modules.getMmkvModule().put("UserName", username);
        Modules.getDataPersistenceModule().put("UserName", username);
    }

    @Override
    public String getUsername() {
        if (__DATA__.mUsername != null && !__DATA__.mUsername.equals("")) {
            return __DATA__.mUsername;
        }

        String values0 = Modules.getMmkvModule().get("UserName");

        if (values0 != null && !values0.equals("")) {
            return values0;
        }

        String values1 = Modules.getDataPersistenceModule().get("UserName");
        if (values1 != null && !values1.equals("")) {
            return values1;
        }
        return null;
    }

    @Override
    public void setPassword(String password) {
        __DATA__.mPassword = password;
        Modules.getMmkvModule().put("Password", password);
        Modules.getDataPersistenceModule().put("Password", password);
    }

    @Override
    public String getPassword() {
        if (__DATA__.mPassword != null && !__DATA__.mPassword.equals("")) {
            return __DATA__.mPassword;
        }

        String values0 = Modules.getMmkvModule().get("Password");

        if (values0 != null && !values0.equals("")) {
            return values0;
        }

        String values1 = Modules.getDataPersistenceModule().get("Password");
        if (values1 != null && !values1.equals("")) {
            return values1;
        }
        return null;
    }

    @Override
    public void setHomeServer(String homeServer) {
        __DATA__.mHomeServer = homeServer;
        Modules.getMmkvModule().put("HomeServer", homeServer);
        Modules.getDataPersistenceModule().put("HomeServer", homeServer);
    }

    @Override
    public String getHomeServer() {
        if (__DATA__.mHomeServer != null && !__DATA__.mHomeServer.equals("")) {
            return __DATA__.mHomeServer;
        }

        String values0 = Modules.getMmkvModule().get("HomeServer");

        if (values0 != null && !values0.equals("")) {
            return values0;
        }

        String values1 = Modules.getDataPersistenceModule().get("HomeServer");
        if (values1 != null && !values1.equals("")) {
            return values1;
        }
        return null;
    }

    @Override
    public void setDeviceId(String deviceId) {
        __DATA__.mDeviceId = deviceId;
        Modules.getMmkvModule().put("DeviceId", deviceId);
        Modules.getDataPersistenceModule().put("DeviceId", deviceId);
    }

    @Override
    public String getDeviceId() {
        if (__DATA__.mDeviceId != null && !__DATA__.mDeviceId.equals("")) {
            return __DATA__.mDeviceId;
        }

        String values0 = Modules.getMmkvModule().get("DeviceId");

        if (values0 != null && !values0.equals("")) {
            return values0;
        }

        String values1 = Modules.getDataPersistenceModule().get("DeviceId");
        if (values1 != null && !values1.equals("")) {
            return values1;
        }
        return null;
    }


    @Override
    public void setAccessToken(String accessToken) {
        __DATA__.mAccessToken = accessToken;
        Modules.getMmkvModule().put("AccessToken", accessToken);
        Modules.getDataPersistenceModule().put("AccessToken", accessToken);
    }

    @Override
    public String getAccessToken() {
        if (__DATA__.mAccessToken != null && !__DATA__.mAccessToken.equals("")) {
            return __DATA__.mAccessToken;
        }

        String values0 = Modules.getMmkvModule().get("AccessToken");

        if (values0 != null && !values0.equals("")) {
            return values0;
        }

        String values1 = Modules.getDataPersistenceModule().get("AccessToken");
        if (values1 != null && !values1.equals("")) {
            return values1;
        }
        return null;
    }
}

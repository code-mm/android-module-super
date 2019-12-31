package org.ms.module.data.impl;

import org.ms.module.data.__MATRIX_DATA__;
import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.data.IMatrixData;

public class MatrixDataImpl implements IMatrixData {
    @Override
    public void setUserId(String userId) {
        Modules.getMmkvModule().put(this.getClass().getSimpleName().toLowerCase() + "UserId", userId);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName().toLowerCase() + "UserId", userId);
        __MATRIX_DATA__.mUserId = userId;

    }

    @Override
    public String getUserId() {
        if (__MATRIX_DATA__.mUserId != null && !__MATRIX_DATA__.mUserId.equals("")) {
            return __MATRIX_DATA__.mUserId;
        }
        String values0 = Modules.getMmkvModule().get(this.getClass().getSimpleName().toLowerCase() + "UserId");

        if (values0 != null && !values0.equals("")) {
            return values0;
        }
        String values1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName().toLowerCase() + "UserId");
        if (values1 != null && !values1.equals("")) {
            return values1;
        }
        return null;
    }

    @Override
    public void setHomeServer(String homeServer) {
        Modules.getMmkvModule().put(this.getClass().getSimpleName().toLowerCase() + "HomeServer", homeServer);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName().toLowerCase() + "HomeServer", homeServer);
        __MATRIX_DATA__.mHomeServer = homeServer;
    }

    @Override
    public String getHomeServer() {
        if (__MATRIX_DATA__.mHomeServer != null && !__MATRIX_DATA__.mHomeServer.equals("")) {
            return __MATRIX_DATA__.mHomeServer;
        }
        String values0 = Modules.getMmkvModule().get(this.getClass().getSimpleName().toLowerCase() + "HomeServer");

        if (values0 != null && !values0.equals("")) {
            return values0;
        }
        String values1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName().toLowerCase() + "HomeServer");
        if (values1 != null && !values1.equals("")) {
            return values1;
        }
        return null;
    }

    @Override
    public void setDeviceId(String deviceId) {
        Modules.getMmkvModule().put(this.getClass().getSimpleName().toLowerCase() + "DeviceId", deviceId);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName().toLowerCase() + "DeviceId", deviceId);
        __MATRIX_DATA__.mDeviceId = deviceId;


    }

    @Override
    public String getDeviceId() {
        if (__MATRIX_DATA__.mDeviceId != null && !__MATRIX_DATA__.mDeviceId.equals("")) {
            return __MATRIX_DATA__.mDeviceId;
        }
        String values0 = Modules.getMmkvModule().get(this.getClass().getSimpleName().toLowerCase() + "DeviceId");

        if (values0 != null && !values0.equals("")) {
            return values0;
        }
        String values1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName().toLowerCase() + "DeviceId");
        if (values1 != null && !values1.equals("")) {
            return values1;
        }
        return null;
    }

    @Override
    public void setAccessToken(String accessToken) {
        Modules.getMmkvModule().put(this.getClass().getSimpleName().toLowerCase() + "AccessToken", accessToken);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName().toLowerCase() + "AccessToken", accessToken);
        __MATRIX_DATA__.mAccessToken = accessToken;
    }

    @Override
    public String getAccessToken() {
        if (__MATRIX_DATA__.mAccessToken != null && !__MATRIX_DATA__.mAccessToken.equals("")) {
            return __MATRIX_DATA__.mAccessToken;
        }
        String values0 = Modules.getMmkvModule().get(this.getClass().getSimpleName().toLowerCase() + "AccessToken");

        if (values0 != null && !values0.equals("")) {
            return values0;
        }
        String values1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName().toLowerCase() + "AccessToken");
        if (values1 != null && !values1.equals("")) {
            return values1;
        }
        return null;
    }

    @Override
    public void setUsername(String username) {

        Modules.getMmkvModule().put(this.getClass().getSimpleName().toLowerCase() + "Username", username);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName().toLowerCase() + "Username", username);
        __MATRIX_DATA__.mUsername = username;
    }

    @Override
    public String getUsername() {
        if (__MATRIX_DATA__.mUsername != null && !__MATRIX_DATA__.mUsername.equals("")) {
            return __MATRIX_DATA__.mUsername;
        }
        String values0 = Modules.getMmkvModule().get(this.getClass().getSimpleName().toLowerCase() + "Username");

        if (values0 != null && !values0.equals("")) {
            return values0;
        }
        String values1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName().toLowerCase() + "Username");
        if (values1 != null && !values1.equals("")) {
            return values1;
        }
        return null;
    }

    @Override
    public void setPassword(String password) {
        Modules.getMmkvModule().put(this.getClass().getSimpleName().toLowerCase() + "Password", password);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName().toLowerCase() + "Password", password);
        __MATRIX_DATA__.mPassword = password;
    }

    @Override
    public String getPassword() {
        if (__MATRIX_DATA__.mPassword != null && !__MATRIX_DATA__.mPassword.equals("")) {
            return __MATRIX_DATA__.mUsername;
        }
        String values0 = Modules.getMmkvModule().get(this.getClass().getSimpleName().toLowerCase() + "Password");

        if (values0 != null && !values0.equals("")) {
            return values0;
        }
        String values1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName().toLowerCase() + "Password");
        if (values1 != null && !values1.equals("")) {
            return values1;
        }
        return null;
    }
}

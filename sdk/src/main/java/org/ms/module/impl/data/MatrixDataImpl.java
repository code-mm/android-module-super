package org.ms.module.impl.data;

import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.data.IMatrixDataAdapter;

public class MatrixDataImpl extends IMatrixDataAdapter {

    private String userId;
    private String username;
    private String password;
    private String homeServer;
    private String deviceId;
    private String access_token;


    @Override
    public void setUserId(String value) {
        this.userId = value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "UserId".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "UserId".toLowerCase(), value);

    }

    @Override
    public String getUserId() {
        if (userId != null && !"".equals(userId)) {
            return userId;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "UserId".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "UserId".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }

        return null;
    }

    @Override
    public void setHomeServer(String value) {
        this.homeServer = value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "HomeServer".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "HomeServer".toLowerCase(), value);

    }

    @Override
    public String getHomeServer() {
        if (homeServer != null && !"".equals(homeServer)) {
            return homeServer;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "HomeServer".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "HomeServer".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }

        return null;
    }

    @Override
    public void setDeviceId(String value) {
        this.deviceId = value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "DeviceId".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "DeviceId".toLowerCase(), value);

    }

    @Override
    public String getDeviceId() {
        if (deviceId != null && !"".equals(deviceId)) {
            return deviceId;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "DeviceId".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "DeviceId".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }

        return null;
    }

    @Override
    public void setAccessToken(String value) {
        this.access_token = value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "AccessToken".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "AccessToken".toLowerCase(), value);

    }

    @Override
    public String getAccessToken() {
        if (access_token != null && !"".equals(access_token)) {
            return access_token;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "AccessToken".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "AccessToken".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }
        return null;
    }

    @Override
    public void setUsername(String value) {
        this.username = value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "Username".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "Username".toLowerCase(), value);
    }

    @Override
    public String getUsername() {
        if (username != null && !"".equals(username)) {
            return username;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "Username".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "Username".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }
        return null;
    }

    @Override
    public void setPassword(String value) {
        this.password = value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "Password".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "Password".toLowerCase(), value);
    }

    @Override
    public String getPassword() {
        if (password != null && !"".equals(password)) {
            return password;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "Password".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "Password".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }
        return null;
    }
}

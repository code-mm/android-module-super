package org.ms.module.impl.data;

import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.data.IUserData;
import org.ms.module.supper.inter.data.IUserDataAdapter;

public class UserDataImpl extends IUserDataAdapter {

    private String username;
    private String password;
    private String userid;
    private String access_token;
    private String refresh_token;


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
    public void setUserId(String value) {
        this.userid = value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "UserId".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "UserId".toLowerCase(), value);
    }

    @Override
    public String getUserId() {

        if (userid != null && !"".equals(userid)) {
            return userid;
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
    public String getRefreshToken() {

        if (refresh_token != null && !"".equals(refresh_token)) {
            return refresh_token;
        }

        String s = Modules.getMmkvModule().get(this.getClass().getSimpleName() + "RefreshToken".toLowerCase());
        if (s != null && !"".equals(s)) {
            return s;
        }
        String s1 = Modules.getDataPersistenceModule().get(this.getClass().getSimpleName() + "RefreshToken".toLowerCase());

        if (s1 != null && !"".equals(s1)) {
            return s1;
        }

        return null;
    }

    @Override
    public void setRefreshToken(String value) {
        this.refresh_token = value;
        Modules.getMmkvModule().put(this.getClass().getSimpleName() + "RefreshToken".toLowerCase(), value);
        Modules.getDataPersistenceModule().put(this.getClass().getSimpleName() + "RefreshToken".toLowerCase(), value);

    }
}

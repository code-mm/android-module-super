package org.ms.module.data.impl;

import org.ms.module.supper.inter.data.IUserData;

public class UserDataImpl implements IUserData {


    private String username;
    private String password;
    private String userid;
    private String access_token;


    @Override
    public void setUsername(String username) {
        this.username = username;

    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;

    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setUserId(String userId) {

        this.userid = userId;
    }

    @Override
    public String getUserId() {
        return userid;
    }

    @Override
    public void setAccessToken(String accessToken) {
        this.access_token = accessToken;

    }

    @Override
    public String getAccessToken() {
        return access_token;
    }
}

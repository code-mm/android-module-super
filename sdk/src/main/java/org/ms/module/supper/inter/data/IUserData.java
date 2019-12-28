package org.ms.module.supper.inter.data;


import org.ms.module.supper.inter.supper.ISupper;

public interface IUserData extends ISupper {


    void setUsername(String username);

    String getUsername();


    void setPassword(String password);

    String getPassword();


    void setHomeServer(String homeServer);

    String getHomeServer();


    void setDeviceId(String deviceId);

    String getDeviceId();


    void setUserId(String userId);

    String getUserId();

    void setAccessToken(String accessToken);

    String getAccessToken();


}

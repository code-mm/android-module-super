package org.ms.module.supper.inter.data;

import org.ms.module.supper.inter.supper.ISupper;

public interface IMatrixData   {

    void setUserId(String userId);
    String getUserId();

    void setHomeServer(String homeServer);
    String getHomeServer();

    void setDeviceId(String deviceId);
    String getDeviceId();

    void setAccessToken(String accessToken);
    String getAccessToken();

    void setUsername(String username);
    String getUsername();

    void setPassword(String password);
    String getPassword();



}

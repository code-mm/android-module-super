package com.ms.module.supers.inter.data;


import com.ms.module.supers.inter.supper.ISupper;

public interface IUserData extends ISupper {

    void setUsername(String username);

    String getUsername();

    void setPassword(String password);

    String getPassword();

    void setUserId(String userId);

    String getUserId();

    void setAccessToken(String accessToken);

    String getAccessToken();

    String getRefreshToken();

    void setRefreshToken(String refreshToken);

    // 获取角色
    String getRole();

    // 设置角色
    void setRole(String value);

    // 清除所有数据
    void clearAll();

}
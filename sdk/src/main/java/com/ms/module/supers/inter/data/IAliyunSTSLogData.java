package com.ms.module.supers.inter.data;

public interface IAliyunSTSLogData {

    // 设置初始化 状态
    void setInit(boolean initStatus);

    // 获取初始化状态
    boolean getInit();

    // 是否往阿里云发送开关
    void setSend(boolean send);

    // 获取是否往阿里云发送
    boolean send();

    void setAccessKeySecret(String value);

    String getAccessKeySecret();

    void setAccessKeyId(String value);

    String getAccessKeyId();

    void setSecurity(String value);

    String getSecurity();

    void setExpiration(String value);

    String getExpiration();

    void setRequestid(String value);

    String getRequestid();
}
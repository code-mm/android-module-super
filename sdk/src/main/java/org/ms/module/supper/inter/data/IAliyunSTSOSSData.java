package org.ms.module.supper.inter.data;

public interface IAliyunSTSOSSData {

    // 设置初始化
    void setInit(boolean initStatus);
    boolean getInit();

    void setAccessKeySecret(String value);
    String getAccessKeySecret( );

    void setAccessKeyId(String value);
    String getAccessKeyId( );

    void setSecurity(String value);
    String getSecurity( );

    void setExpiration(String value);
    String getExpiration( );

    void setRequestid(String value);
    String getRequestid( );

}

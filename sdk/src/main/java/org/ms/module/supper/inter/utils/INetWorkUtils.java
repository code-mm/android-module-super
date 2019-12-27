package org.ms.module.supper.inter.utils;


import android.net.NetworkInfo;

public interface INetWorkUtils {

    void openWirelessSettings();

    NetworkInfo getActiveNetworkInfo();

    boolean isAvailable();

    boolean isConnected();

    boolean is4G();

    boolean isWifiConnected();

    String getNetworkOperatorName();

    int getPhoneType();

    int getNetWorkType();

    String getNetWorkTypeName();

}

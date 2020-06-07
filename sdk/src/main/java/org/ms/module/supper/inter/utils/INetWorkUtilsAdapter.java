package org.ms.module.supper.inter.utils;

import android.net.NetworkInfo;

public class INetWorkUtilsAdapter implements  INetWorkUtils {
    @Override
    public void openWirelessSettings() {

    }

    @Override
    public NetworkInfo getActiveNetworkInfo() {
        return null;
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public boolean is4G() {
        return false;
    }

    @Override
    public boolean isWifiConnected() {
        return false;
    }

    @Override
    public String getNetworkOperatorName() {
        return null;
    }

    @Override
    public int getPhoneType() {
        return 0;
    }

    @Override
    public int getNetWorkType() {
        return 0;
    }

    @Override
    public String getNetWorkTypeName() {
        return null;
    }
}

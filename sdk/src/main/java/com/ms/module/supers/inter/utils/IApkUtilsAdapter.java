package com.ms.module.supers.inter.utils;

public class IApkUtilsAdapter implements IApkUtils {
    @Override
    public String getAppName() {
        return null;
    }

    @Override
    public String getVersionCode() {
        return null;
    }

    @Override
    public String getVersionName() {
        return null;
    }

    @Override
    public boolean isPackageInstalled(String packageName) {
        return false;
    }

    @Override
    public String getMeta(String k) {
        return null;
    }

    @Override
    public boolean isDebug() {
        return false;
    }

    @Override
    public String getPackageName() {
        return null;
    }
}

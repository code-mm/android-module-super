package com.ms.module.supers.inter.utils;


import com.ms.module.supers.inter.supper.ISupper;

public interface IApkUtils  extends ISupper {
    String getAppName();

    String getVersionCode();

    String getVersionName();

    boolean isPackageInstalled(String packageName);

    String getMeta(String k);

    boolean isDebug();

    String getPackageName();
}

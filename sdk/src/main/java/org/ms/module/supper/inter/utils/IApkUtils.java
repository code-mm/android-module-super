package org.ms.module.supper.inter.utils;


import org.ms.module.supper.inter.supper.ISupper;

public interface IApkUtils  extends ISupper {

    String getAppName();

    String getVersionCode();

    String getVersionName();

    boolean isPackageInstalled(String packageName);

    String getMeta(String k);

    boolean isDebug();

    String getPackageName();

}

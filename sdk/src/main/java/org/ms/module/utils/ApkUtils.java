package org.ms.module.utils;


import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;


import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.utils.IApkUtils;

public class ApkUtils implements IApkUtils {
    private static ApkUtils apkUtils = new ApkUtils();

    public static ApkUtils getInstance() {
        return apkUtils;
    }


    @Override
    public String getAppName() {

        try {
            PackageManager packageManager = Modules.getDataModule().getApplication().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    Modules.getDataModule().getApplication().getPackageName(), 0);
            int labelRes = packageInfo.applicationInfo.labelRes;
            return Modules.getDataModule().getApplication().getResources().getString(labelRes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getVersionCode() {
        try {
            PackageManager packageManager = Modules.getDataModule().getApplication().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    Modules.getDataModule().getApplication().getPackageName(), 0);
            return packageInfo.versionCode + "";

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return 0 + "";
    }

    @Override
    public String getVersionName() {
        try {
            PackageManager packageManager =Modules.getDataModule().getApplication().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    Modules.getDataModule().getApplication().getPackageName(), 0);
            return packageInfo.versionName;

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean isPackageInstalled(String s) {

        if (s == null || "".equals(s))
            return false;
        ApplicationInfo info = null;
        try {
            info = Modules.getDataModule().getApplication().getPackageManager().getApplicationInfo(s, 0);
            return info != null;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    @Override
    public String getMeta(String s) {
        try {
            ApplicationInfo appInfo = Modules.getDataModule().getApplication().getPackageManager()
                    .getApplicationInfo(Modules.getDataModule().getApplication().getPackageName(),
                            PackageManager.GET_META_DATA);

            String values = appInfo.metaData.getString(s);
            return values;

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public boolean isDebug() {
        try {
            ApplicationInfo info = Modules.getDataModule().getApplication().getApplicationInfo();
            return (info.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }

    @Override
    public String getPackageName() {
        try {
            ApplicationInfo appInfo = Modules.getDataModule().getApplication().getPackageManager()
                    .getApplicationInfo(Modules.getDataModule().getApplication().getPackageName(),
                            PackageManager.GET_META_DATA);

            return appInfo.packageName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package com.ms.module.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.ms.module.supers.client.Modules;


/**
 * @author maohuawei created in 2018/12/17
 * <p>
 * UMID
 */
public class UMIDUtils {
    public static String getUmid() {
        SharedPreferences sharedPreferences = Modules.getDataModule().getAppData().getApplication().getSharedPreferences("com.chujian.module.mta.umid", Context.MODE_PRIVATE);
        String umid = sharedPreferences.getString("umid", "");
        if (umid == null || umid.equals("")) {
            String s = MD5Utils.getInstance().md5(MD5Utils.getInstance().md5(MD5Utils.getInstance().md5(SystemUtils.getInstance().getMac())));
            sharedPreferences.edit().putString("umid", s).commit();
            return s;
        }
        return umid;
    }
}
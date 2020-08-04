package org.ms.module.impl.common;

import android.util.Log;

import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.common.ICommonAdapter;


public class CommonImpl extends ICommonAdapter {

    private static final String TAG = "CommonImpl";

    @Override
    public void init() {
        initServerBaseUrl();
    }

    @Override
    public void initServerBaseUrl() {
        try {
            String url = Modules.getUtilsModule().getApkUtils().getMeta("com.app.server_url");
            if (url == null || "".equals(url)) {

            } else {
                Log.e(TAG, "initServerBaseUrl: " + url);
            }

            if (url != null) {
                Modules.getApiModule().setBaseUrls(url);
            }
            Modules.getRequestSettingModule().setConnectTimeout(60);
            Modules.getRequestSettingModule().setReadTimeout(60);
            Modules.getRequestSettingModule().setWriteTimeout(60);
            Modules.getRequestSettingModule().setRequestLogOut(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
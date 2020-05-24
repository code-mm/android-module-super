package org.ms.module.impl.common;
import android.util.Log;

import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.common.ICommonAdapter;
import org.ms.module.supper.inter.module.Module;

public class CommonImpl extends ICommonAdapter {
    @Override
    public void init() {
        super.init();
        initServerBaseUrl();
    }

    private static final String TAG = "CommonImpl";
    @Override
    public void initServerBaseUrl() {
        super.initServerBaseUrl();

        String url = Modules.getUtilsModule().getApkUtils().getMeta(  "com.bdlbsc.server_url");
        Log.e(TAG, "initServerBaseUrl: "+url  );
        Modules.getApiModule().setBaseUrls(url);
        Modules.getRequestSettingModule().setConnectTimeout(60);
        Modules.getRequestSettingModule().setReadTimeout(60);
        Modules.getRequestSettingModule().setWriteTimeout(60);
        Modules.getRequestSettingModule().setRequestLogOut(true);
    }
}
package org.ms.module.impl.common;
import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.common.ICommonAdapter;

public class CommonImpl extends ICommonAdapter {
    @Override
    public void init() {
        super.init();
        initServerBaseUrl();
    }
    @Override
    public void initServerBaseUrl() {
        super.initServerBaseUrl();
        String url = Modules.getUtilsModule().getApkUtils().getMeta("com.bdlbsc.base.server");
        Modules.getApiModule().setBaseUrls(url);
        Modules.getRequestSettingModule().setConnectTimeout(60);
        Modules.getRequestSettingModule().setReadTimeout(60);
        Modules.getRequestSettingModule().setWriteTimeout(60);
        Modules.getRequestSettingModule().setRequestLogOut(true);
    }
}
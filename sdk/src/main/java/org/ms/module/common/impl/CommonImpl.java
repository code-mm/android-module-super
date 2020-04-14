package org.ms.module.common.impl;

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

    }
}

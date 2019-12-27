package org.ms.module.supper.inter.api;



import org.ms.module.supper.inter.supper.ISupper;

import java.util.List;

// API 管理器
public interface IAPI extends ISupper {

    void setBaseUrls(List<String> urls);

    List<String> getBaseUrls();

    void setBaseUrl(String url);

    String getBaseUrl();

    String url(String url);

    void setStrategy(String strategy);

    void onSwitch();
}
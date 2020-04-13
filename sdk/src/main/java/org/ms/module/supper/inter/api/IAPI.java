package org.ms.module.supper.inter.api;


import org.ms.module.supper.inter.supper.ISupper;

import java.util.List;

// API 管理器
public interface IAPI extends ISupper {


    // 切换策略
    void setStrategy(String strategy);

    // 切换
    void onSwitch();

    // 设置base url
    void setBaseUrl(String... baseUrl);
    List<String> getBaseUrl();

    // 设置cdn url
    void setCdnUrl(String... cdnUrl);
    List<String> getCdnUrl();


}
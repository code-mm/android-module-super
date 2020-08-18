package com.ms.module.supers.inter.api;

import java.util.List;

public class IAPIAdapter implements IAPI {

    @Override
    public void setStrategy(String strategy) {
        System.out.println(this.getClass().getSimpleName() + "API模块未集成");
    }
    @Override
    public void onSwitch() {
        System.out.println(this.getClass().getSimpleName() + "API模块未集成");
    }
    @Override
    public void setBaseUrls(String... baseUrl) {
        System.out.println(this.getClass().getSimpleName() + "API模块未集成");
    }
    @Override
    public List<String> getBaseUrls() {
        System.out.println(this.getClass().getSimpleName() + "API模块未集成");
        return null;
    }

    @Override
    public void setCdnUrls(String... cdnUrl) {
        System.out.println(this.getClass().getSimpleName() + "API模块未集成");
    }
    @Override
    public List<String> getCdnUrls() {
        System.out.println(this.getClass().getSimpleName() + "API模块未集成");
        return null;
    }

    @Override
    public String getBaseUrl() {
        System.out.println(this.getClass().getSimpleName() + "API模块未集成");
        return null;
    }

    @Override
    public String getCdnUrl() {
        System.out.println(this.getClass().getSimpleName() + "API模块未集成");
        return null;
    }
}
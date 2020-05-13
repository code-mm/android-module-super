package org.ms.module.supper.inter.api;

import java.util.List;

public class IAPIAdapter implements IAPI {

    @Override
    public void setStrategy(String strategy) {
    }
    @Override
    public void onSwitch() {
    }
    @Override
    public void setBaseUrls(String... baseUrl) {
    }
    @Override
    public List<String> getBaseUrls() {
        return null;
    }

    @Override
    public void setCdnUrls(String... cdnUrl) {
    }
    @Override
    public List<String> getCdnUrls() {
        return null;
    }

    @Override
    public String getBaseUrl() {
        return null;
    }

    @Override
    public String getCdnUrl() {
        return null;
    }
}
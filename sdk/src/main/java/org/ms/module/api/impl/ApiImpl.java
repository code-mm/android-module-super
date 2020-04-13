package org.ms.module.api.impl;

import org.ms.module.supper.inter.api.IAPIAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApiImpl extends IAPIAdapter {

    private List<String> baseUrls = new ArrayList<>();
    private List<String> cdnUrls = new ArrayList<>();

    @Override
    public void setStrategy(String strategy) {
        super.setStrategy(strategy);
    }

    @Override
    public void onSwitch() {
        super.onSwitch();
    }

    @Override
    public void setBaseUrl(String... baseUrl) {

        for (String it : baseUrl) {
            baseUrls.add(it);
        }

        baseUrls.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public List<String> getBaseUrl() {
        return baseUrls;
    }

    @Override
    public void setCdnUrl(String... cdnUrl) {
        for (String it : cdnUrl) {
            cdnUrls.add(it);
        }

        cdnUrls.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public List<String> getCdnUrl() {
        return cdnUrls;
    }
}

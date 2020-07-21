package org.ms.module.impl.api;

import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.api.IAPIAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ApiImpl extends IAPIAdapter {

    private List<String> baseUrls = new ArrayList<>();
    private List<String> cdnUrls = new ArrayList<>();
    Random random = new Random();

    @Override
    public void setStrategy(String strategy) {
        super.setStrategy(strategy);
    }

    @Override
    public void onSwitch() {
        super.onSwitch();
    }

    @Override
    public void setBaseUrls(String... baseUrl) {

        for (String it : baseUrl) {
            baseUrls.add(it);
        }

        baseUrls.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public List<String> getBaseUrls() {
        return baseUrls;
    }

    @Override
    public void setCdnUrls(String... cdnUrl) {
        for (String it : cdnUrl) {
            cdnUrls.add(it);
        }

        cdnUrls.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public List<String> getCdnUrls() {
        return cdnUrls;
    }

    @Override
    public String getBaseUrl() {
        if (baseUrls.size() == 0) {
            return Modules.getUtilsModule().getApkUtils().getMeta("com.bdlbsc.base.server");
        }
        return baseUrls.get(0);
    }

    @Override
    public String getCdnUrl() {
        return cdnUrls.get(0);
    }
}

package com.ms.module.supers.internal;

import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.net.IRequestSetting;
import com.ms.module.supers.inter.net.IRequestSettingAdapter;


public class RequestSettingModule extends ModuleAdapter {


    private static final String CLASSPATH = "com.ms.module.impl.request.RequestSettingImpl";

    private IRequestSetting requestSetting;


    @Override
    public IRequestSetting get() {
        if (requestSetting == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IRequestSetting) {
                    requestSetting = (IRequestSetting) o;
                    if (requestSetting != null) {
                        return requestSetting;
                    } else {
                        requestSetting = new IRequestSettingAdapter();
                        return requestSetting;
                    }
                } else {
                    requestSetting = new IRequestSettingAdapter();
                    return requestSetting;
                }
            } else {
                requestSetting = new IRequestSettingAdapter();
                return requestSetting;
            }
        }
        return requestSetting;
    }
}
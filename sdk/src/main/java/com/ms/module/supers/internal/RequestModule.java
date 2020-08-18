package com.ms.module.supers.internal;

import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.net.IRequest;
import com.ms.module.supers.inter.net.IRequestAdapter;

public class RequestModule extends ModuleAdapter {


    private static final String CLASSPATH = "com.ms.module.impl.request.RequestImpl";

    private IRequest request;


    @Override
    public IRequest get() {
        if (request == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IRequest) {
                    request = (IRequest) o;
                    if (request != null) {
                        return request;
                    } else {
                        request = new IRequestAdapter();
                    }
                }
            } else {
                request = new IRequestAdapter();
            }
        }
        return request;
    }
}
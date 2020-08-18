package com.ms.module.supers.internal;

import com.ms.module.supers.inter.common.ICallBack;
import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.net.INetStatusChange;

public class NetStatusModule extends ModuleAdapter {
    private static final String CLASSPATH = "com.ms.module.impl.net.NetWorkChangReceiver";

    INetStatusChange iNetStatusChange;

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public INetStatusChange get() {
        if (iNetStatusChange == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof INetStatusChange) {
                    iNetStatusChange = (INetStatusChange) o;

                    if (iNetStatusChange != null) {
                        return iNetStatusChange;
                    } else {
                        iNetStatusChange = new INetStatusChange() {
                            @Override
                            public void listener(ICallBack callBack) {
                            }
                        };
                        return iNetStatusChange;
                    }
                }
            } else {
                iNetStatusChange = new INetStatusChange() {
                    @Override
                    public void listener(ICallBack callBack) {
                    }
                };
                return iNetStatusChange;
            }
        }
        return iNetStatusChange;
    }
}
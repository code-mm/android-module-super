package org.ms.module.supper.internal;

import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.net.INetStatusChange;

public class NetStatusModule extends ModuleAdapter {
    private static final String CLASSPATH = "org.ms.module.impl.net.NetWorkChangReceiver";

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
                    }
                }
            } else {
                iNetStatusChange = new INetStatusChange() {
                    @Override
                    public void listener(ICallBack callBack) {
                    }
                };
            }
        }
        return iNetStatusChange;
    }
}
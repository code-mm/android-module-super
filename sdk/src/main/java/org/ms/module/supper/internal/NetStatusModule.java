package org.ms.module.supper.internal;

import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.net.INetStatusChange;
import org.ms.module.supper.inter.supper.ISupper;

public class NetStatusModule extends ModuleAdapter {


    private static final String CLASSPATH = "org.ms.module.net.NetWorkChangReceiver";


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

                    }
                }
            }
        }
        return iNetStatusChange;

    }
}

package org.ms.module.supper.internal;

import org.ms.module.supper.inter.data.IData;
import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.net.IRequest;
import org.ms.module.supper.inter.net.IRequestAdapter;
import org.ms.module.supper.inter.permission.IPermission;
import org.ms.module.supper.inter.supper.ISupper;

public class RequestModule extends ModuleAdapter {


    private static final String CLASSPATH = "org.ms.module.impl.request.RequestImpl";

    private IRequest iRequest;


    @Override
    public IRequest get() {
        if (iRequest == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IRequest) {
                    iRequest = (IRequest) o;
                    if (iRequest != null) {
                        return iRequest;
                    } else {
                        iRequest = new IRequestAdapter();
                    }
                }
            }
        }
        return iRequest;
    }
}
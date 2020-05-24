package org.ms.module.supper.internal;

import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.net.IRequest;
import org.ms.module.supper.inter.net.IRequestAdapter;
import org.ms.module.supper.inter.net.IRequestSetting;


public class RequestSettingModule extends ModuleAdapter {


    private static final String CLASSPATH = "org.ms.module.impl.request.RequestSettingImpl";

    private IRequestSetting requestSetting;


    @Override
    public IRequestSetting get() {
        if (requestSetting == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IRequestSetting) {
                    requestSetting = (IRequestSetting) o;


                    if(requestSetting!=null)
                    {
                        return requestSetting;
                    }else{

                    }

                }
            }else{

            }
        }
        return requestSetting;
    }


}

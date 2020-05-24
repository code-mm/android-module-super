package org.ms.module.supper.internal;

import org.ms.module.supper.inter.api.IAPI;
import org.ms.module.supper.inter.api.IAPIAdapter;
import org.ms.module.supper.inter.common.ICommon;
import org.ms.module.supper.inter.common.ICommonAdapter;
import org.ms.module.supper.inter.module.ModuleAdapter;


public class CommonModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.common.CommonImpl";

    private ICommon iCommon;


    @Override
    public ICommon get() {
        if (iCommon == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof ICommon) {
                    iCommon = (ICommon) o;
                    if(iCommon!=null)
                    {
                        return iCommon;
                    }else{
                        iCommon=new ICommonAdapter();
                    }
                }
            }else{

            }
        }
        return iCommon;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
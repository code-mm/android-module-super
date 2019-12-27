package org.ms.module.supper.internal;



import org.ms.module.supper.inter.api.IAPI;
import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.net.IRequest;
import org.ms.module.supper.inter.permission.IPermission;
import org.ms.module.supper.inter.supper.ISupper;

public class PermissionModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.permission.impl.PermisionImpl";

    private IPermission iPermission;

    @Override
    public IPermission get() {
        if (iPermission == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IPermission) {
                    iPermission = (IPermission) o;
                } else {
                    System.out.println("! instanceof ");
                }
            } else {
                System.out.println("o == null");
            }
        }
        return iPermission;
    }
}

package org.ms.module.supper.internal;


import androidx.fragment.app.FragmentActivity;

import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.permission.IPermission;
import org.ms.module.supper.inter.permission.IPermissionAdapter;

public class PermissionModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.permission.PermisionImpl";

    private IPermission permission;

    @Override
    public IPermission get() {
        if (permission == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IPermission) {
                    permission = (IPermission) o;
                } else {
                    permission = new IPermissionAdapter();
                }
            } else {
                permission = new IPermissionAdapter();
            }
        }
        return permission;
    }
}

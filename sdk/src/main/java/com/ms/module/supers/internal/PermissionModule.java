package com.ms.module.supers.internal;


import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.permission.IPermission;
import com.ms.module.supers.inter.permission.IPermissionAdapter;

public class PermissionModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.permission.PermisionImpl";

    private IPermission permission;

    @Override
    public IPermission get() {
        if (permission == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IPermission) {
                    permission = (IPermission) o;
                    return permission;
                } else {
                    permission = new IPermissionAdapter();
                    return permission;
                }
            } else {
                permission = new IPermissionAdapter();
                return permission;
            }
        }
        return permission;
    }
}

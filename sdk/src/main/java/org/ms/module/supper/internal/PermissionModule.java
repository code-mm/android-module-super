package org.ms.module.supper.internal;



import androidx.fragment.app.FragmentActivity;

import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.permission.IPermission;

public class PermissionModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.permission.PermisionImpl";

    private IPermission iPermission;

    @Override
    public IPermission get() {
        if (iPermission == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IPermission) {
                    iPermission = (IPermission) o;
                } else {
                    iPermission = new IPermission() {
                        @Override
                        public void request(FragmentActivity activity, ICallBack callBack, String... pers) {

                        }
                    };
                }
            }
        }
        return iPermission;
    }
}

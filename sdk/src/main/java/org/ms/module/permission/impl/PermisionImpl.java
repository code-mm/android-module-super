package org.ms.module.permission.impl;



import android.support.v4.app.FragmentActivity;

import org.ms.module.permission.PermissionUtilsImpl;
import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.permission.IPermission;

public class PermisionImpl implements IPermission {
    @Override
    public void request(FragmentActivity activity, final ICallBack callBack, String... pers) {

        PermissionUtilsImpl.requestPermission(activity, new PermissionUtilsImpl.CallBack() {
            @Override
            public void callBack() {

                if (callBack != null) {
                    callBack.onSuccess("");
                }

            }
        }, pers);

    }
}

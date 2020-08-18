package com.ms.module.impl.permission;


import androidx.fragment.app.FragmentActivity;

import com.ms.module.supers.inter.common.ICallBack;
import com.ms.module.supers.inter.permission.IPermission;

public class PermisionImpl implements IPermission {
    @Override
    public void request(FragmentActivity activity, final ICallBack callBack, String... pers) {

        PermissionUtilsImpl.requestPermission(activity, new PermissionUtilsImpl.CallBack() {
            @Override
            public void success() {
                if (callBack != null) {
                    callBack.onSuccess("");
                }
            }

            @Override
            public void filure() {
                if (callBack != null) {
                    callBack.onFailure("");
                }
            }

        }, pers);

    }
}

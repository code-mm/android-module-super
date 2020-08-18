package com.ms.module.impl.permission;


import androidx.fragment.app.FragmentActivity;

import com.ms.module.supers.inter.common.ICallBack;
import com.ms.module.supers.inter.permission.IPermission;

public class PermissionImpl implements IPermission {


    @Override
    public void request(FragmentActivity fragmentActivity, final ICallBack iCallBack, String... strings) {

        PermissionUtilsImpl.requestPermission(fragmentActivity, new PermissionUtilsImpl.CallBack() {
            @Override
            public void success() {
                if (iCallBack != null) {
                    iCallBack.onSuccess("");
                }
            }

            @Override
            public void filure() {
                if (iCallBack != null) {
                    iCallBack.onFailure("");
                }
            }
        }, strings);

    }
}

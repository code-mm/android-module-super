package org.ms.module.impl.permission;


import androidx.fragment.app.FragmentActivity;

import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.permission.IPermission;

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

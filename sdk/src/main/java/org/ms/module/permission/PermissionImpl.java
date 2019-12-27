package org.ms.module.permission;



import android.support.v4.app.FragmentActivity;

import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.permission.IPermission;

public class PermissionImpl implements IPermission {


    @Override
    public void request(FragmentActivity fragmentActivity, final ICallBack iCallBack, String... strings) {

        PermissionUtilsImpl.requestPermission(fragmentActivity, new PermissionUtilsImpl.CallBack() {
            @Override
            public void callBack() {

                if (iCallBack != null) {
                    iCallBack.onSuccess("");
                }

            }
        }, strings);

    }
}

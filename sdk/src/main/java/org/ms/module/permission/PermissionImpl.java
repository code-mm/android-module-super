package org.ms.module.permission;



import androidx.fragment.app.FragmentActivity;

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

package org.ms.module.supper.inter.permission;

import androidx.fragment.app.FragmentActivity;

import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.supper.ISupper;

/// 权限
public interface IPermission extends ISupper {

    void request(FragmentActivity activity, ICallBack callBack, String... pers);

}
package org.ms.module.supper.inter.permission;

import androidx.fragment.app.FragmentActivity;



import org.ms.module.base.inter.IModel;
import org.ms.module.supper.inter.common.ICallBack;

/// 权限
public interface IPermission extends IModel {


    void request(FragmentActivity activity, ICallBack callBack, String... pers);


}

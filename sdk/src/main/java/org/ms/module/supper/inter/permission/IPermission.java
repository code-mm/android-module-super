package org.ms.module.supper.inter.permission;

import android.support.v4.app.FragmentActivity;



import org.ms.module.base.inter.IModel;
import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.supper.ISupper;

/// 权限
public interface IPermission extends IModel {


    void request(FragmentActivity activity, ICallBack callBack, String... pers);


}

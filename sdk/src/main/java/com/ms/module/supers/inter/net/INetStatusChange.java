package com.ms.module.supers.inter.net;

import com.ms.module.supers.inter.common.ICallBack;
import com.ms.module.supers.inter.supper.ISupper;

public interface INetStatusChange  extends ISupper {

    void listener(ICallBack callBack);

}

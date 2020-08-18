package com.ms.module.supers.inter.net;

import com.ms.module.supers.inter.supper.ISupper;

public interface IRequestSetting  extends ISupper {


    void setConnectTimeout(int value);
    int getConnectTimeout();

    void setReadTimeout(int value);
    int getReadTimeout();

    void setWriteTimeout(int value);
    int getWriteTimeout();

    void setRequestLogOut(boolean flag);
    boolean getRequestLogOut();


}

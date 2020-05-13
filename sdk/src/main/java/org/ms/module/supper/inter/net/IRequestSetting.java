package org.ms.module.supper.inter.net;

import org.ms.module.supper.inter.supper.ISupper;

import java.util.concurrent.TimeUnit;

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

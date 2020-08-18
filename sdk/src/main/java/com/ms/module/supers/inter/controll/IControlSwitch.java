package com.ms.module.supers.inter.controll;

import com.ms.module.supers.inter.supper.ISupper;

public interface IControlSwitch extends ISupper {

    // 日志
    void setLogOut(boolean flag);
    boolean getLogOut();


    // 堆栈
    void setPrintStackTrace(boolean flag);
    boolean getPrintStackTrace();


    // 网络请求日志
    void setRequestLog(boolean flag);
    boolean getRequestLog();
}
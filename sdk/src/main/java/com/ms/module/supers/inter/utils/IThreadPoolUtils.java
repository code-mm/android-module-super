package com.ms.module.supers.inter.utils;


import com.ms.module.supers.inter.supper.ISupper;

public interface IThreadPoolUtils extends ISupper {

    //运行在主线程
    void runOnMainThread(Runnable runnable);

    void runSubThread(Runnable runnable);

    void kill();
}

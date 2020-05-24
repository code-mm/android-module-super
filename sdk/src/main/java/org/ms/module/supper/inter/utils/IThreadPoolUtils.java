package org.ms.module.supper.inter.utils;


import org.ms.module.supper.inter.supper.ISupper;

public interface IThreadPoolUtils extends ISupper {

    //运行在主线程
    void runOnMainThread(Runnable runnable);

    void runSubThread(Runnable runnable);

    void kill();
}

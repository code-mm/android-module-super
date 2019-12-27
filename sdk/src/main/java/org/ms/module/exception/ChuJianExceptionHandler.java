package org.ms.module.exception;


import android.util.Log;

/**
 * @author maohuawei created in 2018/10/23
 * <p>
 * 全局捕获异常处理
 */

public final class ChuJianExceptionHandler implements Thread.UncaughtExceptionHandler {

    private static final String TAG = "ChuJian.Exception.Handler";

    private static final int SLEEP_TIMEOUT_MS = 400;

    private static ChuJianExceptionHandler sInstance;
    private final Thread.UncaughtExceptionHandler mDefaultExceptionHandler;

    public ChuJianExceptionHandler() {
        mDefaultExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void init() {
        if (sInstance == null) {
            synchronized (ChuJianExceptionHandler.class) {
                if (sInstance == null) {
                    sInstance = new ChuJianExceptionHandler();
                }
            }
        }
    }

    @Override
    public void uncaughtException(final Thread t, final Throwable e) {

        //e.printStackTrace();

        System.out.println("err : " + e.getMessage());


        if (mDefaultExceptionHandler != null) {
            mDefaultExceptionHandler.uncaughtException(t, e);
        } else {

            System.out.println(e.getMessage());

            //TODO
            ////////////////////////////////
            // 抓取异常 发送服务器
            ////////////////////////////////
            //退出
            killProcessAndExit();
        }
    }

    private void killProcessAndExit() {
        try {
            //等待
            Thread.sleep(SLEEP_TIMEOUT_MS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 杀死进程
        android.os.Process.killProcess(android.os.Process.myPid());
        // 退出JVM
        System.exit(100);
    }
}
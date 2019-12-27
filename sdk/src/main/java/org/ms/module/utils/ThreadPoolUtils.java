package org.ms.module.utils;

import android.os.Handler;
import android.os.Looper;

import org.ms.module.supper.inter.utils.IThreadPoolUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author maohuawei created in 2018/10/8
 */
public final class ThreadPoolUtils implements IThreadPoolUtils {


    private static ThreadPoolUtils threadPoolUtils = new ThreadPoolUtils();

    public static ThreadPoolUtils getInstance() {
        return threadPoolUtils;
    }


    /**
     * 线程池
     * <p>
     * 常规方法
     * private static ExecutorService singleThreadExecutor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
     * ----------
     * 线程优化
     * 获取CPU核心数
     * java Runtime.getRuntime().availableProcessors()
     * <p>
     * 核心线程数
     * CPU核心数+1
     * <p>
     * 最大线程数
     * CPU核心数*2+1
     */
    static ExecutorService singleThreadExecutor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors() + 1, Runtime.getRuntime().availableProcessors() * 2 + 1,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>());

    /**
     * 实例化Handler
     */
    private static Handler handler = new Handler(Looper.getMainLooper());


    /**
     * 私有化构造方法
     */
    private ThreadPoolUtils() {
    }

    /**
     * 调度到UI线程
     *
     * @param runnable
     */
    public void runOnMainThread(Runnable runnable) {
        handler.post(runnable);
    }

    /**
     * 工作线程
     *
     * @param runnable
     */
    public void runSubThread(Runnable runnable) {
        if (!singleThreadExecutor.isShutdown()) {
            singleThreadExecutor.execute(runnable);
        }
    }


    /**
     * 关闭线程池
     */
    public void kill() {
        if (!singleThreadExecutor.isShutdown()) {
            singleThreadExecutor.shutdown();
        }
    }
}

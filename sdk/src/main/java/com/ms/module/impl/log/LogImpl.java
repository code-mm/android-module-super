package com.ms.module.impl.log;

import com.ms.module.supers.client.Modules;
import com.ms.module.supers.inter.log.IlogAdapter;

public class LogImpl extends IlogAdapter {

    private boolean aliyun_send = false;

    @Override
    public void setAliyunSend(boolean f) {
        this.aliyun_send = f;
    }

    @Override
    public void print(String log) {
        System.out.print(log);
    }

    @Override
    public void println(String log) {
        System.out.println(log);
    }

    @Override
    public void i(String tag, String log) {

        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[3];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();

        LogUtils.i(tag, log);

        if (aliyun_send)
            Modules.getAliyuLogModule().log(methodName, className, fileName, lineNumber, tag, log);

    }

    @Override
    public void d(String tag, String log) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[3];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();

        LogUtils.d(tag, log);
        if (aliyun_send)
            Modules.getAliyuLogModule().log(methodName, className, fileName, lineNumber, tag, log);
    }

    @Override
    public void e(String tag, String log) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[3];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();

        LogUtils.e(tag, log);
        if (aliyun_send)
            Modules.getAliyuLogModule().log(methodName, className, fileName, lineNumber, tag, log);
    }

    @Override
    public void json(String tag, String log) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[3];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();

        LogUtils.json(tag, log);
        if (aliyun_send)
            Modules.getAliyuLogModule().log(methodName, className, fileName, lineNumber, tag, log);
    }

    @Override
    public void xml(String tag, String log) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[3];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();

        LogUtils.xml(tag, log);
        if (aliyun_send)
            Modules.getAliyuLogModule().log(methodName, className, fileName, lineNumber, tag, log);
    }
}

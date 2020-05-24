package org.ms.module.impl.log;

import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.aliyun.log.IAliyuLog;
import org.ms.module.supper.inter.log.IlogAdapter;

public class LogImpl extends IlogAdapter {
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

        Modules.getAliyuLogModule().log(methodName, className, fileName, lineNumber, tag, log);
    }
}

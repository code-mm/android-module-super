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

        String logText ="\n\n====================\n\t\t\t日志 ： \nfileName : "+  fileName + " \nclassName : " + className + "  \nmethodName : " + methodName + " \nlineNumber : " + lineNumber + " \nlog : " + log+"\n======================\n\n";

        LogUtils.i("\n\n"+tag+"\n\n", logText);
        LogUtils.i("\n\n"+tag+"\n\n", log);
        IAliyuLog aliyuLogModule = Modules.getAliyuLogModule();
        if (aliyuLogModule != null) {
            aliyuLogModule.log(tag, logText);
        }
    }

    @Override
    public void d(String tag, String log) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[3];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();

        String logText ="\n\n====================\n\t\t\t日志 ： \nfileName : "+  fileName + " \nclassName : " + className + "  \nmethodName : " + methodName + " \nlineNumber : " + lineNumber + " \nlog : " + log+"\n======================\n\n";

        LogUtils.d("\n\n"+tag+"\n\n", logText);
        LogUtils.d("\n\n"+tag+"\n\n", log);
        IAliyuLog aliyuLogModule = Modules.getAliyuLogModule();
        if (aliyuLogModule != null) {
            aliyuLogModule.log(tag, logText);
        }
    }

    @Override
    public void e(String tag, String log) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[3];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();

        String logText ="\n\n====================\n\t\t\t日志 ： \nfileName : "+  fileName + " \nclassName : " + className + "  \nmethodName : " + methodName + " \nlineNumber : " + lineNumber + " \nlog : " + log+"\n======================\n\n";


        LogUtils.e("\n\n"+tag+"\n\n", logText);
        LogUtils.e("\n\n"+tag+"\n\n", log);
        IAliyuLog aliyuLogModule = Modules.getAliyuLogModule();
        if (aliyuLogModule != null) {
            aliyuLogModule.log(tag, logText);
        }
    }

    @Override
    public void json(String tag, String log) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[3];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();

        String logText ="\n\n====================\n\t\t\t日志 ： \nfileName : "+  fileName + " \nclassName : " + className + "  \nmethodName : " + methodName + " \nlineNumber : " + lineNumber + " \nlog : " + log+"\n======================\n\n";


        LogUtils.json("\n\n"+tag+"\n\n", logText);
        LogUtils.json("\n\n"+tag+"\n\n", log);
        IAliyuLog aliyuLogModule = Modules.getAliyuLogModule();
        if (aliyuLogModule != null) {
            aliyuLogModule.log(tag, logText);
        }
    }

    @Override
    public void xml(String tag, String log) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[3];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();

        String logText ="\n\n====================\n\t\t\t日志 ： \nfileName : "+  fileName + " \nclassName : " + className + "  \nmethodName : " + methodName + " \nlineNumber : " + lineNumber + " \nlog : " + log+"\n======================\n\n";


        LogUtils.xml("\n\n"+tag+"\n\n", logText);
        LogUtils.xml("\n\n"+tag+"\n\n", log);
        IAliyuLog aliyuLogModule = Modules.getAliyuLogModule();
        if (aliyuLogModule != null) {
            aliyuLogModule.log(tag, logText);
        }
    }
}
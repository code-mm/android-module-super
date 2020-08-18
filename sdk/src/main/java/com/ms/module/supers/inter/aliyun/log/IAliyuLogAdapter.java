package com.ms.module.supers.inter.aliyun.log;

public class IAliyuLogAdapter implements IAliyuLog {

    private static final String TAG = "IAliyuLogAdapter";

    @Override
    public void log(String TAG, String logText) {
        System.out.println(this.getClass().getSimpleName()+"阿里云日志插件未集成");
    }

    @Override
    public void log(String methodName, String className, String fileName, int lineNumber, String tag, String log) {
        System.out.println(this.getClass().getSimpleName()+"阿里云日志插件未集成");
    }

    @Override
    public void setEndpoint(String endpoint) {
        System.out.println(this.getClass().getSimpleName()+"阿里云日志插件未集成");
    }

    @Override
    public String getEndpoint() {
        System.out.println(this.getClass().getSimpleName()+"阿里云日志插件未集成");
        return null;
    }

    @Override
    public void setProject(String projectName) {
        System.out.println(this.getClass().getSimpleName()+"阿里云日志插件未集成");
    }

    @Override
    public String getProject() {
        System.out.println(this.getClass().getSimpleName()+"阿里云日志插件未集成");

        return null;
    }

    @Override
    public void setLogStore(String store) {
        System.out.println(this.getClass().getSimpleName()+"阿里云日志插件未集成");
    }

    @Override
    public String getLogStore() {
        System.out.println(this.getClass().getSimpleName()+"阿里云日志插件未集成");
        return null;
    }

    @Override
    public void send(boolean send) {
        System.out.println(this.getClass().getSimpleName()+"阿里云日志插件未集成");
    }
}

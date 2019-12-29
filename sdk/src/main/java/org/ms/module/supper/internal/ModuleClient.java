package org.ms.module.supper.internal;

public class ModuleClient {


    private static LogModule logModule;

    public static LogModule getLogModule() {
        if (logModule == null) {
            logModule = new LogModule();
        }
        return logModule;
    }


    private static ApiModule apiModule;

    public static ApiModule getApiModule() {

        if (apiModule == null) {
            apiModule = new ApiModule();
        }
        return apiModule;
    }


    public static UtilsModule utilsModule;


    public static UtilsModule getUtilsModule() {

        if (utilsModule == null) {
            utilsModule = new UtilsModule();
        }


        return utilsModule;
    }


    private static DataModule dataModule;

    public static DataModule getDataModule() {
        if (dataModule == null) {
            dataModule = new DataModule();
        }
        return dataModule;
    }


    private static PermissionModule permissionModule;

    public static PermissionModule getPermissionModule() {
        if (permissionModule == null) {
            permissionModule = new PermissionModule();
        }
        return permissionModule;
    }

    private static RequestModule requestModule;

    public static RequestModule getRequestModule() {
        if (requestModule == null) {
            requestModule = new RequestModule();
        }
        return requestModule;
    }

    private static ExceptionModule exceptionModule;

    public static ExceptionModule getExceptionModule() {
        if (exceptionModule == null) {
            exceptionModule = new ExceptionModule();
        }
        return exceptionModule;
    }

    private static MMKVModule mmkvModule;

    public static MMKVModule getMmkvModule() {

        if (mmkvModule == null) {
            mmkvModule = new MMKVModule();
        }

        return mmkvModule;
    }

    private static DataPersistenceModule dataPersistenceModule;


    public static DataPersistenceModule getDataPersistenceModule() {
        if (dataPersistenceModule == null) {
            dataPersistenceModule = new DataPersistenceModule();
        }


        return dataPersistenceModule;
    }


    private static ControllSwitchModule controllSwitchModule;

    public static ControllSwitchModule getControllSwitchModule() {

        if (controllSwitchModule == null) {
            controllSwitchModule = new ControllSwitchModule();
        }


        return controllSwitchModule;
    }


    NetStatusModule netStatusModule;

    public NetStatusModule getNetStatusModule() {

        if (netStatusModule == null) {
            netStatusModule = new NetStatusModule();
        }
        return netStatusModule;
    }
}

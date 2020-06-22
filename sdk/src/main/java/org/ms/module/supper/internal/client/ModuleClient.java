package org.ms.module.supper.internal.client;

import org.ms.module.supper.internal.AliyuLogModule;
import org.ms.module.supper.internal.AliyunSTSModule;
import org.ms.module.supper.internal.ApiModule;
import org.ms.module.supper.internal.CommonModule;
import org.ms.module.supper.internal.ControllSwitchModule;
import org.ms.module.supper.internal.DataModule;
import org.ms.module.supper.internal.DataPersistenceModule;
import org.ms.module.supper.internal.ExceptionModule;
import org.ms.module.supper.internal.LogModule;
import org.ms.module.supper.internal.MMKVModule;
import org.ms.module.supper.internal.NetStatusModule;
import org.ms.module.supper.internal.PermissionModule;
import org.ms.module.supper.internal.RequestModule;
import org.ms.module.supper.internal.RequestSettingModule;
import org.ms.module.supper.internal.TencentBuglyModule;
import org.ms.module.supper.internal.UtilsModule;

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


    private static NetStatusModule netStatusModule;

    public static NetStatusModule getNetStatusModule() {

        if (netStatusModule == null) {
            netStatusModule = new NetStatusModule();
        }
        return netStatusModule;
    }


    private static CommonModule commonModule;


    public static CommonModule getCommonModule() {
        if (commonModule == null) {
            commonModule = new CommonModule();
        }
        return commonModule;
    }

    private static RequestSettingModule requestSettingModule;

    public static RequestSettingModule getRequestSettingModule() {

        if (requestSettingModule == null) {
            requestSettingModule = new RequestSettingModule();
        }
        return requestSettingModule;
    }

    private static AliyuLogModule aliyuLogModule;

    public static AliyuLogModule getAliyuLogModule() {

        if (aliyuLogModule == null) {
            aliyuLogModule = new AliyuLogModule();
        }
        return aliyuLogModule;
    }


    private static AliyunSTSModule aliyunSTSModule;

    public static AliyunSTSModule getAliyunSTSModule() {

        if (aliyunSTSModule == null) {
            aliyunSTSModule = new AliyunSTSModule();
        }
        return aliyunSTSModule;
    }


    private static TencentBuglyModule tencentBuglyModule;

    public static TencentBuglyModule getTencentBuglyModule() {

        if (tencentBuglyModule == null) {
            tencentBuglyModule = new TencentBuglyModule();
        }

        return tencentBuglyModule;
    }


}
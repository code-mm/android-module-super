package com.ms.module.supers.client;


import com.ms.module.supers.inter.aliyun.log.IAliyuLog;
import com.ms.module.supers.inter.aliyun.sts.ISTS;
import com.ms.module.supers.inter.bugly.ITencentBugly;
import com.ms.module.supers.inter.common.ICommon;
import com.ms.module.supers.inter.controll.IControlSwitch;
import com.ms.module.supers.inter.api.IAPI;
import com.ms.module.supers.inter.data.IData;
import com.ms.module.supers.inter.datapersistence.IDataPersistence;
import com.ms.module.supers.inter.exception.IException;
import com.ms.module.supers.inter.log.*;
import com.ms.module.supers.inter.mmkv.IMMKV;
import com.ms.module.supers.inter.net.INetStatusChange;
import com.ms.module.supers.inter.net.IRequest;
import com.ms.module.supers.inter.net.IRequestSetting;
import com.ms.module.supers.inter.permission.IPermission;
import com.ms.module.supers.inter.utils.IUtils;
import com.ms.module.supers.internal.client.ModuleClient;

public class Modules {
    private Modules() {
    }

    public static final String VERSION = "latest";

    public static IControlSwitch getControlSwitch() {
        return ModuleClient.getControllSwitchModule().get();
    }

    public static ILog getLogModule() {
        return ModuleClient.getLogModule().get();
    }

    public static IAPI getApiModule() {
        return ModuleClient.getApiModule().get();
    }

    public static IUtils getUtilsModule() {
        return ModuleClient.getUtilsModule().get();
    }

    public static IData getDataModule() {
        return ModuleClient.getDataModule().get();
    }

    public static IPermission getPermissionModule() {
        return ModuleClient.getPermissionModule().get();
    }

    public static IRequest getRequestModule() {
        return ModuleClient.getRequestModule().get();
    }

    public static IException getExceptionModule() {
        return ModuleClient.getExceptionModule().get();
    }

    public static IMMKV getMmkvModule() {
        return ModuleClient.getMmkvModule().get();
    }

    public static IDataPersistence getDataPersistenceModule() {
        return ModuleClient.getDataPersistenceModule().get();
    }

    public static ICommon getCommonModule() {
        return ModuleClient.getCommonModule().get();
    }

    public static IRequestSetting getRequestSettingModule() {
        return ModuleClient.getRequestSettingModule().get();
    }

    public static IAliyuLog getAliyuLogModule() {
        return ModuleClient.getAliyuLogModule().get();
    }

    public static ISTS getAliyunSTSModule() {
        return ModuleClient.getAliyunSTSModule().get();
    }

    public static ITencentBugly getTencentBuglyModule() {
        return ModuleClient.getTencentBuglyModule().get();
    }

    public static INetStatusChange getNetStatusModule() {
        return ModuleClient.getNetStatusModule().get();
    }
}
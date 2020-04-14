package org.ms.module.supper.client;


import org.ms.module.supper.inter.common.ICommon;
import org.ms.module.supper.inter.controll.IControlSwitch;
import org.ms.module.supper.inter.api.IAPI;
import org.ms.module.supper.inter.data.IData;
import org.ms.module.supper.inter.datapersistence.IDataPersistence;
import org.ms.module.supper.inter.exception.IException;
import org.ms.module.supper.inter.log.*;
import org.ms.module.supper.inter.matrix.IMatrix;
import org.ms.module.supper.inter.matrix.IMatrixApi;
import org.ms.module.supper.inter.mmkv.IMMKV;
import org.ms.module.supper.inter.net.IRequest;
import org.ms.module.supper.inter.permission.IPermission;
import org.ms.module.supper.inter.utils.IUtils;
import org.ms.module.supper.internal.ModuleClient;

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

    public static IMatrix getMatrixModule() {
        return ModuleClient.getMatrixModule().get();
    }

    public static IMatrixApi getMatrixApiModule() {
        return ModuleClient.getMatrixApiModule().get();
    }


    public static ICommon getCommonModule()
    {
        return ModuleClient.getCommonModel().get();
    }


}
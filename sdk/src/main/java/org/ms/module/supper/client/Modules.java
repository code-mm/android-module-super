package org.ms.module.supper.client;


import org.ms.module.supper.inter.api.IAPI;
import org.ms.module.supper.inter.data.IData;
import org.ms.module.supper.inter.exception.IException;
import org.ms.module.supper.inter.log.*;
import org.ms.module.supper.inter.net.IRequest;
import org.ms.module.supper.inter.permission.IPermission;
import org.ms.module.supper.inter.utils.IUtils;
import org.ms.module.supper.internal.ModuleClient;

public class Modules {

    private Modules() {
    }
    public static final String VERSION = "laster-dev";
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
}

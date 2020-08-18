package com.ms.module.impl.utils;

import com.ms.module.supers.client.Modules;
import com.ms.module.supers.inter.utils.IResUtils;

public class ResUtils implements IResUtils {

    private static final ResUtils INSTANCE = new ResUtils();

    public static ResUtils getInstance() {
        return INSTANCE;
    }

    public int getLayoutId(String paramString) {

        return Modules.getDataModule().getAppData().getApplication().getResources().getIdentifier(paramString, "layout",
                Modules.getDataModule().getAppData().getApplication().getPackageName());
    }


    public int getStringId(String paramString) {
        return Modules.getDataModule().getAppData().getApplication().getResources().getIdentifier(paramString, "string",
                Modules.getDataModule().getAppData().getApplication().getPackageName());
    }

    public int getDrawableId(String paramString) {
        return Modules.getDataModule().getAppData().getApplication().getResources().getIdentifier(paramString,
                "drawable", Modules.getDataModule().getAppData().getApplication().getPackageName());
    }

    public int getStyleId(String paramString) {
        return Modules.getDataModule().getAppData().getApplication().getResources().getIdentifier(paramString,
                "style", Modules.getDataModule().getAppData().getApplication().getPackageName());
    }

    public int getId(String paramString) {
        return Modules.getDataModule().getAppData().getApplication().getResources().getIdentifier(paramString, "id", Modules.getDataModule().getAppData().getApplication().getPackageName());
    }

    public int getColorId(String paramString) {
        return Modules.getDataModule().getAppData().getApplication().getResources().getIdentifier(paramString,
                "color", Modules.getDataModule().getAppData().getApplication().getPackageName());
    }

    public int getArrayId(String paramString) {
        return Modules.getDataModule().getAppData().getApplication().getResources().getIdentifier(paramString,
                "array", Modules.getDataModule().getAppData().getApplication().getPackageName());
    }

    @Override
    public String getString(int id) {
        return Modules.getDataModule().getAppData().getApplication().getString(id);
    }
}
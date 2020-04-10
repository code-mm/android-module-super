package org.ms.module.utils;

import org.ms.module.supper.inter.utils.IGsonUtils;
import org.ms.module.utils.gson.GsonUtils;

import java.lang.reflect.Type;

public class GsonUtilsImpl implements IGsonUtils {
    @Override
    public String toJson(Object object) {
        return GsonUtils.getInstance().toJson(object);
    }

    @Override
    public <T> T format(String json, Class<T> classOfT) {
        return GsonUtils.getInstance().fromJson(json, classOfT);
    }

    @Override
    public <T> T fromJson(String json, Type typeOfT) {
        return GsonUtils.getInstance().fromJson(json, typeOfT);
    }
}
package com.ms.module.impl.utils;

import com.ms.module.supers.inter.utils.IGsonUtils;
import com.ms.module.impl.utils.gson.GsonUtils;

import java.lang.reflect.Type;

public class GsonUtilsImpl implements IGsonUtils {
    @Override
    public String toJson(Object object) {
        return GsonUtils.getInstance().toJson(object);
    }

    @Override
    public <T> T fromJson(String json, Class<T> classOfT) {
        return GsonUtils.getInstance().fromJson(json, classOfT);
    }

    @Override
    public <T> T fromJson(String json, Type typeOfT) {
        return GsonUtils.getInstance().fromJson(json, typeOfT);
    }
}
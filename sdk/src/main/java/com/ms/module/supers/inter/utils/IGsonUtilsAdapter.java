package com.ms.module.supers.inter.utils;

import java.lang.reflect.Type;

public class IGsonUtilsAdapter implements  IGsonUtils {
    @Override
    public String toJson(Object object) {
        return null;
    }

    @Override
    public <T> T fromJson(String json, Class<T> classOfT) {
        return null;
    }

    @Override
    public <T> T fromJson(String json, Type typeOfT) {
        return null;
    }
}

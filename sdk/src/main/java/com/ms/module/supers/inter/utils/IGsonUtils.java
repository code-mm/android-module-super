package com.ms.module.supers.inter.utils;


import com.ms.module.supers.inter.supper.ISupper;

import java.lang.reflect.Type;

public interface IGsonUtils extends ISupper {
    String toJson(Object object);

    <T> T fromJson(String json, Class<T> classOfT);

    <T> T fromJson(String json, Type typeOfT);
}


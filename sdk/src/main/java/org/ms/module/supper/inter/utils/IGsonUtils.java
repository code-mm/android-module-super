package org.ms.module.supper.inter.utils;


import org.ms.module.supper.inter.supper.ISupper;

public interface IGsonUtils extends ISupper {
    String toJson(Object object);


    <T> T format(String json, Class<T> classOfT);
}


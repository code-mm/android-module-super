package com.ms.module.impl.utils.gson;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class GsonUtils {

    private static GsonUtils instance;

    private static Gson gson;

    private GsonUtils() {
        gson = new Gson();
    }

    public static GsonUtils getInstance() {
        if (instance == null) {
            synchronized (GsonUtils.class) {
                instance = new GsonUtils();
            }
        }
        return instance;
    }

    public String toJson(Object object) {
        return gson.toJson(object);
    }

    public <T> T fromJson(String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }

    public <T> T fromJson(String json, Type typeOfT)  {
        return gson.fromJson(json, typeOfT);
    }
}

package org.ms.module.impl.utils.okhttp;

import org.ms.module.supper.client.Modules;

import okhttp3.*;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class OkHttpUtils {
    public static long CONNECTTIMEOUT = 60;
    public static long READTIMEOUT = 60;
    public static long WRITETIMEOUT = 60;

    private OkHttpUtils() {
    }

    private static OkHttpClient client;

    public static OkHttpClient getInstance() {
        if (client == null) {

            OkHttpClient.Builder builder = new OkHttpClient.Builder();

            if (Modules.getRequestSettingModule().getConnectTimeout() != 0) {
                builder.connectTimeout(Modules.getRequestSettingModule().getConnectTimeout(), TimeUnit.SECONDS);
            } else {
                builder.connectTimeout(CONNECTTIMEOUT, TimeUnit.SECONDS);
            }

            if (Modules.getRequestSettingModule().getWriteTimeout() != 0) {
                builder.connectTimeout(Modules.getRequestSettingModule().getWriteTimeout(), TimeUnit.SECONDS);
            } else {
                builder.readTimeout(READTIMEOUT, TimeUnit.SECONDS);
            }

            if (Modules.getRequestSettingModule().getReadTimeout() != 0) {
                builder.connectTimeout(Modules.getRequestSettingModule().getReadTimeout(), TimeUnit.SECONDS);
            } else {
                builder.writeTimeout(WRITETIMEOUT, TimeUnit.SECONDS);
            }


            if (Modules.getRequestSettingModule().getRequestLogOut()) {
                builder.addInterceptor(new LogInterceptor());
            }


            client = builder.build();
        }
        return client;
    }


    public static void doGet(Map<String, String> headers, String url, Callback callback) {

        //创建OkHttpClient请求对象
        OkHttpClient okHttpClient = getInstance();

        Request.Builder request = new Request.Builder();
        if (headers != null) {
            for (String k : headers.keySet()) {
                request.addHeader(k, headers.get(k));
            }
        }

        //创建Request
        request.url(url);
        //得到Call对象
        Call call = okHttpClient.newCall(request.build());
        //执行异步请求
        call.enqueue(callback);
    }


    public static void doPost(
            Map<String, String> headers,
            String url,
            Map<String, String> params,
            Callback callback) {
        Request.Builder request = new Request.Builder();
        if (headers != null) {
            for (String k : headers.keySet()) {
                request.addHeader(k, headers.get(k));
            }
        }
        request.url(url);

        FormBody.Builder builder = new FormBody.Builder();

        for (String key : params.keySet()) {
            builder.add(key, params.get(key));

        }
        request.post(builder.build());
        getInstance().newCall(request.build()).enqueue(callback);
    }

    public static void doRequestBody(
            Map<String, String> headers,
            String url,
            String body,
            Callback callback) {
        Request.Builder request = new Request.Builder();
        if (headers != null) {
            for (String k : headers.keySet()) {
                request.addHeader(k, headers.get(k));
            }
        }
        request.url(url);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), body);
        request.post(requestBody);
        getInstance().newCall(request.build()).enqueue(callback);
    }
}
package org.ms.module.utils.okhttp;
import okhttp3.*;

import java.util.Map;
import java.util.concurrent.TimeUnit;
public class OkHttpUtils {
    public static long CONNECTTIMEOUT = 5;
    public static long READTIMEOUT = 5;
    public static long WRITETIMEOUT = 5;

    private OkHttpUtils() {
    }

    private static OkHttpClient client;

    public static OkHttpClient getInstance() {
        if (client == null) {
            client = new OkHttpClient.Builder()
                    .connectTimeout(CONNECTTIMEOUT, TimeUnit.SECONDS)
                    .readTimeout(READTIMEOUT, TimeUnit.SECONDS)
                    .writeTimeout(WRITETIMEOUT, TimeUnit.SECONDS)
                    .build();
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
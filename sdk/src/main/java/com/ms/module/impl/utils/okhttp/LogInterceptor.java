package com.ms.module.impl.utils.okhttp;

import android.util.Log;

import okhttp3.*;

import java.io.IOException;
import java.text.DecimalFormat;


public class LogInterceptor implements Interceptor {

    public static String TAG = "LogInterceptor";

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        long startTime = System.currentTimeMillis();
        Response response = chain.proceed(chain.request());
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        MediaType mediaType = response.body().contentType();
        int code = response.code();
        String content = response.body().string();
        Log.d(TAG, "\n");
        Log.d(TAG, "----------START----------------");
        Log.d(TAG, "| " + request.toString());
        String method = request.method();
        if ("POST".equals(method)) {
            StringBuilder sb = new StringBuilder();
            if (request.body() instanceof FormBody) {

                FormBody body = (FormBody) request.body();

                for (int i = 0; i < body.size(); i++) {
                    sb.append(body.encodedName(i) + "=" + body.encodedValue(i) + ",");
                }
                sb.delete(sb.length() - 1, sb.length());
                Log.d(TAG, "| RequestParams:{" + sb.toString() + "}");
            }
        }
        Log.d(TAG, "| Response code :" + code);
        Log.d(TAG, "| Response body :" + content);
        Log.d(TAG, "-----------SIZE:" + readableFileSize(content.length()));
        Log.d(TAG, "----------END:" + duration + "毫秒----------");
        return response.newBuilder()
                .body(ResponseBody.create(mediaType, content))
                .build();
    }


    public static String readableFileSize(long size) {
        if (size <= 0) return "0";
        final String[] units = new String[]{"B", "KB", "MB", "GB", "TB"};
        int digitGroups = (int) (Math.log10(size) / Math.log10(1024));
        return new DecimalFormat("#,##0.#").format(size / Math.pow(1024, digitGroups)) + " " + units[digitGroups];
    }
}
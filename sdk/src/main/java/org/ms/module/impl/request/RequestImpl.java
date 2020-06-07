package org.ms.module.impl.request;

import android.graphics.Bitmap;

import org.ms.module.impl.utils.DownloadUtils;
import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.net.IRequest;
import org.ms.module.supper.inter.net.Response;
import org.ms.module.impl.utils.okhttp.OkHttpUtils;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class RequestImpl implements IRequest {

    private static final String TAG = "RequestImpl";

    LogPlugin plugin;

    public RequestImpl() {

        plugin = new LogPluginImpl();
    }


    @Override
    public Response get(Map<String, String> headers, String url) {

        if (plugin != null) {
            plugin.info("GET", headers, url, null, null);
        }

        Request.Builder request = new Request.Builder();
        if (headers != null) {
            for (String k : headers.keySet()) {
                request.addHeader(k, headers.get(k));
            }
        }
        //创建Request
        request.url(url);
        Call call = OkHttpUtils.getInstance().newCall(request.build());
        try {
            okhttp3.Response execute = call.execute();
            String string = execute.body().string();
            return new Response(execute.code(), string, null);
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(-1, null, e.getMessage());
        }
    }

    @Override
    public void get(Map<String, String> headers, String url, final ICallBack callBack) {

        if (plugin != null) {
            plugin.info("GET", headers, url, null, null);
        }

        OkHttpUtils.doGet(headers, url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                if (callBack != null) {
                    callBack.onException(e);
                    callBack.onFailure(e.getMessage());
                }
            }

            @Override
            public void onResponse(Call call, okhttp3.Response response) throws IOException {
                if (callBack != null) {
                    callBack.onSuccess(new Response(response.code(), response.body().string(), null));
                }
            }
        });
    }

    @Override
    public Response post(Map<String, String> headers, String url, Map<String, String> params) {

        if (plugin != null) {
            plugin.info("POST", headers, url, params, null);
        }


        Request.Builder request = new Request.Builder();
        if (headers != null) {
            for (String k : headers.keySet()) {
                request.addHeader(k, headers.get(k));
            }
        }
        //创建Request
        request.url(url);
        FormBody.Builder builder = new FormBody.Builder();
        for (String key : params.keySet()) {
            builder.add(key, params.get(key));
        }
        request.post(builder.build());
        Call call = OkHttpUtils.getInstance().newCall(request.build());
        try {
            okhttp3.Response execute = call.execute();
            String string = execute.body().string();
            return new Response(execute.code(), string, null);
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(-1, null, e.getMessage());
        }
    }

    @Override
    public void post(Map<String, String> headers, String url, Map<String, String> params, final ICallBack callBack) {


        if (plugin != null) {
            plugin.info("POST", headers, url, params, null);
        }


        OkHttpUtils.doPost(headers, url, params, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                if (callBack != null) {
                    callBack.onException(e);
                    callBack.onFailure(e.getMessage());
                }
            }

            @Override
            public void onResponse(Call call, okhttp3.Response response) throws IOException {
                if (callBack != null) {
                    callBack.onSuccess(new Response(response.code(), response.body().string(), null));
                }
            }
        });
    }

    @Override
    public void requestBody(Map<String, String> headers, String url, String body, final ICallBack callBack) {


        if (plugin != null) {
            plugin.info("POST", headers, url, null, body);
        }


        OkHttpUtils.doRequestBody(headers, url, body, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                if (callBack != null) {
                    callBack.onException(e);
                    callBack.onFailure(e.getMessage());
                }
            }

            @Override
            public void onResponse(Call call, okhttp3.Response response) throws IOException {
                if (callBack != null) {
                    callBack.onSuccess(new Response(response.code(), response.body().string(), null));
                }
            }
        });
    }

    @Override
    public Bitmap downloadImage(String s) {
        return DownloadUtils.getInstance().getURLimage(s);
    }

    @Override
    public Response requestBody(Map<String, String> headers, String url, String body) {

        if (plugin != null) {
            plugin.info("POST", headers, url, null, body);
        }

        Request.Builder request = new Request.Builder();
        if (headers != null) {
            Iterator var5 = headers.keySet().iterator();

            while (var5.hasNext()) {
                String k = (String) var5.next();
                request.addHeader(k, (String) headers.get(k));
            }
        }
        request.url(url);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), body);
        request.post(requestBody);
        okhttp3.Response execute = null;
        try {
            execute = OkHttpUtils.getInstance().newCall(request.build()).execute();
            String bodyString = execute.body().string();
            return new Response(execute.code(), bodyString, null);
        } catch (IOException e) {
            e.printStackTrace();
            return new Response(execute == null ? -1 : execute.code(), null, e.getMessage().toString(), e);
        }
    }
}

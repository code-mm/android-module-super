package org.ms.module.supper.inter.net;

import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.supper.ISupper;

import java.util.Map;

//
// 网络请求
public class IRequestAdapter implements IRequest {


    @Override
    public Response get(Map<String, String> headers, String url) {
        return null;
    }

    @Override
    public void get(Map<String, String> headers, String url, ICallBack callBack) {

    }

    @Override
    public Response post(Map<String, String> headers, String url, Map<String, String> params) {
        return null;
    }

    @Override
    public void post(Map<String, String> headers, String url, Map<String, String> params, ICallBack callBack) {

    }

    @Override
    public Response requestBody(Map<String, String> headers, String url, String body) {
        return null;
    }

    @Override
    public void requestBody(Map<String, String> headers, String url, String body, ICallBack callBack) {

    }
}
package org.ms.module.supper.inter.net;



import org.ms.module.supper.inter.common.ICallBack;
import org.ms.module.supper.inter.supper.ISupper;

import java.util.Map;

//
// 网络请求
public interface IRequest extends ISupper {

    /**
     * @param headers
     * @param url
     * @return
     */
    Response get(Map<String, String> headers, String url);

    /**
     * @param headers
     * @param url
     * @param callBack
     */
    void get(Map<String, String> headers, String url, ICallBack callBack);

    /**
     * @param headers
     * @param url
     * @param params
     * @return
     */
    Response post(Map<String, String> headers, String url, Map<String, String> params);

    /**
     * @param headers
     * @param url
     * @param params
     * @param callBack
     */
    void post(Map<String, String> headers, String url, Map<String, String> params, ICallBack callBack);


    /**
     * @param headers
     * @param url
     * @param body
     * @return
     */
    Response requestBody(
            Map<String, String> headers,
            String url,
            String body
    );


    /**
     * @param headers
     * @param url
     * @param body
     * @param callBack
     */
    void requestBody(
            Map<String, String> headers,
            String url,
            String body,
            ICallBack callBack
    );
}
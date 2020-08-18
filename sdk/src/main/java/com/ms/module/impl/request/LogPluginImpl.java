package com.ms.module.impl.request;

import com.ms.module.supers.client.Modules;
import java.util.Map;

public class LogPluginImpl implements LogPlugin {
    @Override
    public void info(String method, Map<String, String> headers, String url, Map<String, String> params, String body) {

        if (Modules.getRequestSettingModule().getRequestLogOut()) {
            Modules.getLogModule().i("request", "----------------------------------");
            if (method != null) {
                Modules.getLogModule().i("request", "method : " + method);
            }
            Modules.getLogModule().i("request", "----------------------------------");
            if (url != null) {
                Modules.getLogModule().i("request", "url : " + url);
            }
            Modules.getLogModule().i("request", "----------------------------------");
            if (headers != null) {
                Modules.getLogModule().i("request", "header : \n");
                for (String item : headers.keySet()) {
                    Modules.getLogModule().i(item, headers.get(item));
                }
            }
            Modules.getLogModule().i("request", "----------------------------------");
            if (params != null) {
                Modules.getLogModule().i("request", "params : \n");
                for (String item : params.keySet()) {
                    Modules.getLogModule().i(item, params.get(item));
                }
            }
            Modules.getLogModule().i("request", "----------------------------------");
            if (body != null) {
                Modules.getLogModule().i("request", "body : \n" + body);
            }
        }
    }
}

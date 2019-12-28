package org.ms.module.request.impl;

import java.util.Map;

public interface LogPlugin {
    void info(String method, Map<String, String> headers, String url, Map<String, String> params, String body);
}
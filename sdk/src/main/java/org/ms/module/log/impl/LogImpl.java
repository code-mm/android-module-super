package org.ms.module.log.impl;

import org.ms.module.log.LogUtils;
import org.ms.module.supper.inter.log.IlogAdapter;


public class LogImpl extends IlogAdapter {
    @Override
    public void i(String tag, String log) {
        LogUtils.i(tag, log);
    }

    @Override
    public void d(String tag, String log) {
        LogUtils.d(tag, log);
    }

    @Override
    public void e(String tag, String log) {
        LogUtils.e(tag, log);
    }

    @Override
    public void json(String tag, String log) {
        LogUtils.json(tag, log);
    }

    @Override
    public void xml(String tag, String log) {
        LogUtils.xml(tag, log);
    }
}
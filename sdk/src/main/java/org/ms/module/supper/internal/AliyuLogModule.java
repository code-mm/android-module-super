package org.ms.module.supper.internal;

import org.ms.module.supper.inter.aliyun.log.IAliyuLog;
import org.ms.module.supper.inter.aliyun.log.IAliyuLogAdapter;
import org.ms.module.supper.inter.module.ModuleAdapter;

public class AliyuLogModule extends ModuleAdapter {
    private static final String CLASSPATH = "org.ms.module.impl.aliyun.LogImpl";
    private IAliyuLog iAliyuLog;

    @Override
    public IAliyuLog get() {
        if (iAliyuLog == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IAliyuLog) {
                    iAliyuLog = (IAliyuLog) o;
                    if (iAliyuLog != null) {
                        return iAliyuLog;
                    } else {
                        iAliyuLog = new IAliyuLogAdapter();
                    }
                }
            }
        }
        return iAliyuLog;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
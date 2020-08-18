package com.ms.module.supers.internal;

import com.ms.module.supers.inter.bugly.ITencentBugly;
import com.ms.module.supers.inter.bugly.ITencentBuglyAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

public class TencentBuglyModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.bugly.TencentBuglyImpl";

    private ITencentBugly tencentBugly;

    @Override
    public ITencentBugly get() {
        if (tencentBugly == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof ITencentBugly) {
                    tencentBugly = (ITencentBugly) o;
                    if (tencentBugly != null) {
                        return tencentBugly;
                    } else {
                        tencentBugly = new ITencentBuglyAdapter();
                    }
                }
            } else {
                tencentBugly = new ITencentBuglyAdapter();
            }
        }
        return tencentBugly;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}

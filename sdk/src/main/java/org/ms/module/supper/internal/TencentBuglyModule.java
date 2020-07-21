package org.ms.module.supper.internal;

import org.ms.module.supper.inter.bugly.ITencentBugly;
import org.ms.module.supper.inter.bugly.ITencentBuglyAdapter;
import org.ms.module.supper.inter.module.ModuleAdapter;

public class TencentBuglyModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.bugly.TencentBuglyImpl";

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

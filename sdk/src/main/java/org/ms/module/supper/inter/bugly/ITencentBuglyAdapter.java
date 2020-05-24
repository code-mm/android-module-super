package org.ms.module.supper.inter.bugly;

import org.ms.module.supper.inter.supper.ISupper;

public class ITencentBuglyAdapter implements ITencentBugly {

    @Override
    public void init() {
        System.out.println(this.getClass().getSimpleName() + "腾讯BUGLY模块未集成");
    }
}

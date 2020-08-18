package com.ms.module.supers.inter.bugly;

public class ITencentBuglyAdapter implements ITencentBugly {

    @Override
    public void init() {
        System.out.println(this.getClass().getSimpleName() + "腾讯BUGLY模块未集成");
    }
}

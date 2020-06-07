package org.ms.module.supper.inter.aliyun.sts;

public class ISTSAdapter implements ISTS {


    @Override
    public void init() {
        System.out.println(this.getClass().getSimpleName() + "STS 未集成");
    }
}

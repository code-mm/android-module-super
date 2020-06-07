package org.ms.module.supper.internal;

import org.ms.module.supper.inter.log.ILog;
import org.ms.module.supper.inter.log.IlogAdapter;
import org.ms.module.supper.inter.mmkv.IMMKV;
import org.ms.module.supper.inter.mmkv.IMMKVAdapter;
import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.supper.ISupper;

public class MMKVModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.mmkv.MMKVImpl";

    IMMKV mmkv;


    @Override
    public IMMKV get() {
        if (mmkv == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IMMKV) {
                    mmkv = (IMMKV) o;

                    if (mmkv != null) {
                        return mmkv;
                    } else {
                        mmkv = new IMMKVAdapter();
                    }
                }
            } else {
                mmkv = new IMMKVAdapter();
            }
        }
        return mmkv;
    }


    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}

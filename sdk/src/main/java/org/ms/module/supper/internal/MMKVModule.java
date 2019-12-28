package org.ms.module.supper.internal;

import org.ms.module.supper.inter.log.ILog;
import org.ms.module.supper.inter.log.IlogAdapter;
import org.ms.module.supper.inter.mmkv.IMMKV;
import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.supper.ISupper;

public class MMKVModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.mmkv.impl.MMKVImpl";

    IMMKV immkv;


    @Override
    public IMMKV get() {
        if (immkv == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IMMKV) {
                    immkv = (IMMKV) o;

                    if (immkv != null) {
                        return immkv;
                    } else {

                    }
                }
            }
        }
        return immkv;
    }


    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}

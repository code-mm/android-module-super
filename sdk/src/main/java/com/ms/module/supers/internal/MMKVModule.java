package com.ms.module.supers.internal;

import com.ms.module.supers.inter.mmkv.IMMKV;
import com.ms.module.supers.inter.mmkv.IMMKVAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

public class MMKVModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.mmkv.MMKVImpl";

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
                        return mmkv;
                    }
                }
            } else {
                mmkv = new IMMKVAdapter();
                return mmkv;
            }
        }
        return mmkv;
    }


    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}

package com.ms.module.supers.internal;


import com.ms.module.supers.inter.data.IData;
import com.ms.module.supers.inter.data.IDataAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

public class DataModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.data.DataImpl";
    private IData data;

    @Override
    public IData get() {
        if (data == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IData) {
                    data = (IData) o;

                    if (data != null) {
                        return data;
                    } else {
                        data = new IDataAdapter();
                    }
                }
            } else {
                data = new IDataAdapter();
            }
        }
        return data;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
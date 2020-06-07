package org.ms.module.supper.internal;


import org.ms.module.supper.inter.data.IData;
import org.ms.module.supper.inter.data.IDataAdapter;
import org.ms.module.supper.inter.module.ModuleAdapter;

public class DataModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.impl.data.DataImpl";
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
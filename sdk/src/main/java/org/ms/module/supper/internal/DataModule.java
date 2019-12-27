package org.ms.module.supper.internal;


import org.ms.module.supper.inter.data.IData;
import org.ms.module.supper.inter.module.ModuleAdapter;

public class DataModule extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.data.impl.DataImpl";
    private IData iData;

    @Override
    public IData get() {
        if (iData == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IData) {
                    iData = (IData) o;
                } else {
                    System.out.println("! instanceof ");
                }
            } else {
                System.out.println("o == null");
            }
        }
        return iData;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
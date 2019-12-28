package org.ms.module.supper.internal;

import org.ms.module.supper.inter.datapersistence.IDataPersistence;
import org.ms.module.supper.inter.module.ModuleAdapter;
import org.ms.module.supper.inter.supper.ISupper;

public class DataPersistenceModule  extends ModuleAdapter {

    private static final String CLASSPATH = "org.ms.module.dataPersistence.impl.DataPersistenceImpl";

    IDataPersistence iDataPersistence;


    @Override
    public IDataPersistence get() {
        if (iDataPersistence == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IDataPersistence) {
                    iDataPersistence = (IDataPersistence) o;

                    if (iDataPersistence != null) {
                        return iDataPersistence;
                    } else {

                    }
                }
            }
        }
        return iDataPersistence;
    }



    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}

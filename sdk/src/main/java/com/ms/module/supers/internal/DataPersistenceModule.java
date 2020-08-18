package com.ms.module.supers.internal;

import com.ms.module.supers.inter.datapersistence.IDataPersistence;
import com.ms.module.supers.inter.datapersistence.IDataPersistenceAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

public class DataPersistenceModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.datapersistence.DataPersistenceImpl";

    IDataPersistence dataPersistence;


    @Override
    public IDataPersistence get() {
        if (dataPersistence == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IDataPersistence) {
                    dataPersistence = (IDataPersistence) o;

                    if (dataPersistence != null) {
                        return dataPersistence;
                    } else {
                        dataPersistence = new IDataPersistenceAdapter();
                        return dataPersistence;
                    }
                }
            } else {
                dataPersistence = new IDataPersistenceAdapter();
                return dataPersistence;
            }
        }
        return dataPersistence;
    }


    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}

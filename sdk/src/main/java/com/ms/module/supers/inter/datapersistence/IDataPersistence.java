package com.ms.module.supers.inter.datapersistence;



import com.ms.module.supers.inter.supper.ISupper;

public interface IDataPersistence extends ISupper {

    void put(String k, String v);

    String get(String k);

    void removeKey(String key);

}

package org.ms.module.supper.inter.datapersistence;



import org.ms.module.supper.inter.supper.ISupper;

public interface IDataPersistence extends ISupper {

    void put(String k, String v);

    String get(String k);

    void removeKey(String key);

}

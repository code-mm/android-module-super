package org.ms.module.dataPersistence.impl;

import android.content.Context;
import android.content.SharedPreferences;

import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.datapersistence.IDataPersistence;
import org.ms.module.supper.inter.module.Module;

public class DataPersistenceImpl implements IDataPersistence {


    SharedPreferences mSharedPreferences;
    SharedPreferences.Editor mEdit;

    public DataPersistenceImpl() {
        mSharedPreferences = Modules.getDataModule().getAppData().getApplication().getSharedPreferences(Modules.getUtilsModule().getApkUtils().getPackageName()+this.getClass().getName(), Context.MODE_PRIVATE);

        mEdit = mSharedPreferences.edit();
    }

    @Override
    public void put(String k, String v) {
        mEdit.putString(k, v);
        mEdit.commit();
    }
    @Override
    public String get(String k) {
        return mSharedPreferences.getString(k, "");
    }

    @Override
    public void removeKey(String key) {

        mEdit.remove(key);
        mEdit.commit();
    }
}

package com.ms.module.impl.datapersistence;

import android.content.Context;
import android.content.SharedPreferences;

import com.ms.module.supers.client.Modules;
import com.ms.module.supers.inter.datapersistence.IDataPersistenceAdapter;

public class DataPersistenceImpl extends IDataPersistenceAdapter {


    SharedPreferences mSharedPreferences;
    SharedPreferences.Editor mEdit;

    public DataPersistenceImpl() {
        mSharedPreferences = Modules.getDataModule().getAppData().getApplication().getSharedPreferences(Modules.getUtilsModule().getApkUtils().getPackageName() + this.getClass().getName().toLowerCase(), Context.MODE_PRIVATE);

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

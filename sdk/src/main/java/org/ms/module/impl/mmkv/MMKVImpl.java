package org.ms.module.impl.mmkv;

import com.tencent.mmkv.MMKV;

import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.mmkv.IMMKV;

public class MMKVImpl implements IMMKV {

    MMKV kv;

    public MMKVImpl() {
        // 初始化mmkv
        String rootDir = MMKV.initialize(Modules.getDataModule().getAppData().getApplication());

        System.out.println("mmkv : " + rootDir);

        kv = MMKV.defaultMMKV();

    }


    @Override
    public void put(String k, String v) {
        kv.putString(k, v);
    }

    @Override
    public String get(String k) {
        return kv.getString(k, "");
    }

    @Override
    public void removeKey(String key) {
        kv.reKey(key);
    }
}
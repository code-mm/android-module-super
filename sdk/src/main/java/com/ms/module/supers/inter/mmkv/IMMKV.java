package com.ms.module.supers.inter.mmkv;

import com.ms.module.supers.inter.supper.ISupper;

public interface IMMKV extends ISupper {

    void put(String k, String v);

    String get(String k);

    void removeKey(String key);
}

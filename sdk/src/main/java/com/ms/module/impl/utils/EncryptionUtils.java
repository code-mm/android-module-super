package com.ms.module.impl.utils;


import com.ms.module.supers.inter.utils.IEncryptionUtils;

public class EncryptionUtils implements IEncryptionUtils {


    private static final EncryptionUtils encryptionUtils = new EncryptionUtils();

    public static EncryptionUtils getInstance() {
        return encryptionUtils;
    }

    @Override
    public String encode(String s) {
        return EncryptionUtilsImpl.encode(s);
    }

    @Override
    public String decode(String s) {
        return EncryptionUtilsImpl.decode(s);
    }
}

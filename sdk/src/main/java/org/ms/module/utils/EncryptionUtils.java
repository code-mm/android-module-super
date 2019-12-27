package org.ms.module.utils;


import org.ms.module.supper.inter.utils.IEncryptionUtils;

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

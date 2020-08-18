package com.ms.module.supers.inter.utils;


import com.ms.module.supers.inter.supper.ISupper;

public interface IEncryptionUtils  extends ISupper {

    String encode(String src);

    String decode(String src);

}

package org.ms.module.supper.inter.utils;


import org.ms.module.supper.inter.supper.ISupper;

public interface IEncryptionUtils  extends ISupper {

    String encode(String src);

    String decode(String src);

}

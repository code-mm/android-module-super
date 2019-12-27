package org.ms.module.supper.inter.utils;



import org.ms.module.supper.inter.supper.ISupper;

public interface IUtils extends ISupper {

    IApkUtils getApkUtils();

    IToastUtils getToastUtils();

    IEncryptionUtils getEncryptionUtils();

    IThreadPoolUtils getThreadPoolUtils();

    IMD5Utils getMd5Utils();

    IGsonUtils getGsonUtils();

    INetWorkUtils getNetWorkUtils();

    IRegexUtils getRegexUtils();





}

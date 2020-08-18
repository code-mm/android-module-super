package com.ms.module.impl.utils;

import com.ms.module.supers.inter.utils.IApkUtils;
import com.ms.module.supers.inter.utils.IEncryptionUtils;
import com.ms.module.supers.inter.utils.IGsonUtils;
import com.ms.module.supers.inter.utils.IMD5Utils;
import com.ms.module.supers.inter.utils.INetWorkUtils;
import com.ms.module.supers.inter.utils.IPinyinUtils;
import com.ms.module.supers.inter.utils.IRegexUtils;
import com.ms.module.supers.inter.utils.IResUtils;
import com.ms.module.supers.inter.utils.ISystemUtils;
import com.ms.module.supers.inter.utils.IThreadPoolUtils;
import com.ms.module.supers.inter.utils.IToastUtils;
import com.ms.module.supers.inter.utils.IUtilsAdapter;

public class UtilsImpl extends IUtilsAdapter {

    @Override
    public IToastUtils getToastUtils() {
        return ToastUtils.getInstance();
    }

    @Override
    public IEncryptionUtils getEncryptionUtils() {
        return new EncryptionUtils();
    }

    @Override
    public IApkUtils getApkUtils() {
        return new ApkUtils();
    }


    @Override
    public IThreadPoolUtils getThreadPoolUtils() {
        return ThreadPoolUtils.getInstance();
    }

    @Override
    public IMD5Utils getMd5Utils() {
        return new MD5Utils();
    }

    @Override
    public IGsonUtils getGsonUtils() {
        return new GsonUtilsImpl();
    }

    @Override
    public INetWorkUtils getNetWorkUtils() {
        return NetworkUtils.getInstance();
    }

    @Override
    public IRegexUtils getRegexUtils() {
        return RegexUtils.getInstance();
    }


    @Override
    public IResUtils getResUtils() {
        return ResUtils.getInstance();
    }


    @Override
    public ISystemUtils getSystemUtils() {
        return SystemUtils.getInstance();
    }

    @Override
    public IPinyinUtils getPinyinUtils() {
        return new PinyinUtils();
    }
}
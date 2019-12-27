package org.ms.module.utils.impl;

import android.widget.Toast;



import org.ms.module.supper.inter.utils.IApkUtils;
import org.ms.module.supper.inter.utils.IEncryptionUtils;
import org.ms.module.supper.inter.utils.IGsonUtils;
import org.ms.module.supper.inter.utils.IMD5Utils;
import org.ms.module.supper.inter.utils.INetWorkUtils;
import org.ms.module.supper.inter.utils.IRegexUtils;
import org.ms.module.supper.inter.utils.IThreadPoolUtils;
import org.ms.module.supper.inter.utils.IToastUtils;
import org.ms.module.supper.inter.utils.IUtilsAdapter;
import org.ms.module.utils.ApkUtils;
import org.ms.module.utils.EncryptionUtils;
import org.ms.module.utils.GsonUtilsImpl;
import org.ms.module.utils.MD5Utils;
import org.ms.module.utils.NetworkUtils;
import org.ms.module.utils.RegexUtils;
import org.ms.module.utils.ThreadPoolUtils;
import org.ms.module.utils.ToastUtils;

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
}

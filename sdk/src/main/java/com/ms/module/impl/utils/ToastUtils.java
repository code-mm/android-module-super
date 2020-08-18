package com.ms.module.impl.utils;

import android.widget.Toast;

import com.ms.module.supers.client.Modules;
import com.ms.module.supers.inter.utils.IToastUtils;

public class ToastUtils implements IToastUtils {


    private ToastUtils() {
    }

    private static final ToastUtils toastUtils = new ToastUtils();

    public static ToastUtils getInstance() {
        return toastUtils;
    }

    private static Toast toast;

    @Override
    public void show(final String s) {
        ThreadPoolUtils.getInstance().runOnMainThread(new Runnable() {
            @Override
            public void run() {
                if (toast == null) {
                    toast = Toast.makeText(Modules.getDataModule().getAppData().getApplication(), s, Toast.LENGTH_LONG);
                } else {
                    toast.setText(s);
                }
                toast.show();
            }
        });
    }
}

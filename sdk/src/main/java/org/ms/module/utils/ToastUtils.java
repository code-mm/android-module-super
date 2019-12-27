package org.ms.module.utils;

import android.widget.Toast;

import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.utils.IToastUtils;

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
                    toast = Toast.makeText(Modules.getDataModule().getApplication(), s, Toast.LENGTH_LONG);
                } else {
                    toast.setText(s);
                }
                toast.show();
            }
        });
    }
}

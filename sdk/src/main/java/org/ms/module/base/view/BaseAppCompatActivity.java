package org.ms.module.base.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import org.ms.module.dialog.ui.widget.progress.UIProgressDialog;
import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.module.Module;
import org.ms.modules.R;


public abstract class BaseAppCompatActivity extends AppCompatActivity {


    protected UIProgressDialog baseDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        baseDialog = new UIProgressDialog.MaterialBuilder(this).create();

        if (isFullScreen()) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

            final View decorView = getWindow().getDecorView();
            final int uiOption = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_IMMERSIVE
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;

            decorView.setSystemUiVisibility(uiOption);


            decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                @Override
                public void onSystemUiVisibilityChange(int visibility) {
                    if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
                        decorView.setSystemUiVisibility(uiOption);
                    }
                }
            });
        }

        super.onCreate(savedInstanceState);

        setContentView(getLayout());

        initView();


    }

    protected abstract void initView();

    protected abstract int getLayout();

    protected abstract boolean isFullScreen();


    protected void showDialog() {


        Modules.getUtilsModule().getThreadPoolUtils().runOnMainThread(new Runnable() {
            @Override
            public void run() {

                baseDialog.show();

            }
        });


    }


    protected void hideDialog() {

        Modules.getUtilsModule().getThreadPoolUtils().runOnMainThread(new Runnable() {
            @Override
            public void run() {

                baseDialog.hide();

            }
        });

    }


    protected void baseStart(final Class<?> clazz) {
        Modules.getUtilsModule().getThreadPoolUtils().runOnMainThread(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(BaseAppCompatActivity.this, clazz));
            }
        });
    }
}

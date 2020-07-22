package org.ms.module.base.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;

import org.ms.module.base.dialog.ui.widget.progress.UIProgressDialog;
import org.ms.module.base.inter.IViewModel;
import org.ms.module.supper.client.Modules;


public abstract class BaseActivity<VM extends IViewModel> extends Activity {


    protected VM viewModel;

    protected VM initViewModel() {
        return null;
    }


    protected UIProgressDialog baseDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        viewModel = initViewModel();
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

        if (getLayout() != 0) {
            setContentView(getLayout());
        }

        initView();


    }

    protected void initView() {
    }


    protected int getLayout() {
        return 0;
    }


    protected boolean isFullScreen() {
        return false;
    }


    public <T> T findView(int viewID) {
        return (T) findViewById(viewID);
    }


    public void showDialog() {
        Modules.getUtilsModule().getThreadPoolUtils().runOnMainThread(new Runnable() {
            @Override
            public void run() {
                if (baseDialog != null && !baseDialog.isShowing()) {
                    baseDialog.show();
                }
            }
        });
    }

    public void hideDialog() {
        Modules.getUtilsModule().getThreadPoolUtils().runOnMainThread(new Runnable() {
            @Override
            public void run() {
                if (baseDialog != null && baseDialog.isShowing()) {
                    baseDialog.hide();
                }
            }
        });
    }

    protected void baseStart(final Class<?> clazz) {
        Modules.getUtilsModule().getThreadPoolUtils().runOnMainThread(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(BaseActivity.this, clazz));
            }
        });
    }


    public void showToast(String text) {
        Modules.getUtilsModule().getThreadPoolUtils().runOnMainThread(new Runnable() {
            @Override
            public void run() {
                Modules.getUtilsModule().getToastUtils().show(text);
            }
        });
    }


    protected InputFilter lengthfilter20 = new InputFilter() {
        public CharSequence filter(CharSequence source, int start, int end,
                                   Spanned dest, int dstart, int dend) {
            String dValue = dest.toString();
            if (dValue != null) {
                if (dValue.length() > 20) {
                    return dValue.substring(0, 20);
                }
            }
            return null;
        }
    };

    protected InputFilter lengthfilter11 = new InputFilter() {
        public CharSequence filter(CharSequence source, int start, int end,
                                   Spanned dest, int dstart, int dend) {
            String dValue = dest.toString();
            if (dValue != null) {
                if (dValue.length() > 11) {
                    return dValue.substring(0, 11);
                }
            }
            return null;
        }
    };

    protected InputFilter lengthfilter18 = new InputFilter() {
        public CharSequence filter(CharSequence source, int start, int end,
                                   Spanned dest, int dstart, int dend) {
            String dValue = dest.toString();
            if (dValue != null) {
                if (dValue.length() > 18) {
                    return dValue.substring(0, 18);
                }
            }
            return null;
        }
    };


    protected InputFilter[] userNameAndPasswordInputFilter = new InputFilter[]{lengthfilter20, new InputFilter.LengthFilter(20)};
    protected InputFilter[] phoneNumberInputFilter = new InputFilter[]{lengthfilter11, new InputFilter.LengthFilter(11)};
    protected InputFilter[] iDcardInputFilter = new InputFilter[]{lengthfilter18, new InputFilter.LengthFilter(18)};


}





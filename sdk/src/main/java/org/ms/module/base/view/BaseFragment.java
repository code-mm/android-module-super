package org.ms.module.base.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ms.module.base.inter.IPresenter;
import org.ms.module.base.inter.IView;
import org.ms.module.supper.client.Modules;


public abstract class BaseFragment<P extends IPresenter> extends Fragment implements IView {


    protected P presenter = initPresenter();

    protected P initPresenter() {
        return null;
    }

    /**
     * View
     */
    protected View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        if (getLayout() != 0) {
            // 实例化View
            view = inflater.inflate(getLayout(), container, false);
        }
        // 初始化控件
        initView();
        // 返回视图
        return view;
    }

    protected abstract void initView();

    protected abstract int getLayout();

    public <T> T findViewById(int viewID) {
        return (T) view.findViewById(viewID);
    }

    public <T> T findView(int viewID) {
        return (T) findViewById(viewID);
    }


    @Override
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

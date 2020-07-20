package org.ms.module.base.view;

import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.ms.module.base.inter.IViewModel;
import org.ms.module.supper.client.Modules;


public abstract class BaseFragment<VM extends IViewModel> extends Fragment {


    protected VM viewModel;

    protected VM initViewModel() {
        return null;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        viewModel = initViewModel();
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

    protected void initView() {
    }

    protected int getLayout() {
        return 0;
    }

    public <T> T findViewById(int viewID) {
        return (T) view.findViewById(viewID);
    }

    public <T> T findView(int viewID) {
        return (T) findViewById(viewID);
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


    public void showDialog() {

    }

    public void hideDialog() {

    }


    protected InputFilter[] userNameAndPasswordInputFilter = new InputFilter[]{lengthfilter20, new InputFilter.LengthFilter(20)};
    protected InputFilter[] phoneNumberInputFilter = new InputFilter[]{lengthfilter11, new InputFilter.LengthFilter(11)};
    protected InputFilter[] iDcardInputFilter = new InputFilter[]{lengthfilter18, new InputFilter.LengthFilter(18)};


}

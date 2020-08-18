package com.ms.module.supers.inter.common;


import com.ms.module.supers.inter.supper.ISupper;

// 回调接口
public interface ICallBack<
        SUCCESS,
        FAILURE,
        CANCEL,
        START,
        UNKNOWN,
        EXCEPTION,
        CHANGE
        > extends ISupper {

    void onSuccess(SUCCESS success);

    void onFailure(FAILURE failure);

    void onCancel(CANCEL cancel);

    void onStart(START start);

    void onUnknown(UNKNOWN unknown);

    void onException(EXCEPTION exception);

    void onChange(CHANGE change);

}
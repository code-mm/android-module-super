package org.ms.module.supper.inter.common;


import org.ms.module.supper.inter.supper.ISupper;

// 回调接口
public interface ICallBack<
        SUCCESS,
        FAILURE,
        CANCEL,
        START,
        UNKNOWN,
        EXCEPTION
        > extends ISupper {

    void onSuccess(SUCCESS success);

    void onFailure(FAILURE failure);

    void onCancel(CANCEL cancel);

    void onStart(START start);

    void onUnknown(UNKNOWN unknown);

    void onException(EXCEPTION exception);

}
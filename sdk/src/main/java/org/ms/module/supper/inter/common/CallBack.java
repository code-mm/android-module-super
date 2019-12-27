package org.ms.module.supper.inter.common;
public abstract class CallBack <
        SUCCESS,
        FAILURE,
        CANCEL,
        START,
        UNKNOWN,
        EXCEPTION> implements ICallBack< SUCCESS,
        FAILURE,
        CANCEL,
        START,
        UNKNOWN,
        EXCEPTION> {
    @Override
    public void onSuccess(SUCCESS success) {

    }

    @Override
    public void onFailure(FAILURE failure) {

    }

    @Override
    public void onCancel(CANCEL cancel) {

    }

    @Override
    public void onStart(START start) {

    }

    @Override
    public void onUnknown(UNKNOWN unknown) {

    }

    @Override
    public void onException(EXCEPTION exception) {

    }
}
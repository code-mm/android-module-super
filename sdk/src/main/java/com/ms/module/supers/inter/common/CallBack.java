package com.ms.module.supers.inter.common;
public abstract class CallBack <
        SUCCESS,
        FAILURE,
        CANCEL,
        START,
        UNKNOWN,
        EXCEPTION,
        CHANGE
        > implements ICallBack< SUCCESS,
        FAILURE,
        CANCEL,
        START,
        UNKNOWN,
        EXCEPTION,
        CHANGE
        > {
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


    @Override
    public void onChange(CHANGE  change) {

    }
}
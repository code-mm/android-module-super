package com.ms.module.supers.inter.exception;

import com.ms.module.supers.inter.supper.ISupper;

public interface IException extends ISupper {


    void handlerInit();

    void printStackTrace(Throwable e);

}

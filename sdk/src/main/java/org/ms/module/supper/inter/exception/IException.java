package org.ms.module.supper.inter.exception;

import org.ms.module.supper.inter.supper.ISupper;

public interface IException extends ISupper {


    void handlerInit();

    void printStackTrace(Throwable e);

}

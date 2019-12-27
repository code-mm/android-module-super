package org.ms.module.exception;

import android.os.Build;


public class ChuJianException extends Exception {

    public ChuJianException() {
    }

    public ChuJianException(String message) {
        super(message);
    }

    public ChuJianException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChuJianException(Throwable cause) {
        super(cause);
    }


}

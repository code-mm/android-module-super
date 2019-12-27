package org.ms.module.supper.inter.net;

public class Response {

    // -1 exception
    public final int code;
    public final String body;
    public final String errorMessage;

    public Response(int code, String body, String errorMessage) {
        this.code = code;
        this.body = body;
        this.errorMessage = errorMessage;
    }
}
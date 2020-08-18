package com.ms.module.supers.inter.net;

public class Response {

    // -1 exception
    public int code;
    public String body;
    public String errorMessage;
    public Throwable throwable;

    public Response(int code, String body, String errorMessage) {
        this.code = code;
        this.body = body;
        this.errorMessage = errorMessage;
    }

    public Response(int code, String body, String errorMessage, Throwable e) {
        this.code = code;
        this.body = body;
        this.errorMessage = errorMessage;
        throwable = e;
    }
}
package com.xinput.tencent.exception;

public class TencentException extends RuntimeException {

    public TencentException() {
    }

    public TencentException(String message) {
        super(message);
    }

    public TencentException(String message, Throwable cause) {
        super(message, cause);
    }

    public TencentException(Throwable cause) {
        super(cause);
    }

    public TencentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

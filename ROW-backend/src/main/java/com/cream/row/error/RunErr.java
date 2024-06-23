package com.cream.row.error;

public class RunErr extends RuntimeException{

    public RunErr() {
    }

    public RunErr(String message) {
        super(message);
    }

    public RunErr(String message, Throwable cause) {
        super(message, cause);
    }

    public RunErr(Throwable cause) {
        super(cause);
    }

    public RunErr(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

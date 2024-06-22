package com.cream.row.utils;

public class Times {

    private static final long AdjustDelta = 0;

    public static long now() {
        return System.currentTimeMillis() + AdjustDelta;
    }
}

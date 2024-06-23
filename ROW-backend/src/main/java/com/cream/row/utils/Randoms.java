package com.cream.row.utils;

import java.util.*;

public class Randoms {

    private static final Random RANDOM = new Random();

    public static <T> T randomOne(Collection<T> elements) {
        if (NullUtil.isEmpty(elements)) {
            return null;
        }
        List<T> list = new ArrayList<>(elements);
        Collections.shuffle(list, RANDOM);
        return list.getFirst();
    }

    public static <T> T random(T... e) {
        if (NullUtil.isEmpty(e)) {
            return null;
        }
        return e[RANDOM.nextInt(e.length)];
    }
}

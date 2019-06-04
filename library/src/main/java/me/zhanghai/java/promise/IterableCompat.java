/*
 * Copyright (c) 2018 Hai Zhang <dreaming.in.code.zh@gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.java.promise;

class IterableCompat {

    private IterableCompat() {}

    public static <T> void forEach(Iterable<T> iterable, ConsumerCompat<T> action) {
        ObjectsCompat.requireNonNull(iterable);
        for (T t : iterable) {
            action.accept(t);
        }
    }
}

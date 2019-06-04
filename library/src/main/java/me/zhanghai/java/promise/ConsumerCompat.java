/*
 * Copyright (c) 2018 Hai Zhang <dreaming.in.code.zh@gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.java.promise;

@FunctionalInterface
interface ConsumerCompat<T> {

    void accept(T t);

    default ConsumerCompat<T> andThen(ConsumerCompat<? super T> after) {
        ObjectsCompat.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
}

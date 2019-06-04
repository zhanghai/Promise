/*
 * Copyright (c) 2019 Hai Zhang <dreaming.in.code.zh@gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.java.promise;

import androidx.annotation.NonNull;

@FunctionalInterface
public interface Executable<T> {

    void execute(@NonNull Settler<T> settler) throws Exception;
}

/*
 * Copyright (c) 2019 Hai Zhang <dreaming.in.code.zh@gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.java.promise;

import androidx.annotation.Nullable;

@FunctionalInterface
public interface OnRejected<R> {

    @Nullable
    R onRejected(Exception e) throws Exception;
}

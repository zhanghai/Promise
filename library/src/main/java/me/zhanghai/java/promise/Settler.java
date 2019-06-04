/*
 * Copyright (c) 2019 Hai Zhang <dreaming.in.code.zh@gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.java.promise;

import androidx.annotation.Nullable;

public interface Settler<T> {

    void resolve(@Nullable T value);

    void resolvePromise(@Nullable Promise<T> promise);

    void reject(@Nullable Exception reason);
}

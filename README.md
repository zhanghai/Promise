# Promise

A Java library for JavaScript-like Promise.

## Why Promise?

- The [`CompletableFuture`](https://docs.oracle.com/javase/10/docs/api/java/util/concurrent/CompletableFuture.html) interface is complicated while JavaScript [`Promise`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise) is simple and probably more familiar.
- [`CompletableFuture`](https://developer.android.com/reference/java/util/concurrent/CompletableFuture) isn't available until Android Nougat and [android-retrofuture](https://github.com/retrostreams/android-retrofuture) is too heavy-weight for just a couple of simple use cases.
- A bring-your-own-thread implementation, without the overhead of a `ForkJoinPool`.

## Integration

```gradle
dependencies {
    implementation 'me.zhanghai.java.promise:library:1.0.0'
}
```

## Usage

Much like the JavaScript [`Promise`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Using_promises). You can check out [Promise.java](library/src/main/java/me/zhanghai/java/promise/Promise.java) for its exact interface, and the main difference is that a `Settler` object is used to provide `resolve()` and `reject()`.

For example:

```java
int size = new Promise<Integer>(settler -> mHandler.post(() -> {
    try {
        int size_ = mCallback.onRead(offset[0], buffer.length, buffer);
        settler.resolve(size_);
    } catch (Exception e) {
        settler.reject(e);
    }
})).await();
```

## Caveat

The `executable` passed to `Promise` constructor is executed immediately, unlike in JavaScript where it will be executed after the current frame. This is because there isn't a generic way to do this in Java, and this way the behavior is still simple and deterministic.

## License

    Copyright 2019 Hai Zhang

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

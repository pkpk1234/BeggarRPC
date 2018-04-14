package com.beggar.rpc.client;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-14
 */
public interface Callback<T> {
    void onSuccess(T result);

    void onError(Throwable error);
}

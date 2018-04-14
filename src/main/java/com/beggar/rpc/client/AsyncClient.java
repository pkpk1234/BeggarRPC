package com.beggar.rpc.client;

import com.beggar.rpc.protocol.Message;

import java.util.concurrent.Future;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-14
 */
public interface AsyncClient extends AutoCloseable {
    Future<Void> connect();

    <T> Future<T> request(Class<T> returnType, Message message);

    <T> void request(Class<T> returnType, Message message, Callback<T> callback);
}

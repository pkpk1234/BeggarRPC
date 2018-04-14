package com.beggar.rpc.client;

import com.beggar.rpc.protocol.Message;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-14
 */
public interface Client extends AutoCloseable {
    void connect();
    <T> T request(Class<T> returnTyep,Message request);
}

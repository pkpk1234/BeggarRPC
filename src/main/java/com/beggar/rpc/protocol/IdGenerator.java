package com.beggar.rpc.protocol;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-06
 */
public interface IdGenerator<T> {
    T next();
}

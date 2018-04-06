package com.beggar.rpc.protocol.id;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-06
 */
public interface IdGenerator<T> {
    /**
     * 获取下一个Id
     *
     * @return
     */
    T next();
}

package com.ljm.rpc.common.codec;

/**
 * 序列化和反序列化接口
 *
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-03-09
 */
public interface SerDes {
    byte[] serialize(Object obj);
    <T> T deserialize(byte[] bytes, Class<T> clz);
}

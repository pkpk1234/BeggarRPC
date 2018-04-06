package com.beggar.rpc.protocol;

import java.nio.ByteBuffer;

/**
 * 类型转换器
 *
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-06
 */
public class BinaryConverter {
    
    public static byte[] int2Bytes(int i) {
        return ByteBuffer.allocate(4).putInt(i).array();
    }

    public static byte[] long2Bytes(long l) {
        return ByteBuffer.allocate(8).putLong(l).array();
    }

    public static int bytes2Int(byte[] bytes) {
        return ByteBuffer.wrap(bytes).getInt();
    }

    public static long bytes2Long(byte[] bytes) {
        return ByteBuffer.wrap(bytes).getLong();
    }
}

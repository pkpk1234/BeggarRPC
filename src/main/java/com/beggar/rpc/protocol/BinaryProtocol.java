package com.beggar.rpc.protocol;

import com.beggar.rpc.io.IOChannel;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-06
 */
public abstract class BinaryProtocol extends Protocol {

    public BinaryProtocol(IOChannel ioChannel) {
        super(ioChannel);
    }

    @Override
    public void writeInt(int i) {
        byte[] bytes = BinaryConverter.int2Bytes(i);
        this.ioChannel.write(bytes, 0, bytes.length);
    }

    @Override
    public void writeLong(long l) {
        byte[] bytes = BinaryConverter.long2Bytes(l);
        this.ioChannel.write(bytes, 0, bytes.length);
    }

    @Override
    public int readInt() {
        byte[] bytes = new byte[4];
        this.ioChannel.read(bytes, 0, bytes.length);
        int i = BinaryConverter.bytes2Int(bytes);
        return i;
    }

    @Override
    public long readLong() {
        byte[] bytes = new byte[8];
        this.ioChannel.read(bytes, 0, bytes.length);
        long l = BinaryConverter.bytes2Long(bytes);
        return l;
    }
}

package com.beggar.rpc.protocol;

import com.beggar.rpc.io.IOChannelProvider;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-06
 */
public class BinaryProtocol extends Protocol {

    public BinaryProtocol(IOChannelProvider ioChannelProvider) {
        super(ioChannelProvider);
    }

    @Override
    public void writeInt(int i) {

    }

    @Override
    public void writeLong(long l) {

    }

    @Override
    public int readInt() {
        return 0;
    }

    @Override
    public long readLong() {
        return 0;
    }
}

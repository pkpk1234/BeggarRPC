package com.beggar.rpc.protocol;

import com.beggar.rpc.io.IOChannel;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-05
 */
public abstract class Protocol {
    protected IOChannel ioChannel;

    public Protocol(IOChannel ioChannel) {
        this.ioChannel = ioChannel;
    }

    // write methods

    public abstract void writeInt(int i);

    public abstract void writeLong(long l);

    public void writeBytes(byte[] buffer, int index, int length) {
        this.ioChannel.write(buffer, index, length);
    }

    // read methods

    public abstract int readInt();

    public abstract long readLong();

    public int readBytes(byte[] buffer, int index, int length) {
        return this.ioChannel.read(buffer, index, length);
    }

}

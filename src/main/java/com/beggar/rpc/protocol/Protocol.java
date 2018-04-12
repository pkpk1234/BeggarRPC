package com.beggar.rpc.protocol;

import com.beggar.rpc.io.IOChannel;

import java.nio.charset.Charset;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-05
 */
public abstract class Protocol<T> {
    protected IOChannel ioChannel;

    public Protocol(IOChannel ioChannel) {
        this.ioChannel = ioChannel;
    }

    // being and end methods
    public abstract void begin(T header);

    public abstract void end();

    // write methods

    public abstract void writeInt(int i);

    public abstract void writeLong(long l);

    public void writeBytes(byte[] buffer, int index, int length) {
        this.ioChannel.write(buffer, index, length);
    }

    public void writeBytes(byte[] buffer) {
        this.writeBytes(buffer,0,buffer.length);
    }

    public void writeString(String string, Charset charset) {
        byte[] bytes = string.getBytes(charset);
        this.writeBytes(bytes, 0, bytes.length);
    }
    // read methods

    public abstract int readInt();

    public abstract long readLong();

    public int readBytes(byte[] buffer, int index, int length) {
        return this.ioChannel.read(buffer, index, length);
    }

    public int readBytes(byte[] buffer) {
        return this.ioChannel.read(buffer,0,buffer.length);
    }

    public String readString(int length ,Charset charset) {
        byte[] bytes = new byte[length];
        this.readBytes(bytes,0,length);
        return new String(bytes,charset);
    }
}

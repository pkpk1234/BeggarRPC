package com.beggar.rpc.io;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-05
 */
public interface IOChannel{
    int read(byte[] buffer,int idx,int len);
    void write(byte[] buffer,int idx,int len);
}

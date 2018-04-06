package com.beggar.rpc.protocol;

import com.beggar.rpc.io.IOChannelProvider;
import com.beggar.rpc.protocol.id.IdGenerator;
import com.beggar.rpc.protocol.id.SnowFlakeIdGenerator;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-06
 */
public class MessageProtocol extends BinaryProtocol {
    private IdGenerator<Long> idGenerator;

    public MessageProtocol(IOChannelProvider ioChannelProvider) {
        super(ioChannelProvider);
        idGenerator = SnowFlakeIdGenerator.getInstance();
    }

    private long getMessageId() {
        return this.idGenerator.next();
    }
}

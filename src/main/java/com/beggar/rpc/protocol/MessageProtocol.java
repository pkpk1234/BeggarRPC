package com.beggar.rpc.protocol;

import com.beggar.rpc.io.IOChannel;
import com.beggar.rpc.protocol.id.IdGenerator;
import com.beggar.rpc.protocol.id.SnowFlakeIdGenerator;

/**
 *
 * 读写message
 *
 *  * 0   7   15  23  31  39  47  55  63
 * +---+---+---+---+---+---+---+---+
 * |0  | b | e | g | g | a | r | 0 |
 * |   |   |   |   |   |   |   |   |
 * +---+---+---+---+---+---+---+---+
 * |               |               |
 * |   Type        |  version      |
 * +---+---+---+---+---+---+---+---+
 * |                               |
 * |   message id : snowflake      |
 * +---+---+---+---+---+---+---+---+
 * |                               |
 * |   Body Size                   |
 * +---+---+---+---+---+---+---+---+
 * |
 * |   Body Content             ... ...
 * +---+---+---+---+---+---+---+---+
 *
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-06
 */
public class MessageProtocol extends BinaryProtocol<MessageHeader> {
    private IdGenerator<Long> idGenerator = SnowFlakeIdGenerator.getInstance();

    public MessageProtocol(IOChannel ioChannel) {
        super(ioChannel);
    }

    @Override
    public void begin(MessageHeader header) {
    }


    @Override
    public void end() {

    }


}

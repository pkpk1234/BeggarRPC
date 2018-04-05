package com.beggar.rpc.server;

import com.beggar.rpc.io.ChannelProvider;
import com.beggar.rpc.protocol.ProtocolProvider;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-05
 */
public abstract class AbstractServer implements Server {
    private ProtocolProvider protocolProvider;
    private ChannelProvider channelProvider;
}

package com.beggar.rpc.protocol.id;

import com.relops.snowflake.Snowflake;

/**
 * SnowFlake Id 生成器
 *
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-06
 */
public class SnowFlakeIdGenerator implements IdGenerator<Long> {
    private int currentNode;
    private Snowflake snowflake;
    private static volatile SnowFlakeIdGenerator INSTANCE;
    private NodeNumberFactory nodeNumberFactory;

    private SnowFlakeIdGenerator(NodeNumberFactory nodeNumberFactory) {
        this.currentNode = nodeNumberFactory.getNodeNumber();
        snowflake = new Snowflake(this.currentNode);
    }

    private SnowFlakeIdGenerator() {
        this(new DefaultNodeNumberFactory());
    }

    /**
     * 因为需要传参数，所以无法使用static instance holder，只能用DLC
     *
     * @param nodeNumberFactory
     * @return
     */
    public static SnowFlakeIdGenerator getInstance(NodeNumberFactory nodeNumberFactory) {
        if (INSTANCE == null) {
            synchronized (SnowFlakeIdGenerator.class) {
                INSTANCE = new SnowFlakeIdGenerator(nodeNumberFactory);
            }
        }
        return INSTANCE;
    }

    public static SnowFlakeIdGenerator getInstance() {
        if (INSTANCE == null) {
            synchronized (SnowFlakeIdGenerator.class) {
                INSTANCE = new SnowFlakeIdGenerator();
            }
        }
        return INSTANCE;
    }

    @Override
    public Long next() {
        return snowflake.next();
    }
}

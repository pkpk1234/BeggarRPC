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

    private SnowFlakeIdGenerator(int currentNode) {
        this.currentNode = currentNode;
        snowflake = new Snowflake(this.currentNode);
    }

    /**
     * 因为需要传参数，所以无法使用static instance holder，只能用DLC
     *
     * @param currentNode
     * @return
     */
    public static SnowFlakeIdGenerator getInstance(int currentNode) {
        if (INSTANCE == null) {
            synchronized (SnowFlakeIdGenerator.class) {
                INSTANCE = new SnowFlakeIdGenerator(currentNode);
            }
        }
        return INSTANCE;
    }

    public int getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(int currentNode) {
        this.currentNode = currentNode;
    }

    @Override
    public Long next() {
        return snowflake.next();
    }
}

package com.beggar.rpc.protocol;

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

    public SnowFlakeIdGenerator(int currentNode) {
        this.currentNode = currentNode;
        snowflake = new Snowflake(this.currentNode);
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

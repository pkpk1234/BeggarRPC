package com.beggar.rpc.protocol.id;

/**
 * 从环境变量中获取node值
 *
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-06
 */
public class DefaultNodeNumberFactory implements NodeNumberFactory {

    @Override
    public int getNodeNumber() {
        return Integer.parseInt(System.getProperty("node", "0"));
    }

}

package com.ljm.protocol;

/**
 * 协议体
 *
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-03-09
 */
public class PlayLoad {
    //消息内容
    private byte[] content;

    public PlayLoad(byte[] content) {
        this.content = content;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public int getPlayLoadSize() {
        return content.length;
    }
}

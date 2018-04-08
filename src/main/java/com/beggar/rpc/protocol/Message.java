package com.beggar.rpc.protocol;

import java.util.Objects;

/**
 * VO类，存放Message信息
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-06
 */
public class Message {
    protected final byte[] MAGIC_NUMBER = "0beggar0".getBytes();
    private int type;
    private int version;
    private long messageId;
    private long bodySize;
    private byte[] playload;

    public byte[] getPlayload() {
        return playload;
    }

    public void setPlayload(byte[] playload) {
        this.playload = playload;
    }

    public byte[] getMAGIC_NUMBER() {
        return MAGIC_NUMBER;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public long getBodySize() {
        return bodySize;
    }

    public void setBodySize(long bodySize) {
        this.bodySize = bodySize;
    }

    @Override
    public String toString() {
        return "Message{" +
                "type=" + type +
                ", version=" + version +
                ", messageId=" + messageId +
                ", bodySize=" + bodySize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Message message = (Message) o;
        return type == message.type &&
                version == message.version &&
                messageId == message.messageId &&
                bodySize == message.bodySize;
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, version, messageId, bodySize);
    }
}

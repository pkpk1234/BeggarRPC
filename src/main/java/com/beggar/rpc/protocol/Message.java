package com.beggar.rpc.protocol;

import java.util.Objects;

/**
 * 0   7   15  23  31  39  47  55  63
 * +---+---+---+---+---+---+---+---+
 * |0  | b | e | g | g | a | r | 0 |
 * |   |   |   |   |   |   |   |   |
 * +---+---+---+---+---+---+---+---+
 * |               |               |
 * |  Header Size  |  version      |
 * +---+---+---+---+---+---+---+---+
 * |                               |
 * |   message id : snowflake      |
 * +---+---+---+---+---+---+---+---+
 * |                               |
 * |   Body Size                   |
 * +---+---+---+---+---+---+---+---+
 * |
 * |   Header Attachments       ... ...
 * +---+---+---+---+---+---+---+---+
 * |
 * |   Body Content             ... ...
 * +---+---+---+---+---+---+---+---+
 *
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-06
 */
public class Message {
    protected final byte[] MAGIC_NUMBER = "0beggar0".getBytes();
    private int headerSize;
    private int version;
    private long messageId;
    private long bodySize;

    public byte[] getMAGIC_NUMBER() {
        return MAGIC_NUMBER;
    }

    public int getHeaderSize() {
        return headerSize;
    }

    public void setHeaderSize(int headerSize) {
        this.headerSize = headerSize;
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
                "headerSize=" + headerSize +
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
        return headerSize == message.headerSize &&
                version == message.version &&
                messageId == message.messageId &&
                bodySize == message.bodySize;
    }

    @Override
    public int hashCode() {

        return Objects.hash(headerSize, version, messageId, bodySize);
    }
}

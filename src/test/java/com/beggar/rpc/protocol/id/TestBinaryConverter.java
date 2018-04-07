package com.beggar.rpc.protocol.id;

import com.beggar.rpc.protocol.BinaryConverter;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-07
 */
public class TestBinaryConverter {
    @Test
    public void testI2B() {
        int i = 0b0000_0000_0000_1000; //i = 8;
        byte[] bytes = BinaryConverter.int2Bytes(i);
        byte[] iBytes = {0b0,0b0,0b0,0b1000};
        Assert.assertArrayEquals(iBytes,bytes);
    }

    @Test
    public void testB2I() {
        byte[] iBytes = {0b0,0b0,0b0,0b1000}; // 8
        int i = BinaryConverter.bytes2Int(iBytes);
        Assert.assertEquals(8,i);
    }

    @Test
    public void testL2B() {
        long l = 0xFFFF_FFFF_FFFF_FFF2L; // 1111{15}0010 -14
        byte[] bytes = BinaryConverter.long2Bytes(l);
        byte[] lBytes = {-1,-1,-1,-1,-1,-1,-1,-14};
        Assert.assertArrayEquals(lBytes,bytes);

    }

    @Test
    public void testB2L() {
        byte[] lBytes = {-1,-1,-1,-1,-1,-1,-1,-14};
        long l = BinaryConverter.bytes2Long(lBytes);
        Assert.assertEquals(-14l,l);
    }
}

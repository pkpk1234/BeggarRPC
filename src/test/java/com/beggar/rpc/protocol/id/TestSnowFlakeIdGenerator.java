package com.beggar.rpc.protocol.id;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-04-06
 */
public class TestSnowFlakeIdGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestSnowFlakeIdGenerator.class);

    private Long nextId() {
        return SnowFlakeIdGenerator.getInstance(1).next();
    }

    @Test
    public void testNextId() {
        Long id = nextId();
        assertNotNull(id);
        LOGGER.info(id.toString());
    }


    @Test
    public void testNextIsBigger() {
        Long id1 = nextId();
        Long id2 = nextId();
        assertTrue(id2 > id1);
    }
    
}

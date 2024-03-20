package com.learn;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback 日志框架的 quick start
 */
public class TestLogback01 {

    // 1.定义日志记录器
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogback01.class);

    // 2.打印日志
    @Test
    public void quickStart(){
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug"); // logback 的默认日志级别为 debug，因此只会打印 debug 以上级别的日志
        LOGGER.trace("trace");
    }

    // 3.日志打印结果：
    /**
     * 14:01:25.342 [main] ERROR com.learn.TestLogback01 - error
     * 14:01:25.345 [main] WARN com.learn.TestLogback01 - warn
     * 14:01:25.345 [main] INFO com.learn.TestLogback01 - info
     * 14:01:25.345 [main] DEBUG com.learn.TestLogback01 - debug
     */
}

package com.learn;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback 日志框架的 logback.xml 配置文件配置
 */
public class TestLogback02 {

    // 0.将 logback02.xml 文件名修改为 logback.xml 使得配置文件生效

    // 1.定义日志记录器，这个默认创建的日志记录器，会继承 logback.xml 文件中 root 根日志记录器的配置。
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogback02.class);

    // 2.打印日志
    @Test
    public void testLogback(){
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }

    // 3.日志打印结果：
    /**
     * 2024-01-11 14:05:03.660 -- com.learn.TestLogback02 [main] ERROR error
     * 2024-01-11 14:05:03.661 -- com.learn.TestLogback02 [main] WARN  warn
     * 2024-01-11 14:05:03.661 -- com.learn.TestLogback02 [main] INFO  info
     * 2024-01-11 14:05:03.661 -- com.learn.TestLogback02 [main] DEBUG debug
     * 2024-01-11 14:05:03.661 -- com.learn.TestLogback02 [main] TRACE trace
     */

}

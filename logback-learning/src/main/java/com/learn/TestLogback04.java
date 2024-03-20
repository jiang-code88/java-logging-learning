package com.learn;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback 日志框架的 FileAppender 输出日志到 logs/logback.log 和 logs/logback.html 文件中
 */
public class TestLogback04 {

    // 0.将 logback04.xml 文件名修改为 logback.xml 使得配置文件生效

    // 1.定义日志记录器
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogback04.class);

    // 2.打印日志
    @Test
    public void testLogback(){
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }

    // 3.日志打印结果
    /**
     * 在 控制台 和 logs/logback.log、logs/logback.html 文件，三个目的地中输出以下日志记录
     * 2024-01-11 16:10:24.468 - com.learn.TestLogback04 [main] ERROR error
     * 2024-01-11 16:10:24.469 - com.learn.TestLogback04 [main] WARN  warn
     * 2024-01-11 16:10:24.469 - com.learn.TestLogback04 [main] INFO  info
     */

}

package com.learn;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback 日志框架的 logback.xml 配置文件配置之自定义日志记录器
 */
public class TestLogback03 {

    // 0.将 logback03.xml 文件名修改为 logback.xml 使得配置文件生效

    // 1.定义日志记录器
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogback03.class);

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
    // 自定义日志记录器 TestLogback03 设置日志级别为 INFO，
    // 同时继承 root 根日志记录器的 console appender 在控制台目的地输出日志
    /**
     * 2024-01-11 14:53:55.435 ---- com.learn.TestLogback03 [main] ERROR error
     * 2024-01-11 14:53:55.436 ---- com.learn.TestLogback03 [main] WARN  warn
     * 2024-01-11 14:53:55.436 ---- com.learn.TestLogback03 [main] INFO  info
     */
}

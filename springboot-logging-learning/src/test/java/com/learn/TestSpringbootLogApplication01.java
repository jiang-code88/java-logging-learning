package com.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Springboot 日志 quick start
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class TestSpringbootLogApplication01 {

    // 1. 定义日志记录器
    public static final Logger LOGGER = LoggerFactory.getLogger(TestSpringbootLogApplication01.class);

    // 2.打印日志
    @Test
    public void testSpringbootLogging(){
        // springboot 集成的日志框架(logback)打印日志信息
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info"); // springboot 的默认日志级别为 info
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }

    // 3.日志输出结果
    /**
     * 2024-01-12 17:29:11.309 ERROR 51026 --- [           main] com.learn.SpringbootLogApplicationTests  : error
     * 2024-01-12 17:29:11.310  WARN 51026 --- [           main] com.learn.SpringbootLogApplicationTests  : warn
     * 2024-01-12 17:29:11.310  INFO 51026 --- [           main] com.learn.SpringbootLogApplicationTests  : info
     */
}


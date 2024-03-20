package com.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Springboot 日志之配置自定义日志记录器的日志级别
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class TestSpringbootLogApplication02 {

    // 0.将 application02.properties 文件名修改为 application.properties 使得配置文件生效

    // 1.定义日志记录器
    private static final Logger LOGGER = LoggerFactory.getLogger(TestSpringbootLogApplication02.class);

    // 2.打印日志
    @Test
    public void testSpringbootLogging(){
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }

    // 3.日志输出结果
    /**
     * 已配置 com.learn 包下类的日志记录器的日志级别为 trace，
     * 所以打印的所有 trace 以上级别的日志。
     *
     * 2024-01-12 17:47:54.498 ERROR 51345 --- [           main] c.learn.TestSpringbootLogApplication02   : error
     * 2024-01-12 17:47:54.498  WARN 51345 --- [           main] c.learn.TestSpringbootLogApplication02   : warn
     * 2024-01-12 17:47:54.498  INFO 51345 --- [           main] c.learn.TestSpringbootLogApplication02   : info
     * 2024-01-12 17:47:54.498 DEBUG 51345 --- [           main] c.learn.TestSpringbootLogApplication02   : debug
     * 2024-01-12 17:47:54.498 TRACE 51345 --- [           main] c.learn.TestSpringbootLogApplication02   : trace
     */
}

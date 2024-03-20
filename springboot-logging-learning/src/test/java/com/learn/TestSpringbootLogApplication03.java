package com.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Springboot 日志之配置日志记录输出格式
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class TestSpringbootLogApplication03 {

    // 0.将 application03.properties 文件名修改为 application.properties 使得配置文件生效

    // 1.定义日志记录器
    private static final Logger LOGGER = LoggerFactory.getLogger(TestSpringbootLogApplication03.class);

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
     * 2024-01-12 18:07:32.551 -x- com.learn.TestSpringbootLogApplication02 [main] ERROR error
     * 2024-01-12 18:07:32.551 -x- com.learn.TestSpringbootLogApplication02 [main] WARN  warn
     * 2024-01-12 18:07:32.551 -x- com.learn.TestSpringbootLogApplication02 [main] INFO  info
     */

}

package com.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Springboot 日志之使用 logback.xml 配置文件进行详细配置
 * - 如果存在 logback.xml 配置文件配置，那么在 application.properties 文件中的配置将作废。
 * - logback.xml 配置文件是直接被 logback 日志框架读取的
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class TestSpringbootLogApplication05 {

    // 0.将 logback05.xml 文件名修改为 logback.xml 使得配置文件生效。

    // 1.定义日志记录器
    private static final Logger LOGGER = LoggerFactory.getLogger(TestSpringbootLogApplication05.class);

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
     * 在 logs/logback.log 日志文件中输出 TestSpringbootLogApplication05 类的 INFO 级别以上的日志
     *
     * 2024-01-12 18:41:32.851 -=- com.learn.TestSpringbootLogApplication05 [main] INFO  Starting TestSpringbootLogApplication05 on JRKdeMacBook-Pro.local with PID 52245 (started by jrk in /Users/jrk/repository/java-logging-learning/springboot-logging-learning)
     * 2024-01-12 18:41:32.851 -=- com.learn.TestSpringbootLogApplication05 [main] INFO  No active profile set, falling back to default profiles: default
     * 2024-01-12 18:41:33.525 -=- com.learn.TestSpringbootLogApplication05 [main] INFO  Started TestSpringbootLogApplication05 in 0.766 seconds (JVM running for 1.049)
     * 2024-01-12 18:41:33.581 -=- com.learn.TestSpringbootLogApplication05 [main] ERROR error
     * 2024-01-12 18:41:33.581 -=- com.learn.TestSpringbootLogApplication05 [main] WARN  warn
     * 2024-01-12 18:41:33.581 -=- com.learn.TestSpringbootLogApplication05 [main] INFO  info
     */

}

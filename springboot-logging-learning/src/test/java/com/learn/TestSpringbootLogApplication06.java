package com.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Springboot 日志之使用 logback-spring.xml 配置文件进行配置
 * - logback-spring.xml 是由 springboot 框架解析的配置文件
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class TestSpringbootLogApplication06 {

    // 0.将 logback-spring06.xml 文件名修改为 logback-spring.xml 使得配置文件生效。

    // 1.定义日志记录器
    private static final Logger LOGGER = LoggerFactory.getLogger(TestSpringbootLogApplication06.class);

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
     * 在 logs/logback.log 日志文件中输出以下日志
     *
     * 2024-01-13 14:09:04.531 -==- com.learn.TestSpringbootLogApplication06 [main] INFO  Starting TestSpringbootLogApplication06 on JRKdeMacBook-Pro.local with PID 63198 (started by jrk in /Users/jrk/repository/java-logging-learning/springboot-logging-learning)
     * 2024-01-13 14:09:04.532 -==- com.learn.TestSpringbootLogApplication06 [main] INFO  No active profile set, falling back to default profiles: default
     * 2024-01-13 14:09:05.208 -==- com.learn.TestSpringbootLogApplication06 [main] INFO  Started TestSpringbootLogApplication06 in 0.853 seconds (JVM running for 1.107)
     * 2024-01-13 14:09:05.267 -==- com.learn.TestSpringbootLogApplication06 [main] ERROR error
     * 2024-01-13 14:09:05.267 -==- com.learn.TestSpringbootLogApplication06 [main] WARN  warn
     * 2024-01-13 14:09:05.267 -==- com.learn.TestSpringbootLogApplication06 [main] INFO  info
     */

}

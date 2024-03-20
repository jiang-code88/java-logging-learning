package com.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Springboot 日志之输出日志到日志文件
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class TestSpringbootLogApplication04 {

    // 0.将 application04.properties 文件名修改为 application.properties 使得配置文件生效

    // 1.定义日志记录器
    private static final Logger LOGGER = LoggerFactory.getLogger(TestSpringbootLogApplication04.class);

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
     * 在 logs/springboot.log 文件中，按指定的日志格式输出以下日志记录
     *
     * 2024-01-12 18:13:35.608 -xx- com.learn.TestSpringbootLogApplication04 [main] INFO  Starting TestSpringbootLogApplication04 on JRKdeMacBook-Pro.local with PID 51774 (started by jrk in /Users/jrk/repository/java-logging-learning/springboot-logging-learning)
     * 2024-01-12 18:13:35.608 -xx- com.learn.TestSpringbootLogApplication04 [main] INFO  No active profile set, falling back to default profiles: default
     * 2024-01-12 18:13:36.218 -xx- org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor [main] INFO  Initializing ExecutorService 'applicationTaskExecutor'
     * 2024-01-12 18:13:36.304 -xx- com.learn.TestSpringbootLogApplication04 [main] INFO  Started TestSpringbootLogApplication04 in 0.821 seconds (JVM running for 1.079)
     * 2024-01-12 18:13:36.364 -xx- com.learn.TestSpringbootLogApplication04 [main] ERROR error
     * 2024-01-12 18:13:36.364 -xx- com.learn.TestSpringbootLogApplication04 [main] WARN  warn
     * 2024-01-12 18:13:36.364 -xx- com.learn.TestSpringbootLogApplication04 [main] INFO  info
     * 2024-01-12 18:13:36.366 -xx- org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor [Thread-2] INFO  Shutting down ExecutorService 'applicationTaskExecutor'
     */
}

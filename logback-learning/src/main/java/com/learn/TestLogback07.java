package com.learn;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback 日志框架的异步记录日志
 *  - 默认为同步日志, 记录日志代码和功能代码是依次同步运行的
 *  - 异步日志可以提高日志记录的效率
 */
public class TestLogback07 {
    // 0.将 logback07.xml 文件名修改为 logback.xml 使得配置文件生效

    // 1.定义日志记录器
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogback07.class);

    // 2.打印日志
    @Test
    public void testLogback(){
        int lines = 70000;
        for (int i = 0; i < lines; i++){
            LOGGER.error("error");
            LOGGER.warn("warn");
            LOGGER.info("info");
            LOGGER.debug("debug");
            LOGGER.trace("trace");
        }
    }

    // 3.日志打印结果
    /**
     * 异步的将日志输出到 控制台 和以下配置文件中：
     *
     * logback_roll.2024-01-11-18-12-57.log_0
     * logback_roll.2024-01-11-18-12-57.log_1
     * logback_roll.2024-01-11-18-12-57.log_2
     * logback_roll.log
     */
}

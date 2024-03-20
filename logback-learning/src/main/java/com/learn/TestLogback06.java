package com.learn;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback 日志框架的日志过滤器，只把 error 以及以上级别的日志写入日志文件中，以下级别的拦截
 */
public class TestLogback06 {
    // 0.将 logback06.xml 文件名修改为 logback.xml 使得配置文件生效

    // 1.定义日志记录器
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogback06.class);

    // 2.打印日志
    @Test
    public void testLogback(){
        int lines = 60000;
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
     * 只把 ERROR 及其以上级别的日志记录写入以下文件中，其他以下级别的日志将拦截不写入日志文件中
     * logback_roll.log
     * logback_roll.2024-01-11-17-44-40.log_0
     * logback_roll.2024-01-11-17-44-40.log_1
     */
}

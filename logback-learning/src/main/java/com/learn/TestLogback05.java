package com.learn;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback 日志框架的日志文件拆分和归档压缩
 */
public class TestLogback05 {

    // 0.将 logback05.xml 文件文修改为 logback.xml 使得配置文件生效

    // 1.定义日志记录器
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogback05.class);

    // 2.打印日志
    @Test
    public void testRollingLogFile(){
        int lines_more = 50000;
        for (int i = 0; i < lines_more; i++){
            LOGGER.error("error");
            LOGGER.warn("warn");
            LOGGER.info("info");
            LOGGER.debug("debug");
            LOGGER.trace("trace");
        }
    }

    // 3. 日志打印结果
    /**
     * 输出日志到 控制台和 logback.log 文件中，并且先按时间每秒，再按大小每 2MB 拆分归档日志文件
     * 归档的日志文件使用 gzip 压缩为 .gz 文件
     *
     * logback_roll.log
     * logback_roll.2024-01-11-17-00-21.log_0.gz
     * logback_roll.2024-01-11-17-00-21.log_1.gz
     * logback_roll.2024-01-11-17-00-22.log_0.gz
     */
}

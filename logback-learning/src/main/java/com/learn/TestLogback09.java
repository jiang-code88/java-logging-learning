package com.learn;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.URL;

/**
 * logback 日志框架之指定配置文件读取配置
 */

public class TestLogback09 {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogback09.class);

    public void configureByConfigurationFile(String filename){
        ClassLoader cl = TestLogback09.class.getClass().getClassLoader();
        if (cl == null) {
            cl =  ClassLoader.getSystemClassLoader();
        }

        URL resource = cl.getResource(filename);

        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        try {
            JoranConfigurator configurator = new JoranConfigurator();
            loggerContext.reset();
            configurator.setContext(loggerContext);
            configurator.doConfigure(resource);
        } catch (JoranException e) {
            StatusPrinter.print(loggerContext.getStatusManager());
        }
    }

    @Test
    public void testLogback(){

        // 1.指定读取 classpath 目录下的 logback02.xml 配置文件。
        configureByConfigurationFile("logback02.xml");

        // 2.使用 logback.xml 配置文件中的配置信息，打印日志记录。
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");

        // 3.日志输出结果：
        /**
         * 2024-01-14 01:39:14.448 -c- com.learn.TestLogback09 [main] ERROR error
         * 2024-01-14 01:39:14.449 -c- com.learn.TestLogback09 [main] WARN  warn
         * 2024-01-14 01:39:14.449 -c- com.learn.TestLogback09 [main] INFO  info
         * 2024-01-14 01:39:14.449 -c- com.learn.TestLogback09 [main] DEBUG debug
         * 2024-01-14 01:39:14.449 -c- com.learn.TestLogback09 [main] TRACE trace
         */
    }

}

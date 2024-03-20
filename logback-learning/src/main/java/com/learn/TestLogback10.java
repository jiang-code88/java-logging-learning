package com.learn;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback 日志框架之编程式配置-spi 机制（Service Provider Interface 机制）
 * - java 提供的一套用来被第三方实现或者拓展的的 API，它可以用来启用框架扩展和替换组件。
 *   他是一种服务发现机制。它通过在 ClassPath 路径下的 META-INF/Service 目录查找文件，自动加载文件里所定义的类。
 */
public class TestLogback10 {

    // 1. 定义日志记录器
    /**
     * 定义日志记录器
     * - spi 机制会加载 META-INF/services/ch.qos.logback.classic.spi.Configurator 文件中的，
     *   ch.qos.logback.classic.spi.Configurator 接口实现类 com.learn.configuration.MyConfiguration。
     * - com.learn.configuration.MyConfiguration 实现类中定义了一个控制台输出的 console appender，
     *   然后将其注册到 root 根日志记录器，所以日志会按 console appender 的日志输出格式，输出日志到控制台。
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogback10.class);

    // 2.打印日志
    @Test
    public void testLogback(){
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }

    // 3.日志输出结果
    /**
     * 02:20:04.410 [main] ERROR com.learn.TestLogback10 -|x|- error
     * 02:20:04.411 [main] WARN  com.learn.TestLogback10 -|x|- warn
     * 02:20:04.412 [main] INFO  com.learn.TestLogback10 -|x|- info
     * 02:20:04.412 [main] DEBUG com.learn.TestLogback10 -|x|- debug
     */

}

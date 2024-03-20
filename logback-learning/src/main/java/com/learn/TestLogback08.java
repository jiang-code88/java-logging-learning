package com.learn;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.joran.JoranConfigurator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback 日志框架的代码配置日志记录器
 */
public class TestLogback08 {

    // Logback 日志记录器的继承关系
    @Test
    public void testLogbackInherit(){
        // 1.父日志记录器 com（继承 root 根日志记录器）
        Logger logger_com = LoggerFactory.getLogger("com");

        // 2.子日志记录器 com.learn（继承 com 日志记录器）
        Logger logger_com_learn = LoggerFactory.getLogger("com.learn");

        // 3.子日志记录器 com.learn.TestLogback08（继承 com.learn 日志记录器）
        Logger logger_com_learn_TestLogback08 = LoggerFactory.getLogger("com.learn.TestLogback08");

        // a.子日志记录器会继承父日志记录器的 日志级别 level（如果子日志记录器没有定义日志级别 level 时）

        logger_com.error("error");
        logger_com.warn("warn");
        logger_com.info("info");
        logger_com.debug("debug"); // 默认日志级别
        logger_com.trace("trace");

        // 4.日志输出结果：
        /**
         * 01:41:27.374 [main] ERROR com - error
         * 01:41:27.375 [main] WARN com - warn
         * 01:41:27.375 [main] INFO com - info
         * 01:41:27.375 [main] DEBUG com - debug
         */
    }

    // 代码配置 Logback 日志记录器
    @Test
    public void testLogback(){
        // 原生 logback 的 root 根日志记录器
        ch.qos.logback.classic.Logger logger_root =
                (ch.qos.logback.classic.Logger)LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        System.out.println("root 根日志记录器的日志级别：" + logger_root.getEffectiveLevel());

        // 原生 logback 的 com 日志记录器
        ch.qos.logback.classic.Logger logger_com =
                (ch.qos.logback.classic.Logger)LoggerFactory.getLogger("com");
        // 查看 com 日志记录器的日志级别
        System.out.println("com 日志记录器的日志级别：" + logger_com.getEffectiveLevel()); // 继承 root 日志记录器的默认 DEBUG 日志级别

        // 设置 com 日志记录器的日志级别为 ALL
        logger_com.setLevel(Level.ALL);
        // 查看 com 日志记录器的日志级别
        System.out.println("修改后的 com 日志记录器的日志级别：" + logger_com.getEffectiveLevel());

        System.out.println("日志输出结果：将输出所有级别的日志记录");
        logger_com.error("error");
        logger_com.warn("warn");
        logger_com.info("info");
        logger_com.debug("debug");
        logger_com.trace("trace");
    }

}

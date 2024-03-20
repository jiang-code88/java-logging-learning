package com.learn;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 企业级开发中如何正确的打日志指南
 */

public class TestLogback11 {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogback11.class);

    @Test
    public void testHowToLog(){
        // 一、不要使用字符串拼接打印日志，使用参数化信息的方式打印日志
        int id = 123;
        String symbol = "INFO";

        // 正例：
        LOGGER.info("Processing trade with id: [{}] and symbol: [{}]", id, symbol);

        // 反例：字符串拼接会产生很多 String 对象，占用空间，影响性能
        LOGGER.info("Processing trade with id: [" + id + "] and symbol: ["+ symbol + "]");

        // 二、各种日志级别的含义
        // 1.ERROR：影响到程序正常运行、当前请求正常运行的异常情况
        // 1）打开配置文件失败
        // 2）所有第三方对接的异常（包括第三方返回错误码）
        // 3）所有影响功能使用的异常，包括：SQLException 和除了业务异常之外的所有异常
        // 4）不应该出现的情况，比如要使用阿里云传图片，但是未响应
        // 5）如果有 Throwable 信息，需要记录完全的堆栈信息：
        String username = "jackson";
        try{
            int var = 1 / 0;
        }catch (Exception e){
            String errorMessage = String.format("获取用于[{%s}]的用户信息时出错", username);
            LOGGER.error(errorMessage, e);
        }
        // 6）如果有抛出异常的操作，不要记录 error 日志
        // 反例：
        try{
            // ...
        }catch (Exception e){
            String errorMessage = String.format("Error while reading information of user [%s]", username);
            LOGGER.error(errorMessage, e);
            throw new UserServiceException(errorMessage, e);
        }

        // 2.WARN：不应该出现但是不影响程序、当前请求正常运行的异常情况
        // 1）有容错机制的时候出现的错误情况
        // 2）找不到配置文件，但是系统能自动创建默认配置文件
        // 3）即将接近临界值的时候，例如：缓存池占用达到警告线，业务异常的记录，比如：用户锁定异常。

        // 3.INFO：系统运行情况
        // 1）Service 方法中对于系统/业务状态的变更
        // 2）主要逻辑中的分步骤：1）初始化什么，2）加载什么
        // 3）调用外部接口部分
        // 4）客户端请求参数（REST/WS）
        // 5）调用第三方时的调用参数和调用结果
        // 6）对于复杂的业务逻辑，需要进行日志打点，以及日志埋点。
        // 7）调用其他第三方服务时，所有的出参和入参是必须要记录的（因为如果是第三方模块发生的问题很难追溯）

        // 4.DEBUG：调试信息，打印所有你想知道的信息，相关参数等
        // 1）生产环境需要关闭 DEBUG 信息
        // 2）如果在生产情况下需要开启 DEBUG，需要使用开关进行管理，不能一直开启。

        // 5.TRACE：特别详细的系统运行完整信息，业务代码中不要使用，要使用也建议用 DEBUG
    }
}

class UserServiceException extends RuntimeException{
    public UserServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}

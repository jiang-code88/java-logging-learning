package com.learn.spi;

import java.util.ServiceLoader;

/**
 * spi 机制：松耦合解析 Driver 接口实现类并调用 getConnection() 方法实现的服务端
 */
public class SpiService {
    public static void main(String[] args) {
        // 1.解析 META-INFO/services 目录下 com.learn.spi.Driver 文件中的实现类
        ServiceLoader<Driver> drivers = ServiceLoader.load(Driver.class);
        // 2.调用实现类的 getConnection() 方法
        for (Driver next : drivers) {
            next.getConnection();
        }
    }
}

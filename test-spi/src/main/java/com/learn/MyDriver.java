package com.learn;

import com.learn.spi.Driver;

public class MyDriver implements Driver {
    @Override
    public void getConnection() {
        System.out.println("this is test-spi");
    }
}

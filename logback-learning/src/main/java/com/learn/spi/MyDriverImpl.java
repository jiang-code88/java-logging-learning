package com.learn.spi;

public class MyDriverImpl implements Driver{
    @Override
    public void getConnection() {
        System.out.println("this is me");
    }
}

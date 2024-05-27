package com.mypack;

/*
Spring boot behind the curtain - Auto configuration
https://www.youtube.com/watch?v=Ybfo8Dwactg

1. How does Spring boot embeded server start?
2. How does Spring boot properties work?
3. How does Real spring boot code look like?

 */


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class Main {


    // Configuration is called default configuration
    @Configuration
    @Import(DefaultConfig.class)
    public static class MyAppConfig {

    }


    public static void main(String[] args) {

        new AnnotationConfigApplicationContext(DefaultConfig.class);
    }
}

package com.mypack;

/*
Spring boot behind the curtain - Auto configuration
https://www.youtube.com/watch?v=Ybfo8Dwactg

1. How does Spring boot embeded server start?
2. How does Spring boot properties work?
3. How does Real spring boot code look like?

 */

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.Context;

public class Main {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Process started");
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8082);

        // http://localhost:8082/context/hello

        Context context= tomcat.addContext("/context", null);
        Tomcat.addServlet(context, "helloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "helloServlet");
        // HelloServlet is a dispatcher servlet that will dispatch the request to the appropriate rest controller

        tomcat.start();
        // tomcat shuts itself down immediately, so we need to prevent the JVM from exiting


        // Need to have non blocking main thread and hence need to create a new thread
        new Thread(() -> {
            tomcat.getServer().await();
        }).start();

    }
}

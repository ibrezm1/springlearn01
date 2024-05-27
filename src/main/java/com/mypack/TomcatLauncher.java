package com.mypack;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.annotation.PostConstruct;

public  class TomcatLauncher{
    @PostConstruct
    public  void launch() throws LifecycleException {
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


        // Need to have non-blocking main thread and hence need to create a new thread
        new Thread(() -> {
            tomcat.getServer().await();
        }).start();
    }}

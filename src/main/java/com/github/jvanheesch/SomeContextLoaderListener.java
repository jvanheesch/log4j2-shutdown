package com.github.jvanheesch;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SomeContextLoaderListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("SomeContextLoaderListener.contextInitialized");
    }

    public void contextDestroyed(ServletContextEvent event) {
        SomeClassWithACommonsLogger.someMethodThatLogsSomething();
    }
}

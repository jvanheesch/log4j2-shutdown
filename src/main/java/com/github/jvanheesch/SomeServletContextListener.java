package com.github.jvanheesch;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SomeServletContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("SomeServletContextListener.contextInitialized");
    }

    public void contextDestroyed(ServletContextEvent event) {
        SomeClassWithACommonsLogger.someMethodThatLogsSomething();
    }
}

package com.github.jvanheesch;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SomeContextLoaderListener implements ServletContextListener {

    public SomeContextLoaderListener() {
    }


    public void contextInitialized(ServletContextEvent event) {
    }


    public void contextDestroyed(ServletContextEvent event) {
        SomeServletContextListener.log(event.getServletContext());
    }

}

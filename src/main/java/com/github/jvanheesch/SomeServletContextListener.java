package com.github.jvanheesch;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SomeServletContextListener implements ServletContextListener {
    private static final Log LOGGER = LogFactory.getLog(SomeServletContextListener.class);

    public void contextInitialized(ServletContextEvent sce) {

    }

    public void contextDestroyed(ServletContextEvent sce) {

    }

    static void log(ServletContext sc) {
        LOGGER.error("test");
    }
}

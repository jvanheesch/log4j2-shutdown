package com.github.jvanheesch;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletContext;

public class SomeClassWithALogger {
    private static final Log LOGGER = LogFactory.getLog(SomeClassWithALogger.class);

    static void log(ServletContext sc) {
        LOGGER.error("test");
    }
}

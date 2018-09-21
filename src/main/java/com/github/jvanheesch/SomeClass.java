package com.github.jvanheesch;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletContext;

public class SomeClass {
    private static final Log LOGGER = LogFactory.getLog(SomeClass.class);

    static void log(ServletContext sc) {
        LOGGER.error("test");
    }
}

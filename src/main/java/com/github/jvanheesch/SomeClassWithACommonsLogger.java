package com.github.jvanheesch;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SomeClassWithACommonsLogger {
    private static final Log LOGGER = LogFactory.getLog(SomeClassWithACommonsLogger.class);

    public static void log() {
        LOGGER.error("test");
    }
}

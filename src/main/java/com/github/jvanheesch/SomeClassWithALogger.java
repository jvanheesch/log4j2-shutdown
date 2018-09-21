package com.github.jvanheesch;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SomeClassWithALogger {
    private static final Log LOGGER = LogFactory.getLog(SomeClassWithALogger.class);

    public static void log() {
        LOGGER.error("test");
    }
}

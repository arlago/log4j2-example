package org.arl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger LOGGER = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        LOGGER.info("Simple info message.");
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Debug is enabled.");
        } else {
            LOGGER.info("Debug is not enabled.");
        }
    }
}

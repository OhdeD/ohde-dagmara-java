package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @Test
    public void testGetLastLog() {
        //Given
        logger.getInstance().log("Earlier log");
        logger.getInstance().log("Log in at 9.00");
        //When
        String lastLog = logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(lastLog, "Log in at 9.00");

    }
}

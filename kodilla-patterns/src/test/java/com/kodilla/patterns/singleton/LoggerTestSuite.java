package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static  Logger logger;

    @Test
    void testGetLastLog(){
        //Given
        logger = Logger.INSTANCE;
        logger.log("Example");
        //When
        String ex = logger.getLastLog();
        System.out.println("Last log: "+ex);
        //Then
        assertEquals("Example", ex);

    }
}

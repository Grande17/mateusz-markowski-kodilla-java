package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        assertEquals("Grocery", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }
    @Test
    void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertEquals("JohnSmith",driving.getTaskName());
        assertFalse(driving.isTaskExecuted());
    }
    @Test
    void testPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertEquals("Help", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }
}

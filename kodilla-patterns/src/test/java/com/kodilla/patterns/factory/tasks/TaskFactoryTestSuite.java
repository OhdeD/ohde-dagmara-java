package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        //When
        String name = shopping.getTaskName();
        shopping.executeTask();
        Boolean executed = shopping.isTaskExecuted();
        //Then
        Assert.assertEquals("Food", name);
        Assert.assertEquals(true, executed);
    }

    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        //When
        String name = painting.getTaskName();
        painting.executeTask();
        Boolean executed = painting.isTaskExecuted();
        //Then
        Assert.assertEquals("Kitchen", name);
        Assert.assertEquals(true, executed);
    }

    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //When
        String name = driving.getTaskName();
        driving.executeTask();
        Boolean executed = driving.isTaskExecuted();
        //Then
        Assert.assertEquals("Pick-up Martin", name);
        Assert.assertEquals(true, executed);
    }
}

package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.stream.Collectors;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When


        board.getToDoList().getTasks().add("Do tasks 7");

        board.getInProgressList().getTasks().add("In progress task 5");
        board.getDoneList().getTasks().add("Done tasks 1-4");
      String toDo =  board.getToDoList().getTasks()
                .stream()
                .collect(Collectors.joining(", ", "", ""));
       String inProgress = board.getInProgressList().getTasks()
                .stream()
                .collect(Collectors.joining(", ", "", ""));
        String done = board.getDoneList().getTasks()
                .stream()
                .collect(Collectors.joining(", ","",""));
        //Then
        Assert.assertEquals("Do tasks 7", toDo);
        Assert.assertEquals("In progress task 5", inProgress);
        Assert.assertEquals("Done tasks 1-4", done);

    }
}

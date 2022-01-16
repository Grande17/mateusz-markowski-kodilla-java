package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = BoardConfig.class)
public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        String toDo = "Task in prepare";
        String inProgress = "Task in progress";
        String done = "Task is done";
        board.getDoneList().addTask(done);
        board.getInProgress().addTask(inProgress);
        board.getToDo().addTask(toDo);
        //Then
        assertEquals(toDo, board.getToDo().getTasks().get(0));
        assertEquals(inProgress, board.getInProgress().getTasks().get(0));
        assertEquals(done, board.getDoneList().getTasks().get(0));
    }
}

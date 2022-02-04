package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String TASK_NAME = "To do";


    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(TASK_NAME,"Tomorrow");
        //When
        taskListDao.save(taskList);
        //Then
        Optional<TaskList> x = taskListDao.findByListName(TASK_NAME);
        assertTrue(x.isPresent());
        //CleanUp
        taskListDao.deleteByListName(TASK_NAME);
    }
}


package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {

        //Given
        TaskList taskList = new TaskList("To do", "Do the londry");
        String name = taskList.getListName();
        taskListDao.save(taskList);
        //When
        List<TaskList> list = taskListDao.findByListName("To do");
        //Then
        Assert.assertEquals(1,taskListDao.findByListName("To do").size());

        taskListDao.deleteAllByListName("To do");
    }
}

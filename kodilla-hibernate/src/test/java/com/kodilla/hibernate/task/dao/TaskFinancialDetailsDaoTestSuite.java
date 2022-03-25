package com.kodilla.hibernate.task.dao;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {

}

 /*   @Autowired
    private TaskFinancialDetailsDao taskFinancialDetailsDao;

    @Test
    void testFindByPaid(){
        //Given
        TaskFinancialDetails taskFinancialDetails =
                new TaskFinancialDetails(new BigDecimal(115), false);
        taskFinancialDetailsDao.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();
        //When
        List<TaskFinancialDetails> resultList = taskFinancialDetailsDao.findByPaid(false);
        //Then
        assertEquals(4, resultList.size());
        //CleanUp
        taskFinancialDetailsDao.deleteAll();

    }
}

  */

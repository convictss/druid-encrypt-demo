package com.convict;

import com.convict.dao.DataDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationTest {

    @Autowired
    private DataDao dataDao;

    @Test
    public void testQuery() {
        System.out.println(dataDao.selectNames());
    }
}

package org.phparch.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.phparch.service.PeopleService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * @author yarw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class DemoXMLTest {

    @Resource(name = "peopleService")
    private PeopleService peopleService;

    /**
     * 面向切面编程
     */
    @Test
    public void test1() {
        System.out.println(peopleService);
        peopleService.save();
    }
}

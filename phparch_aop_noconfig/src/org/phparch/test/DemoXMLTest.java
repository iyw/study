package org.phparch.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.phparch.config.Config;
import org.phparch.service.CustomerService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * @author yarw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class DemoXMLTest {

    @Resource(name = "peopleService")

    /**
     * 注意 申明类型的时候 是接口类型 不是类
     */
    private CustomerService peopleService;

    /**
     * 面向切面编程
     */
    @Test
    public void test1() {
        System.out.println(peopleService);
        peopleService.save();
    }
}

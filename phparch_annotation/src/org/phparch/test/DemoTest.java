package org.phparch.test;

import org.junit.Test;
import org.phparch.dao.CustomerDao;
import org.phparch.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yarw
 */
public class DemoTest {
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) ac.getBean("customerDao");
        System.out.println(customerDao);
        customerDao.save();
    }

    @Test
    /**
     * 注入普通字符串
     */
    public void test2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService) ac.getBean("customerService");
        System.out.println(customerService);
    }

    @Test
    /**
     * 从properties中获取字符串
     */
    public void test3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService) ac.getBean("customerService");
        System.out.println(customerService);
    }
}

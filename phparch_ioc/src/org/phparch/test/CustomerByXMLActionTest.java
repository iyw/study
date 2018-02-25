package org.phparch.test;

import org.junit.Test;
import org.phparch.dao.CustomerDao;
import org.phparch.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author yarw
 */
public class CustomerByXMLActionTest {
    /**
     * spring的IOC 入门程序 类路径方式导入
     */
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) ac.getBean("customerDao");
        customerDao.save();
    }

    /**
     * 文件系统方式
     */
    @Test
    public void test2() {
        ApplicationContext ac = new FileSystemXmlApplicationContext("./src/applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) ac.getBean("customerDao");
        customerDao.save();
    }

    /**
     * 单例多例模式
     */
    @Test
    public void test3() {
        ApplicationContext ac = new FileSystemXmlApplicationContext("./src/applicationContext.xml");
        for (int i = 0; i < 5; i++) {
            CustomerDao customerDao = (CustomerDao) ac.getBean("customerDao");
            System.out.println(customerDao);
        }
    }

    /**
     * 初始化方法和析构方法测试
     */
    @Test
    public void test4() {
        ApplicationContext ac = new FileSystemXmlApplicationContext("./src/applicationContext.xml");
        ((AbstractApplicationContext) ac).registerShutdownHook();
        CustomerDao customerDao = (CustomerDao) ac.getBean("customerDao");
        customerDao.save();
    }

    /**
     * 构造方法注入
     */
    @Test
    public void test5() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService) ac.getBean("customerService");
        System.out.println(customerService);
        customerService.save();
    }

}

package org.phparch.test;

import org.junit.Test;
import org.phparch.config.Config;
import org.phparch.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yarw
 */
public class DemoNoXmlTest {
    @Test
    public void test1() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        CustomerService customerService = (CustomerService) ac.getBean("customerService");
        System.out.println(customerService);
    }
}

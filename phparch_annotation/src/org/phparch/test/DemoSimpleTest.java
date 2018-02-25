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
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class DemoSimpleTest {
    @Resource(name = "customerService")
    private CustomerService customerService;

    /**
     * 简化的测试类
     */
    @Test
    public void test1() {
        System.out.println(customerService);
    }

}

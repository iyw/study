package org.phparch.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.phparch.config.Config;
import org.phparch.proxy.CglibProxy;
import org.phparch.proxy.JDKProxy;
import org.phparch.service.CustomerService;
import org.phparch.service.CustomerServiceImpl2;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author yarw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class DemoTest {
    @Resource(name = "customerServiceImpl")
    private CustomerService customerService;

    @Resource
    private CustomerServiceImpl2 customerServiceImpl2;

    /**
     * 基于接口动态代理
     */
    @Test
    public void test1() {
        CustomerService customerProxy = (CustomerService) JDKProxy.getProxy(customerService);
        customerProxy.save();
    }

    /**
     * 基于子类动态代理
     */
    @Test
    public void test2() {
        CustomerServiceImpl2 customerServiceProxy = (CustomerServiceImpl2) CglibProxy.getProxy(customerServiceImpl2);
        customerServiceProxy.save();
    }
}

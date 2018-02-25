package org.phparch.action;

import org.phparch.dao.CustomerDaoImpl;
import org.phparch.ioc.BeanFactory;

public class CustomerAction {
    public static void main(String[] args) {
       CustomerDaoImpl customerDao = (CustomerDaoImpl) BeanFactory.getBean("customerDao");
        customerDao.save();
    }
}

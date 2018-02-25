package org.phparch.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author yarw
 */
@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {
    @PostConstruct
    public void init() {
        System.out.println("初始化方法");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("析构方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomerDaoImpl{" +
                "name='" + name + '\'' +
                '}';
    }

    public String name;

    @Override
    public void save() {
        System.out.println("导入到数据库");
    }
}

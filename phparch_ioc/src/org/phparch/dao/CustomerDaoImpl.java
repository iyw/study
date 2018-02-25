package org.phparch.dao;

/**
 * @author yarw
 */
public class CustomerDaoImpl implements CustomerDao {
    public void init() {
        System.out.println("初始化方法");
    }

    public void destory() {
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

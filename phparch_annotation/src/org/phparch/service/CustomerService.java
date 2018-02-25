package org.phparch.service;

import org.phparch.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author yarw
 */
@Service(value = "customerService")
public class CustomerService {
    @Resource(name = "customerDao")
    private CustomerDao customerDao;
    @Value("${customerDao}")
    private String name;

    public void setCustomerDaoList(List<CustomerDao> customerDaoList) {
        this.customerDaoList = customerDaoList;
    }

    private List<CustomerDao> customerDaoList;

    private CustomerDao customerArray[];

    private Set<CustomerDao> customerDaoSet;
    private Map<String, CustomerDao> customerDaoMap;
    private Properties properties;

    public void setCustomerDaoSet(Set<CustomerDao> customerDaoSet) {
        this.customerDaoSet = customerDaoSet;
    }

    public void setCustomerDaoMap(Map<String, CustomerDao> customerDaoMap) {
        this.customerDaoMap = customerDaoMap;
    }

    @Override
    public String toString() {
        return "CustomerService{" +
                "customerDao=" + customerDao +
                ", name='" + name + '\'' +
                ", customerDaoList=" + customerDaoList +
                ", customerArray=" + Arrays.toString(customerArray) +
                ", customerDaoSet=" + customerDaoSet +
                ", customerDaoMap=" + customerDaoMap +
                ", properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setCustomerArray(CustomerDao[] customerArray) {
        this.customerArray = customerArray;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public CustomerService() {
        super();
    }

    /**
     * @param customerDao
     */
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void save() {
        customerDao.save();
    }
}

package org.phparch.service;

import org.springframework.stereotype.Component;

@Component(value = "customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void save() {
        System.out.println("保存");
    }

    @Override
    public void update() {
        System.out.println("更新");
    }
}

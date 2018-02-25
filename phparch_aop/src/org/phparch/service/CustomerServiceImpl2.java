package org.phparch.service;

import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl2 {
    public void save() {
        System.out.println("保存");
    }


    public void update() {
        System.out.println("更新");
    }
}

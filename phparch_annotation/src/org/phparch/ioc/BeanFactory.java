package org.phparch.ioc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class BeanFactory {
    /**
     * 初始化配置文件
     */
    private static Properties prop = new Properties();


    static {
        try {
            InputStream in = BeanFactory.class.getResourceAsStream("/bean.properties");
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object getBean(String name) {
        String className = prop.getProperty(name);
        try {
            //类加载模式
            return Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;

    }
}

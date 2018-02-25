package org.phparch.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;


public class CglibProxy {
    public static Object getProxy(Object obj) {
        return Enhancer.create(obj.getClass(), (MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("记录日子-子类代理");
            System.out.println(methodProxy);
            return method.invoke(obj, objects);
        });
    }
}

package org.phparch.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author yarw
 */
@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
    @Before(value = "execution(public * org.phparch.service.PeopleService.*())")
    public void log() {
        System.out.println("记录日志");
    }

    @After(value = "execution(public * org.phparch.service.PeopleService.*())")
    public void after() {
        System.out.println("最终执行记录日志");
    }

    @Around(value = "execution(public * org.phparch.service.PeopleService.*())")
    public void around(ProceedingJoinPoint pt) {
        System.out.println("环绕前");
        try {
            pt.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕后");
    }
}

package org.phparch.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class Aspect {
    public void log() {
        System.out.println("记录日志");
    }

    public void after() {
        System.out.println("最终执行记录日志");
    }
    public void around(ProceedingJoinPoint pt)
    {
        System.out.println("环绕前");
        try {
            pt.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕后");
    }
}

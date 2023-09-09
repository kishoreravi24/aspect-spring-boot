package com.aop.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {
    //This will run just before execution of any method
    @Before(value="execution(* com.aop.demo..*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("Before execution");
    }

    //This will run after execution of any method
    @After(value="execution(* com.aop.demo..*(..))")
    public void afterAdvice(JoinPoint joinPoint){
        System.out.println("After execution");
    }

    //This will runs after function returns soon
    @AfterReturning(value="execution(* com.aop.demo..*(..))")
    public void afterReturning(JoinPoint joinPoint){
        System.out.println("after returning execution");
    }

    //It runs before and after execution
    @Around(value="execution(* com.aop.demo..*(..))")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Around execution");
        try{
            proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}

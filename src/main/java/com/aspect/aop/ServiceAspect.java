package com.aspect.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.aspect.service.MessageService.*(..))")
    public void beforeSendMessage(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("beforeSendMessage " + args[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.aspect.service.MessageService.sendMessage(..))")
    public void afterSendMessage(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("afterSendMessage " + args[0]);
        System.out.println(joinPoint.getSignature());
    }

    @AfterReturning("execution(* com.aspect.service.MessageService.*(..))")
    public void afterReturningSendMessage(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("returningSendMessage " + args[0]);
        System.out.println(joinPoint.getSignature());
    }

    @AfterThrowing("execution(* com.aspect.service.MessageService.*(..))")
    public void afterThrowingSendMessage(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("throwingSendMessage " + args[0]);
        System.out.println(joinPoint.getSignature());
    }
}

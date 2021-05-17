package com.spring_study.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("com.spring_study.aop.aspects.MyPointcuts.allMethodsFromUniLibraryExceptReturnMagazine()")
    public void beforeAllMethodsFromUniLibraryExceptReturnMagazine() {
        System.out.println("beforeAllMethodsFromUniLibraryExceptReturnMagazine: writing Log #10");
    }

    @Before("com.spring_study.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice: writing Log #1");
    }

    @Before("com.spring_study.aop.aspects.MyPointcuts.allReturnMethods()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("com.spring_study.aop.aspects.MyPointcuts.allGetAndReturnMethods()")
    public void beforeGetAndReturnAdvice() {
        System.out.println("beforeGetAndReturnAdvice: writing Log #3");
    }

    @Before("com.spring_study.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice() {
        System.out.println("beforeAddLoggingAdvice: trying to add a book/magazine...");
    }
}

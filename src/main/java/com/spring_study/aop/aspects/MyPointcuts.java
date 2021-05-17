package com.spring_study.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* get*())")
    public void allGetMethods() {}

    @Pointcut("execution(* return*())")
    public void allReturnMethods() {}

    @Pointcut("execution(* add*())")
    public void allAddMethods() {}

    @Pointcut("allGetMethods() || allReturnMethods()")
    public void allGetAndReturnMethods() {}

    @Pointcut("execution(* com.spring_study.aop.UniLibrary.*(..))")
    public void allUniLibraryMethods() {}

    @Pointcut("execution(void com.spring_study.aop.UniLibrary.returnMagazine())")
    public void returnMagazineFromUniLibrary() {}

    @Pointcut("allUniLibraryMethods() && !returnMagazineFromUniLibrary()")
    public void allMethodsFromUniLibraryExceptReturnMagazine() {}
}

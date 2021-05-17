package com.spring_study.aop.aspects;

import com.spring_study.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Before("com.spring_study.aop.aspects.MyPointcuts.allMethodsFromUniLibraryExceptReturnMagazine()")
//    public void beforeAllMethodsFromUniLibraryExceptReturnMagazine() {
//        System.out.println("beforeAllMethodsFromUniLibraryExceptReturnMagazine: writing Log #10");
//    }
//
//    @Before("com.spring_study.aop.aspects.MyPointcuts.allGetFromSchoolAndUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice: writing Log #1");
//    }
//
//    @Before("com.spring_study.aop.aspects.MyPointcuts.allReturnMethods()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("com.spring_study.aop.aspects.MyPointcuts.allGetFromSchoolAndUniLibrary()")
//    public void beforeGetAndReturnAdvice() {
//        System.out.println("beforeGetAndReturnAdvice: writing Log #3");
//    }
//
//    @Before("com.spring_study.aop.aspects.MyPointcuts.allAddMethods()")
//    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
//
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        System.out.println("methodSignature = " + methodSignature);
//        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
//        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
//        System.out.println("methodSignature.getName() = " + methodSignature.getName());
//
//        if(methodSignature.getName().equals("addBook")) {
//            Object[] arguments = joinPoint.getArgs();
//            for(Object obj: arguments) {
//                if(obj instanceof Book) {
//                    Book myBook = (Book) obj;
//                    System.out.println("Book information: " +
//                            "\n-" + myBook.getName() +
//                            "\n-" + myBook.getAuthor() +
//                            "\n-" + myBook.getPublicationYear());
//                } else if(obj instanceof String) {
//                    System.out.println("Person who add a book: " + obj);
//                }
//            }
//        }
//
//        System.out.println("beforeAddLoggingAdvice: trying to add a book/magazine...");
//    }
}

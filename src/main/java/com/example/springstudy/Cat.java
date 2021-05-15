package com.example.springstudy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Cat init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Cat destroy");
    }
}

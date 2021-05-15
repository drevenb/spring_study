package com.example.springstudy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("singleton")
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Voow-voow");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Dog init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog destroy");
    }
}

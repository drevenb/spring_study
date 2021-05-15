package com.example.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callPet();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        context.close();
    }
}

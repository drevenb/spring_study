package com.example.springstudy.introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Pet pet = context.getBean("catBean", Cat.class);
        pet.say();
        Person person = context.getBean("personBean", Person.class);
        person.callPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}

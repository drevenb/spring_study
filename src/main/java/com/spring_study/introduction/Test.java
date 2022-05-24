package com.spring_study.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        context.getBean(TerminatorQuoter.class).sayQuote();

        CollectionClass classObj = context.getBean(CollectionClass.class);

        for(Object obj: classObj.list) {
            System.out.println(obj);
        }

        classObj.map.forEach((k, v) -> System.out.println("Key: " + k + "\nValue: " + v));

//        Person person = context.getBean("myPerson", Person.class);
//        person.callPet();
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
        context.close();
    }
}

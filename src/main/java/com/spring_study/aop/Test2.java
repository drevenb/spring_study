package com.spring_study.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudents();

        try {
            List<Student> students = university.getAllStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println("Exception has been caught: " + e);
        }

        context.close();
    }
}

package com.spring_study.aop.aspects;

import com.spring_study.aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: logging students list before getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningFetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);

        String name = firstStudent.getName();
        name = "Mr." + name;
        firstStudent.setName(name);

        double avgGrade = firstStudent.getAvgGrade();
        firstStudent.setAvgGrade(avgGrade + 1);

        System.out.println("afterReturningFetStudentsLoggingAdvice: logging students list after getStudents");
    }
}

package com.spring_study.aop;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        students.add(new Student("Ivan Ivanov", 4, 6.7));
        students.add(new Student("Kate Voronova", 2, 8.8));
        students.add(new Student("Sasha Pupkin", 5, 5.2));
    }

    public List<Student> getAllStudents() {
        System.out.println("Start of the getStudents()");
        System.out.println(students.get(3));
        System.out.println("Information about students: ");
        System.out.println(students);
        return students;
    }
}

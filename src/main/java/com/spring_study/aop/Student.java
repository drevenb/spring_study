package com.spring_study.aop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private int course;
    private double avgGrade;
}

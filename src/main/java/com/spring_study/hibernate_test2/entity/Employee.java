package com.spring_study.hibernate_test2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="employee")
@Data
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String surname;

    private String department;

    private int salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="details_id")
    private Detail empDetail;

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }
}

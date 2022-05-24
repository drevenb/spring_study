package com.spring_study.introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Person {

//    @Autowired
//    @Qualifier("dog")
    private Pet pet;

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

    public Person(@Qualifier("dog") Pet pet) {
        this.pet = pet;
    }

    public Person() {

    }

    public void callPet() {
        System.out.println("Hello my pet!");
        pet.say();
    }

    public Pet getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}

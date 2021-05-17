package com.spring_study.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We are getting a book from UniLibrary\n");
    }

    public void returnMagazine() {
        System.out.println("We are returning a magazine to UniLibrary\n");
    }
}

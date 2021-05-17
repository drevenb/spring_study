package com.spring_study.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We are getting the book from SchoolLibrary\n");
    }

    public void getMagazine() {
        System.out.println("We are getting a magazine from SchoolLibrary\n");
    }

    public void returnBook() {
        System.out.println("We are returning a book to SchoolLibrary\n");
    }

    public void returnMagazine() {
        System.out.println("We are returning a magazine to SchoolLibrary\n");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We are adding a book to SchoolLibrary\n");
    }

    public void addMagazine() {
        System.out.println("We are adding a magazine to SchoolLibrary\n");
    }
}

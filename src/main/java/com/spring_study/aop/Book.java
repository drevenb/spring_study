package com.spring_study.aop;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Book {
    @Value("Harry Potter")
    private String name;
}

package com.spring_study.introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.example.spring_study")
@PropertySource("classpath:application.properties")
public class MyConfig {

    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Pet dogBean() {
        return new Dog();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}

package com.example.springstudy;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.example.springstudy")
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

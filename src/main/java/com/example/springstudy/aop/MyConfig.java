package com.example.springstudy.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.springstudy.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}

package com.spring_study.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.spring_study.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}

package com.hexaware.Aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.hexawafre.Aop")
@EnableAspectJAutoProxy
public class AppConfig {

}

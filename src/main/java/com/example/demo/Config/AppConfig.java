package com.example.demo.Config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
@Import({ MessagingConfiguration.class })

public class AppConfig {
}

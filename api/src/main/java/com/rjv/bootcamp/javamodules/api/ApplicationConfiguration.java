package com.rjv.bootcamp.javamodules.api;

import com.rjv.bootcamp.javamodules.service.configuration.ServiceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(value = "com.rjv.bootcamp.javamodules.api.*")
@Import(ServiceConfiguration.class)
public class ApplicationConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfiguration.class, args);
    }

}

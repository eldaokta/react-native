package com.enigma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class Exercise14Application extends SpringBootServletInitializer implements WebApplicationInitializer {

    //
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(Exercise14Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Exercise14Application.class, args);
    }
}

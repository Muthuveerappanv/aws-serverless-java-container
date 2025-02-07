package com.amazonaws.serverless.sample.springboot2;

import com.amazonaws.serverless.sample.springboot2.controller.PetsController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;


@SpringBootApplication
@Import({ PetsController.class })
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
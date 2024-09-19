package com.ensakh.sonarqualitygate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarQualityGateApplication {

    public static void main(String[] args) {
        System.out.println("Application started"); // System.out instead of proper logging
        SpringApplication.run(SonarQualityGateApplication.class, args);
    }

}

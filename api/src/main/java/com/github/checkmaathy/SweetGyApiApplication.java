package com.github.checkmaathy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.github.checkmaathy")
public class SweetGyApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SweetGyApiApplication.class, args);
    }

}

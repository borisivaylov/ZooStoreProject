package com.example.zoostoreproject.rest.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@ComponentScan(basePackages = {"com.example.zoostoreproject"})
@EntityScan(basePackages = {"com.example.zoostoreproject.persistence.entity"})
@EnableJpaRepositories(basePackages = {"com.example.zoostoreproject.persistence.repository"})

@SpringBootApplication
public class ZooStoreProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZooStoreProjectApplication.class, args);
    }

}

package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SampleSpringBootDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleSpringBootDockerApplication.class, args);
    }

}

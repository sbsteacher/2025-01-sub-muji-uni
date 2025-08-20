package com.green.mujiuni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MujiuniApplication {

    public static void main(String[] args) {
        SpringApplication.run(MujiuniApplication.class, args);
    }

}

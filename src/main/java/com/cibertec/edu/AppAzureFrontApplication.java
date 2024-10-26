package com.cibertec.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppAzureFrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppAzureFrontApplication.class, args);
    }

}

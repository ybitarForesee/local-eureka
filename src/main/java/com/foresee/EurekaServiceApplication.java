package com.foresee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Local Eureka Service Registry
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {
    public static void main( String[] args ) {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }
}

package vitalii.serdiuk.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by vserdiuk
 */

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApp {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApp.class, args);
    }
}

package com.geometry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: CloudServerApplication
 * @Author: Zhao Shf
 * @Description:
 * @Date: Create at 16:49 2020/10/21
 * @Iteration:
 **/

@SpringBootApplication
@EnableEurekaServer
public class CloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerApplication.class, args);
    }
}

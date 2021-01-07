package com.geometry;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

/**
 * @ClassName: CloudProviderApplication
 * @Author: Zhao Shf
 * @Description:
 * @Date: Create at 17:00 2020/10/21
 * @Iteration:
 **/
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String port = sc.nextLine();
        new SpringApplicationBuilder(CloudProviderApplication.class)
                .properties("server.port=" + port).run(args);
    }
}

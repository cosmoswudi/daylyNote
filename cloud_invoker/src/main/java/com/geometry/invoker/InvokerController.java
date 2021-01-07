package com.geometry.invoker;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: InvokerController
 * @Author: Zhao Shf
 * @Description:
 * @Date: Create at 13:53 2020/10/22
 * @Iteration:
 **/
@RestController
@Configuration
public class InvokerController {

    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value = "/router", method = RequestMethod.GET,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public String router() {
        /*RestTemplate restTemplate = getRestTemplate();
        String json = restTemplate.getForObject(
                "http://cloud-provider", String.class
        );
        return json;*/
        return "hello";

    }
}

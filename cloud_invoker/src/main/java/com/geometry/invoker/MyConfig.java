package com.geometry.invoker;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: Config
 * @Author: Zhao Shf
 * @Description:
 * @Date: Create at 10:40 2020/10/22
 * @Iteration:
 **/

public class MyConfig {

    @Bean
    public IRule getRule() {
        return new MyRule();
    }

    @Bean
    public IPing getPing() {
        return new MyPing();
    }


}

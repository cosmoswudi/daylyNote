package com.geometry.invoker;

import com.netflix.config.ConfigurationManager;
import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.Server;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: RibbonTest
 * @Author: Zhao Shf
 * @Description:
 * @Date: Create at 17:20 2020/10/21
 * @Iteration:
 **/
public class RibbonTest {


    public static void main(String[] args) throws Exception {
        //ConfigurationManager.getConfigInstance()

        BaseLoadBalancer lb = new BaseLoadBalancer();
        MyRule myRule = new MyRule();
        myRule.setLb(lb);
        lb.setRule(myRule);
        List<Server> list = new ArrayList<Server>();
        list.add(new Server("localhost", 8080));
        list.add(new Server("localhost", 8090));
        lb.addServers(list);
        lb.setPing(new PingUrl());
        lb.setPingInterval(2);
        Thread.sleep(6000);


        for (Server server : lb.getAllServers()) {
            System.out.println(server.getHostPort() + "  状态 ： " + server.isAlive());
        }
    }
}

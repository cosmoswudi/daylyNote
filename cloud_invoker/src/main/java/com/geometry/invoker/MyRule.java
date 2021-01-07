package com.geometry.invoker;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @ClassName: MyRule
 * @Author: Zhao Shf
 * @Description:
 * @Date: Create at 17:37 2020/10/21
 * @Iteration:
 **/
public class MyRule implements IRule {

    private ILoadBalancer lb;

    public ILoadBalancer getLb() {
        return lb;
    }

    public void setLb(ILoadBalancer lb) {
        this.lb = lb;
    }



    public Server choose(Object o) {
        List<Server> allServers = lb.getAllServers();
        for (Server allServer : allServers) {
            System.out.println("                 " + allServer.getHost());
        }
        return allServers.get(0);
    }

    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {

    }

    public ILoadBalancer getLoadBalancer() {
        return null;
    }
}

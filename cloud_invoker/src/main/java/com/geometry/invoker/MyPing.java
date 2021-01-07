package com.geometry.invoker;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;

/**
 * @ClassName: MyPing
 * @Author: Zhao Shf
 * @Description:
 * @Date: Create at 10:39 2020/10/22
 * @Iteration:
 **/
public class MyPing implements IPing {


    public boolean isAlive(Server server) {
        System.out.println("自定义ping,服务器信息：" + server.getHostPort());
        return true;
    }
}

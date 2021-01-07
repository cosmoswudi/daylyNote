package com.geometry.invoker;

import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName: CloudProviderConfig
 * @Author: Zhao Shf
 * @Description:
 * @Date: Create at 13:51 2020/10/22
 * @Iteration:
 **/

@RibbonClient(name = "cloud-provider", configuration = MyConfig.class)
public class CloudProviderConfig {
}

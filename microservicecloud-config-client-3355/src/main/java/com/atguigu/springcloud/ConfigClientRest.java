package com.atguigu.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author OliverYu
 * @Date 2019/2/21 17:45
 * @Email 253757635@qq.com
 * @Description TODO
 */
@RestController
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig() {
        String str = "applicationName: "+applicationName+"\t eurekaServers"+eurekaServers+"\t port"+port;
        System.out.println("******str:"+ str);
        return "applicationName: "+applicationName+"\t eurekaServers"+eurekaServers+"\t port"+port;
    }
}

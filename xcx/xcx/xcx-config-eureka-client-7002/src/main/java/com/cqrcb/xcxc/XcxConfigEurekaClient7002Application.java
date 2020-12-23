package com.cqrcb.xcxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer服务器端启动类,接受其它微服务注册进来
 */
@SpringBootApplication
@EnableEurekaServer
public class XcxConfigEurekaClient7002Application {

    public static void main(String[] args) {
        SpringApplication.run(XcxConfigEurekaClient7002Application.class, args);
    }

}

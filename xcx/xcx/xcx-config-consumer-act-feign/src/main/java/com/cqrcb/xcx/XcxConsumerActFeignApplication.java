package com.cqrcb.xcx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.cqrcb.xcx"})
@ComponentScan("com.cqrcb.xcx")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class XcxConsumerActFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(XcxConsumerActFeignApplication.class, args);
    }

}

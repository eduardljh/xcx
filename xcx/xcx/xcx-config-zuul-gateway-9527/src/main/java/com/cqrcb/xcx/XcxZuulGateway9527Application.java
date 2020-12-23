package com.cqrcb.xcx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class XcxZuulGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(XcxZuulGateway9527Application.class, args);
    }

}

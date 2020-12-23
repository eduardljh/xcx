package com.cqrcb.xcx.controller;

import com.cqrcb.xcx.dao.entity.Activity;
import com.cqrcb.xcx.service.ActivityService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @Autowired
    private DiscoveryClient client;

    @HystrixCommand(fallbackMethod = "processHystrix_getActInfo")
    @RequestMapping(value = "/act/getActInfo", method = RequestMethod.GET)
    public List<Activity> list() {
        return activityService.getActInfo(null);
    }

    public List<Activity> processHystrix_getActInfo() {
        List<Activity> activityList = new ArrayList<>();
        activityList.add(new Activity().setActId(null).setActName("该ID：" + null + "没有没有对应的信息,null--@HystrixCommand")
                .setSourceDb("no this database in MySQL"));
        return activityList;
    }

    @RequestMapping(value = "/act/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("XCX-ACT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }
}

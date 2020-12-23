package com.cqrcb.xcx.Controller;

import com.cqrcb.xcx.dao.entity.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ActivityController {
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/consumer/act/getActInfo")
    public List<Activity> getActInfo() {
        return restTemplate.getForObject("http://XCX-ACT" + "/act/getActInfo", List.class);
    }
}

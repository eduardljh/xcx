package com.cqrcb.xcx.service;

import com.cqrcb.xcx.dao.entity.Activity;
import org.springframework.cloud.netflix.feign.FeignClient;

import java.util.List;
import java.util.Map;

@FeignClient(value = "XCX-ACT",fallbackFactory=ActClientServiceFallbackFactory.class)
public interface ActivityService {
    /**
     * 获取活动信息
     * @param param
     * @return
     */
    List<Activity> getActInfo(Map<String, Object> param);
}

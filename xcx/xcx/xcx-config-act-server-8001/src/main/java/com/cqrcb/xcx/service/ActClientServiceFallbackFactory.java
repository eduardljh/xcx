package com.cqrcb.xcx.service;

import com.cqrcb.xcx.dao.entity.Activity;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component // 不要忘记添加，不要忘记添加
public class ActClientServiceFallbackFactory implements FallbackFactory<ActivityService> {
	@Override
	public ActivityService create(Throwable throwable) {
		return new ActivityService() {
			@Override
			public List<Activity> getActInfo(Map<String, Object> param) {
				List<Activity> activityList = new ArrayList<>();
				activityList.add(new Activity().setActId(null).setActName("该ID：" + "9999999999" + "没有没有对应的信息,null--@HystrixCommand")
						.setSourceDb("no this database in MySQL"));
				return activityList;
			}
		};
	}
}

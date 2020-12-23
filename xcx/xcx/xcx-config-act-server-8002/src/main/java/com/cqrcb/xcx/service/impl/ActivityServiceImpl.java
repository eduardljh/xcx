package com.cqrcb.xcx.service.impl;

import com.cqrcb.xcx.dao.mapper.ActivityDao;
import com.cqrcb.xcx.dao.entity.Activity;
import com.cqrcb.xcx.dao.entity.ActivityExample;
import com.cqrcb.xcx.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    ActivityDao activityDao;

    @Override
    public List<Activity> getActInfo(Map<String, Object> param) {
        ActivityExample example = new ActivityExample();
        ActivityExample.Criteria criteria = example.createCriteria();
        criteria.andActIdIsNotNull();
        List<Activity> activityList = activityDao.selectByExample(example);
        return activityList;
    }
}

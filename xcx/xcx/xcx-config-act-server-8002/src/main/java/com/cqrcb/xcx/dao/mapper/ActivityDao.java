package com.cqrcb.xcx.dao.mapper;

import com.cqrcb.xcx.dao.entity.Activity;
import com.cqrcb.xcx.dao.entity.ActivityExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActivityDao {
    int deleteByPrimaryKey(String actId);

    int insert(Activity record);

    int insertSelective(Activity record);

    List<Activity> selectByExample(ActivityExample example);

    Activity selectByPrimaryKey(String actId);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
}
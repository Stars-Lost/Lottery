package com.yang.lottery.infrastructure.dao;

import com.yang.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author LXY
 * @version 1.0
 * @description: 操作数据库Activity表的Dao
 * @date 2024/2/4 15:49
 */
@Mapper
public interface IActivityDao {

    void insert(Activity req);

    Activity queryActivityById(Long activityId);
}

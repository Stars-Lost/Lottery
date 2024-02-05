package com.yang.lottery.interfaces;

import com.yang.lottery.common.Constants;
import com.yang.lottery.common.Result;
import com.yang.lottery.infrastructure.dao.IActivityDao;
import com.yang.lottery.infrastructure.po.Activity;
import com.yang.lottery.rpc.IActivityBooth;
import com.yang.lottery.rpc.dto.ActivityDto;
import com.yang.lottery.rpc.req.ActivityReq;
import com.yang.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author LXY
 * @version 1.0
 * @description: TODO
 * @date 2024/2/4 16:06
 */
@DubboService(version = "1.0.0")
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {
        System.out.println("开始执行RPC调用~！！！！！");

        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }

}

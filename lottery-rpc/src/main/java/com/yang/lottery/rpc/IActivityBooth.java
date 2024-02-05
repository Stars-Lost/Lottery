package com.yang.lottery.rpc;

import com.yang.lottery.rpc.req.ActivityReq;
import com.yang.lottery.rpc.res.ActivityRes;

/**
 * @author LXY
 * @version 1.0
 * @description: 活动展台:
 *                   1. 创建活动
 *                   2. 更新活动
 *                   3. 查询活动
 * @date 2024/2/4 16:00
 */
public interface IActivityBooth {

    /**
     * 通过活动id查询对应的活动
     * @param req
     * @return
     */
    ActivityRes queryActivityById(ActivityReq req);
}

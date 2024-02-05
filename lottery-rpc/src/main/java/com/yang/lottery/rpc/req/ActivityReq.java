package com.yang.lottery.rpc.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author LXY
 * @version 1.0
 * @description: TODO
 * @date 2024/2/4 16:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class  ActivityReq implements Serializable {

    private Long activityId;

}

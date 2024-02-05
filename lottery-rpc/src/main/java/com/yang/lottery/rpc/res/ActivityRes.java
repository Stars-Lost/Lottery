package com.yang.lottery.rpc.res;

import com.yang.lottery.common.Result;
import com.yang.lottery.rpc.dto.ActivityDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author LXY
 * @version 1.0
 * @description: TODO
 * @date 2024/2/4 16:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityRes implements Serializable {

    private Result result;
    private ActivityDto activity;
}

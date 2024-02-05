package com.yang;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LXY
 * @version 1.0
 * @description: TODO
 * @date 2024/2/4 16:08
 */
@SpringBootApplication
@Configurable
@EnableDubbo
public class LotteryInterfacesApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryInterfacesApplication.class, args);
    }

}

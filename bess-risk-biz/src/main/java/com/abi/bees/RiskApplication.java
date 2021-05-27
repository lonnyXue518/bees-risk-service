package com.abi.bees;

import com.abi.bees.common.config.EnableBeesCommon;
import com.common.bees.aspectconfig.EnableCommonLogPrint;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan({"com.abi.bees.risk.dao"})
@EnableBeesCommon
@EnableCommonLogPrint
public class RiskApplication {
    public static void main(String[] args) {
        SpringApplication.run(RiskApplication.class, args);
    }

}

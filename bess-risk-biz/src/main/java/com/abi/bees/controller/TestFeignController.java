package com.abi.bees.controller;

import com.abi.bees.outfeign.dto.TestDto;
import com.abi.bees.common.res.ApiResult;
import com.abi.bees.outfeign.RiskFeignService;
import com.abi.bees.risk.dao.RiskChannelDao;
import com.abi.bees.risk.entity.RiskChannel;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestFeignController implements RiskFeignService {

    @Autowired
    RiskChannelDao riskChannelDao;

    @Override
    public ApiResult normalPay(TestDto testDto) {
        RiskChannel riskChannel = riskChannelDao.selectById("1");
        log.info(riskChannel.getChannelNo());
        return ApiResult.ok("success");
    }
}

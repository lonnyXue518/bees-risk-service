package com.abi.bees.outfeign;

import com.abi.bees.common.res.ApiResult;
import com.abi.bees.outfeign.dto.TestDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/risk/")
public interface RiskFeignService {

    @PostMapping("test")
    ApiResult  normalPay(@RequestBody @Validated TestDto testDto);

}

package com.abi.bees.outfeign.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class TestDto implements Serializable {
    @NotNull(message = "订单号不能为空！")
    private Long orderNo;
}

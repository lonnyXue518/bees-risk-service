package com.abi.bees.risk.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * t_risk_channel
 * @author lonny.xue
 */
@Data
@EqualsAndHashCode
@TableName(value ="t_risk_channel")
@ToString
public class RiskChannel implements Serializable {

    @TableId
    private String oid;

    /**
     * 渠道号
     */
    private String channelNo;

    /**
     * 渠道名称
     */
    private String channelName;

    /**
     * 手续费 ，比如每笔1元，比如0.003（千分之3）
     */
    private BigDecimal rate;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 状态， 1 启用，0 禁用
     */
    private String status;

    /**
     * 账号
     */
    private String account;

    /**
     * 商户号
     */
    private String merchantId;

    /**
     * 商户规则
     */
    private String merchantRule;

    /**
     * 商户内容
     */
    private String merchantContent;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
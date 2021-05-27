package com.abi.bees.risk.dao;

import com.abi.bees.risk.entity.RiskChannel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface RiskChannelDao extends BaseMapper<RiskChannel> {

    @Select("select * from t_risk_channel where oid=#{oid}")
    RiskChannel selectByOid(String oid);
}
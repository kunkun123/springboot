package com.kun.money.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kun.base.BaseMapper;
import com.kun.money.repository.Money;

@Repository
public interface MoneyMapper extends BaseMapper<Money>{
	public void updateIncrease(@Param("id")String id,@Param("num")double money);
	public void updateDecrease(@Param("id")String id,@Param("num")double money);
}

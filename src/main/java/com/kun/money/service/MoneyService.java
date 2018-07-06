package com.kun.money.service;

import com.kun.base.BaseService;
import com.kun.money.repository.Money;


public interface MoneyService extends BaseService<Money>{
	public void increaseMoney(String to,double money);
	public void decreaseMoney(String from,double money);
}

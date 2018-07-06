package com.kun.money.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kun.money.dao.MoneyMapper;
import com.kun.money.repository.Money;
import com.kun.money.service.MoneyService;
@Service
public class MoneyServiceImpl implements MoneyService{
	@Autowired
	public MoneyMapper moneyDao;
	@Override
	public void increaseMoney(String to, double num) {
		moneyDao.updateIncrease(to,num);
	}

	@Override
	public void decreaseMoney(String from, double num) {
		moneyDao.updateDecrease(from, num);
	}

	@Override
	public Money select(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		moneyDao.delete(id);
	}

	@Override
	public void update(Money t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Money t) {
		// TODO Auto-generated method stub
		
	}

}

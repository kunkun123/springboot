package com.kun.money.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kun.money.service.MoneyService;

/**
 * @RestController 标注该类的所有请求方法为 返回json格式 不做视图解析。
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/money")
public class MoneyController {
	
	@Autowired
	public MoneyService moneyService;
	
	@RequestMapping("/index")
	public String index() {
		return "/form/money/transfer";
	}
	
	@RequestMapping("/deleteById")
	public String deleteById(String id){
		moneyService.delete(id);
		return "success";
	}
	
	@RequestMapping("/transfer")
	@Transactional
	public String transfer(String from,String to,double num) {
		moneyService.decreaseMoney(from, num);
		int i = 1/0;
		moneyService.increaseMoney(to, num);
		return "success";
	}

	/**
	 * SpringBoot返回list格式。
	 * 
	 * @return
	 */
	@RequestMapping("/listIndex")
	public List<String> listIndex() {
		List<String> list = new ArrayList<String>();
		list.add("index1");
		list.add("index2");
		list.add("index3");
		return list;
	}

	/**
	 * 异常捕获
	 * @param request
	 * @return
	 */
	@RequestMapping("/demoError")
	public Integer demoError(HttpServletRequest request) {
		String id = request.getParameter("id");
		Integer idl = Integer.parseInt(id);
		return idl;
	}

}

package com.kun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.kun.sercurity.repository.SysUser;
import com.kun.sercurity.service.UserService;

/**
 * SpringBoot
 * 
 * @author Administrator
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.kun"})
@SpringBootApplication
public class App {
	public static ApplicationContext ctx=null; 
	
    public static Object getObject(String string){
    	return ctx.getBean(string);
    }
	public static void main(String[] args) {
		ctx = SpringApplication.run(App.class, args);
		UserService suserService = (UserService) ctx.getBean("userService");
		SysUser su= suserService.findByName("test1");
        BCryptPasswordEncoder bc=new BCryptPasswordEncoder(4);//将密码加密 可以先设置初始密码：000000 
        su.setPassword(bc.encode("123456"));//然后使用密码为key值进行加密，运行主类后，会自动加密密码，可连接数据库查看。
        System.out.println("密码"+su.getPassword());
        suserService.update(su);//运行一次后记得注释这段重复加密会无法匹配
	}

}

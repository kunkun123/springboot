package com.kun.sercurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
    public String viewHome() {
        return "hello SpringSecurity";
    }
}

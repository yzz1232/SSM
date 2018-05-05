package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.service.iCountryService;
import com.github.pagehelper.PageHelper;
import com.ssm.entity.*;

@Controller
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	private iCountryService countryService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello";
	}
	
	
	@RequestMapping("/getCountry")
	@ResponseBody
	public Country getCountry(){
		return countryService.getCountry();
	}
	
	
	@RequestMapping("/getAllCountry")
	@ResponseBody
	public List<Country> getAllCountry(){
		PageHelper.startPage(1,5);
		return countryService.getAllCountry();
	}
	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-c","");
	}
	
}

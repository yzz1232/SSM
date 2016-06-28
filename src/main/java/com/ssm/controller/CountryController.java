package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.service.iCountryService;
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
	
	
	@RequestMapping("/getAllCountry")
	@ResponseBody
	public Country getAllCountry(){
		return countryService.getCountry();
	}
}

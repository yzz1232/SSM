package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.dao.CountryMapper;
import com.ssm.service.CountryService;

@Service
public class CountruServiceImpll implements CountryService{
	
	@Autowired
	CountryMapper countryMapper;
	
	public int insert() {
		
		 countryMapper.add();
		 return 1;
	}

}

package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.Country;
import com.ssm.entity.dao.CountryMapper;
import com.ssm.service.iCountryService;

@Service
public class CountryServiceImpl implements iCountryService{

	@Autowired
	private CountryMapper countryMapper;

	public Country getCountry() {
		return countryMapper.getCountry();
	}

	public List<Country> getAllCountry() {
		return countryMapper.getAllCountry();
	}
	
	
}

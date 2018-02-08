package com.ssm.study.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.study.service.StudyTransactionService;

@Service
public class StudyTransactionServiceImpl implements StudyTransactionService{
	
	@Transactional
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("十九岁那天，青春的一半，注定擦肩。");
	}

}

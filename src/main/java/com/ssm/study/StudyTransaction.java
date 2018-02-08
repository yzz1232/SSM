package com.ssm.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.study.service.StudyTransactionService;

public class StudyTransaction {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring-mybatis-config.xml");
		String[] name = app.getBeanDefinitionNames();
		StudyTransactionService impl = (StudyTransactionService) app.getBean("studyTransactionServiceImpl");
		impl.test();
	}
	
	
}

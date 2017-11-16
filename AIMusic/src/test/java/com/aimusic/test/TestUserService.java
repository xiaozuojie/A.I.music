package com.aimusic.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aimusic.entity.user;
import com.aimusic.service.userService;
import com.aimusic.serviceimpl.userServiceimpl;

public class TestUserService {

	userService us = null;

	@Before
	public void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml","mybatis-config.xml");

		us = context.getBean(userService.class);
	}

	@Test
	public void sellectAllUser() {
		List<user> list = us.sellectAllUser();

		for (user user : list) {
			System.out.println(user);
		}

	}
}

package com.aimusic.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aimusic.entity.user;
import com.aimusic.service.userService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:mybatis-config.xml"})
public class TestUserServicewithSpring {

	@Resource
	private userService us;

	@Test
	public void sellectAllUser() {
		List<user> list = us.sellectAllUser();

		for (user user : list) {
			System.out.println(user);
		}

	}
}

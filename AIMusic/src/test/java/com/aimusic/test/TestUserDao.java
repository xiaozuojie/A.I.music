package com.aimusic.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aimusic.dao.userDao;
import com.aimusic.entity.user;


public class TestUserDao {

	userDao ud = null;

	@Before
	public void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml","mybatis-config.xml");

		ud = context.getBean(userDao.class);
	}

	@Test
	public void getAllBlog() {
		List<user> list = ud.selectAllUser();

		for (user user : list) {
			System.out.println(user);
		}

	}
}

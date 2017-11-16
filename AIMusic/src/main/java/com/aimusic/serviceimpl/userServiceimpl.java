package com.aimusic.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aimusic.dao.userDao;
import com.aimusic.entity.user;
import com.aimusic.service.userService;
@Service
public class userServiceimpl implements userService {
	@Resource
	private userDao ud;
	
	
	public userDao getUd() {
		return ud;
	}

    
	public void setUd(userDao ud) {
		this.ud = ud;
	}

	public List<user> sellectAllUser() {
		// TODO Auto-generated method stub
		return ud.selectAllUser();
	}


	

}

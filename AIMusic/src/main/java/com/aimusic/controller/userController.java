package com.aimusic.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aimusic.entity.user;
import com.aimusic.service.userService;
import com.aimusic.util.MyData;

@Controller
public class userController {
    @Resource
	private userService us;
    
    @RequestMapping(value="/user/aaa",method=RequestMethod.GET)
    @ResponseBody
    public MyData<user> ShowUser() {
		List<user> list =us.sellectAllUser();
		MyData<user> md =new MyData<user>();
		md.setData(list);
		return md;
	}
}

package com.impont.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.impont.pojo.User;
import com.impont.utils.JonsUtils;
import com.impont.utils.RestJsonUtils;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
	public JonsUtils getUser() {
		User u=new User();
		u.setUserName("zhangsan");
		u.setPassword("123456");
		u.setAge(16);
		u.setBirthday(new Date());
		u.setDisc("hello SpringBoot");
		return RestJsonUtils.success(u);
	}
}

package com.impont.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.impont.pojo.Resource;
import com.impont.utils.JonsUtils;
import com.impont.utils.RestJsonUtils;

@RestController
public class HelloController {
	@Autowired
	private Resource resource;
	@RequestMapping("getResource")
	public JonsUtils getResource() {
		Resource ben=new Resource();
		BeanUtils.copyProperties(resource, ben);
		return RestJsonUtils.success(ben);
	}
}

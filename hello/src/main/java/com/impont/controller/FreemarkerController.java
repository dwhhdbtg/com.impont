package com.impont.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.impont.pojo.Resource;

@RestController
@RequestMapping("ftl")
public class FreemarkerController {
	
	@Autowired
	private Resource resource;
	@RequestMapping("index")
	public String index(ModelMap map) {
		map.addAttribute("resource",resource);
		return "freemarker/index";
	}
}

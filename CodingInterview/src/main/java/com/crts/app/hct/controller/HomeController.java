package com.crts.app.hct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crts.app.hct.service.HctService;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String pre()
	{
		return "index";
	}
	
	
}

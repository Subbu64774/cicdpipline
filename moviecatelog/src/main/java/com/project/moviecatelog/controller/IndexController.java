package com.project.moviecatelog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class IndexController {
	
	@RequestMapping("/")
	public String display() {
		return "Welcome to the Project";
	}

}

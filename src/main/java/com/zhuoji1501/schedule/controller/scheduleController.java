package com.zhuoji1501.schedule.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
@RequestMapping("/schedule")
public class scheduleController {

	@RequestMapping("/add")
	public String addUser(){
	
	
		return "html/time";
	}
}

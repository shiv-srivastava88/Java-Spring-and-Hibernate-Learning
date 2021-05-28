package com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mom")
public class MomController {
	
	@ResponseBody
	@RequestMapping("/food")
	public String Food() {
		return "Take the food...";
	}
	
	@ResponseBody
	@RequestMapping("/tution")
	public String Tution() {
		return "Come for study kid...";
	}
}

package com.myshop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/check/*")
public class CheckController {
	
	@GetMapping("check1")
		public String check1(HttpServletRequest req, Model model) {
		return "check/check1";
	}
	
	@PostMapping("check2")
	public String check2(HttpServletRequest req, Model model) {
		
		return "check/check2";
}
	
	
	
	
	
}
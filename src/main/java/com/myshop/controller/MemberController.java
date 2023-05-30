package com.myshop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myshop.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	HttpSession session;
	
	@GetMapping("agree.do")
	public String getAgree(Model model) throw Exeption {
		return "member/agree";
	}
	
	@GetMapping("join.do")
	public String joinForm(Model model) throw Exeption {
		return "member/agree";
	}
	
	
	
}
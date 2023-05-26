package com.myshop.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myshop.dto.NoticeDTO;
import com.myshop.service.NoticeService;

@Controller
@RequestMapping("/notice/*")

public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("list.do")	//	<a href="/notice/list.do"></a>
	public String getNoticeList(Model model) throws Exception {
		List<NoticeDTO> noticeList = noticeService.noticeList();
		model.addAttribute("noticeList" , noticeList);
		return "notice/noticeList" ;
	}
	
	@GetMapping("detail.do")
	public String getNoticeDetail(HttpServletRequest request, Model model) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		noticeService.readcnt(no);
		NoticeDTO notice = noticeService.noticeDetail(no);
		model.addAttribute("notice" , notice);
		return "notice/noticeDetail";
	}	
	
	@GetMapping("insert.do")
	public String insertNotice() {
		return "notice/noticeList";
	}
	@PostMapping("insert.do")
	
			
		
}

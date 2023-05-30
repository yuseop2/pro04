package com.myshop.service;

import java.util.List;

import com.myshop.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> memberList() throws Exception;
	public int memeberCount() throws Exception;
	public MemberDTO getMember() throws Exception;
	public MemberDTO signIn() throws Exception;
	public MemberDTO loginCheck() throws Exception;
	public MemberDTO login() throws Exception;
	public void memberInsert() throws Exception;
	public void memberUpdate() throws Exception;
	public void memberDelete() throws Exception;
	
	
	
	
}

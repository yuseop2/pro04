package com.myshop.dao;

import java.util.List;

import com.myshop.dto.MemberDTO;

public interface MemberDAO {
	public List<MemberDTO> memberList() throws Exception;
	public int memeberCount() throws Exception;
	public MemberDTO getMember(MemberDTO mdto) throws Exception;
	public MemberDTO signIn(MemberDTO mdto) throws Exception;
	public MemberDTO loginCheck(MemberDTO mdto) throws Exception;
	public MemberDTO login(MemberDTO mdto) throws Exception;
	public void memberInsert(MemberDTO mdto) throws Exception;
	public void memberUpdate(MemberDTO mdto) throws Exception;
	public void memberDelete(MemberDTO mdto) throws Exception;
	
	
	
	
}
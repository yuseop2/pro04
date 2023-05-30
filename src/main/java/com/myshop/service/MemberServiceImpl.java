package com.myshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dao.MemberDAO;
import com.myshop.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	public MemberDAO memberDao;

	@Override
	public List<MemberDTO> memberList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memeberCount() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDTO getMember() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO signIn() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO loginCheck() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO login() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void memberInsert() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberUpdate() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberDelete() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}

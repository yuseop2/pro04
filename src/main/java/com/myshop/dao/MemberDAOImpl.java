package com.myshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myshop.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSession sqlSession;
	
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
	public MemberDTO getMember(MemberDTO mdto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	//로그인 : 컨트롤러에서 처리
	@Override
	public MemberDTO signIn(MemberDTO mdto) throws Exception {
		return sqlSession.selectOne("member.signIn", mdto);
	}
	
	//로그인 : DAO에서 처리
	@Override
	public MemberDTO loginCheck(MemberDTO mdto) throws Exception {
		MemberDTO member = sqlSession.selectOne("member.loginCheck",mdto);
		if(member.getId().equals(mdto.getId()) && member.getPw().equals(mdto.getPw())) {
			return member;
		} else {
			member=null;
		}
		return member;
	}

	@Override
	public MemberDTO login(MemberDTO mdto) throws Exception {
		return sqlSession.selectOne("member.login",mdto);
	}

	@Override
	public void memberInsert(MemberDTO mdto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberUpdate(MemberDTO mdto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberDelete(MemberDTO mdto) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
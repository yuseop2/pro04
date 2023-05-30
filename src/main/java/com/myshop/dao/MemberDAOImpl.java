package com.myshop.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.myshop.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	SqlSession sqlSession;
	
	@Inject
	BCryptPasswordEncoder pwdEncoder;
	
	//ȸ�� ���
	@Override
	public List<MemberDTO> memberList() throws Exception {
		return sqlSession.selectList("member.memberList");
	}

	//ȸ����
	@Override
	public int memberCount() throws Exception {
		return sqlSession.selectOne("member.memberCount");
	}

	//Ư�� ȸ������ ��ȸ
	@Override
	public MemberDTO getMember(String id) throws Exception {
		return sqlSession.selectOne("member.getMember", id);
	}

	//�α��� : ��Ʈ�ѷ����� ó��
	@Override
	public MemberDTO signIn(MemberDTO mdto) throws Exception {
		return sqlSession.selectOne("member.signIn", mdto);
	}

	//�α��� : DAO���� ó��
	@Override
	public MemberDTO loginCheck(MemberDTO mdto) throws Exception {
		MemberDTO member = sqlSession.selectOne("member.loginCheck", mdto);
		boolean loginSuccess = pwdEncoder.matches(mdto.getPw(), member.getPw());
		if(member.getId().equals(mdto.getId()) && loginSuccess) {
			return member;
		} else {
			member = null;
		}
		return member;
	}

	//�α��� : AJax�� �α��� ó��
	@Override
	public MemberDTO login(MemberDTO mdto) throws Exception {
		return sqlSession.selectOne("member.login", mdto);
	}

	//ȸ������
	@Override
	public void memberInsert(MemberDTO mdto) throws Exception {
		sqlSession.insert("member.memberInsert", mdto);
	}

	//ȸ������ ����
	@Override
	public void memberUpdate(MemberDTO mdto) throws Exception {
		sqlSession.update("member.memberUpdate", mdto);
	}

	//ȸ�� Ż��
	@Override
	public void memberDelete(String id) throws Exception {
		sqlSession.delete("member.memberDelete", id);
	}
}


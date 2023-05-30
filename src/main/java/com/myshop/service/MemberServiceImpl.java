package com.myshop.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.myshop.dao.MemberDAO;
import com.myshop.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDao;
	
	@Inject
	BCryptPasswordEncoder pwdEncoder;
	
	//ȸ�� ���
	@Override
	public List<MemberDTO> memberList() throws Exception {
		return memberDao.memberList();
	}

	//ȸ����
	@Override
	public int memberCount() throws Exception {
		return memberDao.memberCount();
	}

	//Ư�� ȸ������
	@Override
	public MemberDTO getMember(String id) throws Exception {
		return memberDao.getMember(id);
	}

	//�α��� : ��Ʈ�ѷ����� �α��� ó��
	@Override
	public MemberDTO signIn(MemberDTO mdto) throws Exception {
		return memberDao.signIn(mdto);
	}

	//�α��� : DAO���� �α��� ó��
	@Override
	public MemberDTO loginCheck(MemberDTO mdto) throws Exception {
		return memberDao.loginCheck(mdto);
	}

	//�α��� : AJax�� ���񽺿��� �α��� ó��
	@Override
	public boolean login(HttpServletRequest req) throws Exception {
		boolean loginSuccess = false;
		MemberDTO mdto = new MemberDTO();
		mdto.setId(req.getParameter("id"));
		mdto.setPw(req.getParameter("pw"));
		HttpSession session = req.getSession();
		MemberDTO login = memberDao.login(mdto);
		loginSuccess = pwdEncoder.matches(mdto.getPw(), login.getPw());
		if(loginSuccess && login!=null) {
			session.setAttribute("member", login);
			session.setAttribute("sid", mdto.getId());
			loginSuccess = true;
		}
		return loginSuccess;
	}

	//ȸ�� ����
	@Override
	public void memberInsert(MemberDTO mdto) throws Exception {
		memberDao.memberInsert(mdto);
	}

	//ȸ������ ����
	@Override
	public void memberUpdate(MemberDTO mdto) throws Exception {
		memberDao.memberUpdate(mdto);
	}

	//ȸ�� Ż��
	@Override
	public void memberDelete(String id) throws Exception {
		memberDao.memberDelete(id);
	}
}


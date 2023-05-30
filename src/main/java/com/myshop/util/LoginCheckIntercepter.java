package com.myshop.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckIntercepter extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//������ �ִ� ��츸 servlet-context.xml�� interceptor�� ����� ���� ������ ������.
		boolean flag = false;
		HttpSession session = request.getSession(false);
		//������ �ִ�(�α�����) ��� true, ������ ����(�α����� ���� ����) ��� false
		if(session!=null&&session.getAttribute("member")!=null){
			flag=true;
			System.out.println("**�ڵ鷯 ���ͼ��� ����**"+request.getRequestURI());
		} else {
			flag=false;
			System.out.println("�ڵ鷯 ���ͼ��� : ������ ����Ǿ� home���� �����̷�Ʈ");
			response.sendRedirect("../member/loginForm.do");
		}
		return flag;
	}
}

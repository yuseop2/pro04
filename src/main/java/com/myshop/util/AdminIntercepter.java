package com.myshop.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AdminIntercepter extends HandlerInterceptorAdapter {
    //���� �׼��� ����Ǳ� ��
    @Override
    public boolean preHandle(HttpServletRequest request
            , HttpServletResponse response, Object handler) 
                    throws Exception {
        HttpSession session = request.getSession();          //���� ��ü ����
        String sid = (String) session.getAttribute("sid");
        if(session.getAttribute("sid")==null) {          //������ ������(�α��ε��� ���� ����)
            response.sendRedirect("/");			            //���� �������� �̵�
            return false; 
        }
        
        if(sid.equals("admin")) {
            return true; //���� �׼����� �̵�(���ε� url)
        } else {
            response.sendRedirect("/");   //���� �������� �̵�
            return false; 
        }
    }
    @Override
    public void postHandle(HttpServletRequest request  //���� �׼��� ����� ��
            , HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }
}
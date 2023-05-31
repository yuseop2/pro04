package com.myshop.util;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.myshop.dto.MemberDTO;

public class MemberValidator implements Validator{
	
	
	public void validate(Object obj, Errors error) {
		MemberDTO member = (MemberDTO) obj;
		
		//빈 값 검증
		ValidationUtils.rejectIfEmpty(error, "id", "member.id.empty", "아이디를 입력해주세요");
		ValidationUtils.rejectIfEmpty(error, "pw", "member.pw.empty", "비밀번호를 입력해주세요");
		
		//패턴검증
		Pattern pat = Pattern.compile("^[a-zA-Z0-9]{8,12}$",Pattern.CASE_INSENSITIVE);
		if(!(pat.matcher(member.getPw()).matches())) {
			error.rejectValue("pw", "member.pw.invalid");
		}
		
		
		
	}

	@Override
	public boolean supports(Class<?> clazz) {
		
		return false;
	}
	
	

}

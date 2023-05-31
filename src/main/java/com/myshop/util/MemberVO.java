package com.myshop.util;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class MemberVO {

	@Id		//primary key이어야함
	@Size(min=5, max=12, message="아이디는 5~12자로 입력해야합니다")
	String id;
	
	@Column
	@NotNull
	@Size(min=8, max=12, message="비밀번호는 8~12자로 입력해야합니다" )
	@Pattern(regexp="^[a-z0-9]{5,12}$")
	String pw;
	
	/*
	 * 
	 */
	
	
	
	
}

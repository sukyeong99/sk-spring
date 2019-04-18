package com.sk.jdbc.chap03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMainUsingSpring {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap03.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService",
				MemberRegisterService.class);

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("tnrud3304@naver.com");
		req.setPassword("xxxx");
		req.setName("sukyeong");

		// 회원 등록
		regService.regist(req);
	}
}
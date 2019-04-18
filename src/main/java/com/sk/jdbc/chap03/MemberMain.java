package com.sk.jdbc.chap03;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService();
		regService.setMemberDao(memberDao);

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("tnrud3304@naver.com");
		req.setPassword("xxxx");
		req.setName("sukyeong");

		// 회원 등록
		regService.regist(req);
	}
}


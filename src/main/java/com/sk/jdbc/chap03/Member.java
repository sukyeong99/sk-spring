package com.sk.jdbc.chap03;

public class Member {
	String memberId; // 아이디
	String email; // 이메일
	String password; // 비밀번호
	String name; // 이름
	String registerDate; // 등록일시

	/**
	 * Default Constructor
	 */
	public Member() {
	}

	/**
	 * email, password, name 으로 초기화하는 컨스트럭터
	 * 
	 * @param email 이메일
	 * @param password 비밀번호
	 * @param name 이름
	 */
	public Member(String email, String password, String name) {
		this.email = email;
		this.password = password;
		this.name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", email=" + email
				+ ", password=" + password + ", name=" + name
				+ ", registerDate=" + registerDate + "]";
	}
}
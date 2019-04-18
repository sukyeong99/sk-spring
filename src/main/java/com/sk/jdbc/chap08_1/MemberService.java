package com.sk.jdbc.chap08_1;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.jdbc.chap03.Member;

@Service
public class MemberService {

	Logger logger = LogManager.getLogger();
	
	@Autowired
	MemberDao memberDao;



	public void selectAll() {
		List<Member> members = memberDao.selectAll(0, 100);
		logger.debug(members);
	}

	public void updateMember() {
		Member member = memberDao.selectByEmail("tnrud33044@naver.com");
		member.setPassword("1233");
		memberDao.update(member);
		logger.debug("Update complete.");
	}

	public void insertMember() {
		Member member = new Member();
		member.setEmail("tnrud33044@naver.com");
		member.setPassword("1231");
		member.setName("sukyeong");
		memberDao.insert(member);
		logger.debug("Insert complete.");
	}
}
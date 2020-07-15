package com.itwill.member;

import java.util.ArrayList;

public class MemberService {
		private MemberDao memberDao;
		public MemberService() throws Exception{
			memberDao = new MemberDao();
	}
		/*
		 * 회원가입  
		 */
		public boolean memberRegister(Member newMember) throws Exception {
			boolean isSuccess = false;
			isSuccess = memberDao.create(newMember);
			
			return isSuccess;
		}
		
		/*
		 * 로그인
		 */
		public int login(String id, String password) throws Exception {
			int result =-9999;
			/*
			 * 0:성공
			 * 1:아이디 존재x
			 * 2:패스워드 불일치
			 */
			
			//1. 아이디 존재 여부
			if(memberDao.isDuplicateID(id)) {
				//아이디 존재
				Member findMember = memberDao.readOne(id);
				//2.패스워드 일치여부
				if(findMember.matchPassword(password)) {
					//패스워드 일치
					result = 0;
				}else {
					//패스워드 불일치
					result = 2;
				}
			}else {
				//아이디 존재안함
				result= 1;
			}
			
			return result;
			
		}
		
		/*
		 * 로그아웃
		 */
		
		/*
		 * 회원상세보기(회원1명 id로 찾기)
		 */
		public Member findById(String id) throws Exception {
			Member findMember = memberDao.readOne(id);
			return findMember;
		}
		
		/*
		 * 회원리스트(전체)
		 * 회원리스트(이름으로 찾기)
		 * 회원리스트(주소로 찾기)
		 * 회원리스트(나이)
		 */
		public ArrayList<Member> memberList() throws Exception{
			return memberDao.readAll();
		}
		/*
		 * 회원탈퇴
		 */
		public void memberUnRegister(String id) throws Exception {
			memberDao.delete(id);
		}
		/*
		 * 회원수정
		 */
		public void memberUpdate(Member updateMember) throws Exception {
			memberDao.update(updateMember);
			
		}

}

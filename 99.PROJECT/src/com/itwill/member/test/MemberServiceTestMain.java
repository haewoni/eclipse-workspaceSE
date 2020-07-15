package com.itwill.member.test;

import com.itwill.member.Member;
import com.itwill.member.MemberService;

public class MemberServiceTestMain {

	public static void main(String[] args) throws Exception {
		MemberService memberService = new MemberService();
		System.out.println("---------memberRegister-----------");
		boolean isSuccess = 
				memberService.memberRegister(new Member("aaa","aaa","에이님","LA",54,false));
		System.out.println(isSuccess);
		isSuccess =
				memberService.memberRegister(new Member("bbb","bbb","비비님","TEXAS",23,true));
		System.out.println(isSuccess);
		isSuccess =
				memberService.memberRegister(new Member("xxx","xxx","비비님","TEXAS",23,true));
		System.out.println(isSuccess);
		
		System.out.println("----------login------------");
		int loginResult = memberService.login("aaa", "aaa");  
		System.out.println(loginResult);
		loginResult = memberService.login("aaa", "kkk");
		System.out.println(loginResult);
		loginResult = memberService.login("ggg", "kkk");
		System.out.println(loginResult);
		System.out.println("-------------------findById-----------------------");
		System.out.println(memberService.findById("aaa"));
		System.out.println("-------------------memberList-----------------------");
		System.out.println("-------------------memberUpdate---------------------");
		System.out.println("-------------------memberUnRegister-----------------------");
		

	}

}

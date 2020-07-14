package com.itwill.account.test;

import com.itwill.account.Account;
import com.itwill.account.AccountDaoFileImpl;
import com.itwill.account.AccountService;

public class AccountServiceTestMain {
	public static void main(String[] args) throws Exception {
		AccountService accountService = new AccountService();
		/*
		 * 계좌 개설
		 */
		accountService.addAccount(new Account(1000,"백백백",0,6.7));
		accountService.addAccount(new Account(2000,"이백백",43534,6.7));
		accountService.addAccount(new Account(3000,"삼백백",56421,6.7));
		accountService.addAccount(new Account(4000,"사백백",987611,6.7));
		
		
		/*
		 * 계좌전체 검색후 반환
		 */
		System.out.println("계좌전체 검색 후 반환");
		System.out.println(accountService.findByAll());
		
		/*
		 * 계좌번호 1개 검색 후 반환
		 */
		System.out.println("계좌번호 1개 검색 후 반환");
		System.out.println(accountService.findAccByNo(5));
		
		/*
		 * 계좌 입금
		 */
		System.out.println("계좌 입금");
		accountService.ipGum(2000, 56000);
		
		/*
		 * 계좌 출금
		 */
		System.out.println("계좌 출금");
		accountService.chulGum(3000, 5000);
		
		/*
		 * 계좌 해지
		 */
		System.out.println("계좌 삭제");
		System.out.println(accountService.close(1000));
		System.out.println(accountService.close(2000));
	
		System.out.println(accountService.findByAll());
		
		
		
	
	}
}

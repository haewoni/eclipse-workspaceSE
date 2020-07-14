package com.itwill.account;

import java.util.ArrayList;

/* 
	은행업무를 실행할 클래스
		- 계좌관리 업무를 수행하는 클래스
		- Account객체를 사용(의존성관계)
		- GUI객체(AccountServiceMainFrame)에서 직접접근(메쏘드호출)하는 클래스
		- 업무 처리시/ 데이터 접근 필요하면/ AccountDao객체를 이용해서 / 업무를 실행
		- AccountDao객체를 포함하고 있다.[멤버변수]
*/

public class AccountService {
	private AccountDao accountDao;
	
	public AccountService() throws Exception {
		accountDao = new AccountDaoFileImpl();
	}

	/*
	 * 계좌 생성
	 */
	public boolean addAccount(Account account) throws Exception {
		boolean isAdd = accountDao.create(account);
		return isAdd;
	}
	
	/*
	 * 계좌 전체 검색()
	 */
	public ArrayList<Account> findByAll() throws Exception {
		ArrayList<Account> accountList = accountDao.readAll();
		return accountList;
	}
	/*
	 * 계좌번호로 검색(1개 검색) 후 반환
	 */
	public Account findAccByNo(int no) throws Exception {
		Account account = accountDao.readOne(no);
		return account;
	}
	/*
	 * 계좌입금
	 */
	public void ipGum(int no, int m) throws Exception {
		/*
		 * 1. 계좌번호로 계좌객체 찾기  //서비스호출x , Dao(CRUD) 호출 o
		 * 2. 입금
		 */
		Account account = accountDao.readOne(no);
		account.deposit(m);
		accountDao.update(account); 		
	}
	
	/*
	 * 계좌출금
	 */
	public void chulGum(int no,int m) throws Exception{
		/*
		 * 1.계좌번호로 계좌찾기
		 * 2. 출금
		 */
		Account account = accountDao.readOne(no);
		account.withdraw(m);
		accountDao.update(account);
		
	}
	/*
	 * 계좌해지 
	 */
	public Account close(int no) throws Exception{
		Account closeAccount =null;
		
		closeAccount = accountDao.readOne(no);
		if(closeAccount.getBalance()!=0) {
			
		}else {
			accountDao.delete(no);
		}
		return closeAccount;
	}

	public ArrayList<Account> findAccountByOwner(String ownerStr) throws Exception {

		ArrayList<Account> accountList = accountDao.readByOwner(ownerStr);
		return accountList;
	}
	

	
	
}
















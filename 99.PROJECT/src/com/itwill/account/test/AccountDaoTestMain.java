package com.itwill.account.test;

import com.itwill.account.Account;
import com.itwill.account.AccountDao;

public class AccountDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		AccountDao accountDao = new AccountDao();
		System.out.println("-----create--------");
		accountDao.create(new Account(1,"ONE",34563478,0.321));
		accountDao.create(new Account(2,"TWO",43534,0.98));
		accountDao.create(new Account(3,"THREE",131,0.51));
		accountDao.create(new Account(4,"김소미",7687,0.21));
		accountDao.create(new Account(5,"장하나",8888,0.32));
		
		System.out.println("-----readAll--------");
		System.out.println(accountDao.readAll());
		System.out.println("-----readOne--------");
		System.out.println(accountDao.readOne(5));
 
	}

}

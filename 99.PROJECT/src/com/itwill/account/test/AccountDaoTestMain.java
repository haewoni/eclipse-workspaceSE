package com.itwill.account.test;

import com.itwill.account.Account;
import com.itwill.account.AccountDaoFileImpl;
import com.itwill.account.AccountDao;

public class AccountDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		AccountDao accountDao = new AccountDaoFileImpl();
		System.out.println("-----create--------");
		
		accountDao.create(new Account(11,"ONEONE",0,0.321));
		accountDao.create(new Account(22,"TWO",43534,0.98));
		accountDao.create(new Account(33,"THREE",131,0.51));
		accountDao.create(new Account(44,"김소미",7687,0.21));
		accountDao.create(new Account(55,"장하나",8888,0.32));
		
		System.out.println("-----readAll--------");
		System.out.println(accountDao.readAll());
		System.out.println("-----readOne--------");
		System.out.println(accountDao.readOne(5));
		System.out.println("-----update--------");
		Account updateAccount = accountDao.readOne(5);
		updateAccount.setOwner("장두나");
		updateAccount.setBalance(1111);
		accountDao.update(updateAccount);
		System.out.println("-----delete--------");
		accountDao.delete(11);
		System.out.println(accountDao.readAll());
		
	}

}

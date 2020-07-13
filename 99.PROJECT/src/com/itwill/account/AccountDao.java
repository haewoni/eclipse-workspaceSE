package com.itwill.account;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * /*
Dao(Data Access Object)
 - 계좌 객체들의 데이터를 저장하고 있는 파일(테이블)에
   CRUD(Create, Read, Update, Delete) 작업을 할 수있는
   단위 메쏘드를 가지고있는 클래스

 - AccountService객체의 요청(메쏘드호출)을 받아서 
   Data Access(File, DB)에 관련된 단위 기능(CRUD)을
   수행하는 객체
 
 */

public class AccountDao {
	
	/*
	 * Account 데이터 소스(파일,테이블,메모리)
	 */
	
	private File accountsFile;
	public AccountDao() throws Exception { // 초기화 작업
	
			accountsFile = new File("accounts.ser");
			if(!accountsFile.exists()) {
				System.out.println("파일생성[accounts.ser]");
				ObjectOutputStream oos = 
						new ObjectOutputStream(new FileOutputStream(accountsFile));
				oos.writeObject(new ArrayList<Account>());
			}
			
	}
	/**********************************************/
	private ArrayList<Account> readFile() throws Exception {
		ObjectInputStream ois = 
				new ObjectInputStream(
						new FileInputStream(accountsFile));
		ArrayList<Account> accountList = (ArrayList<Account>)ois.readObject();
		ois.close();
		return accountList;
	
	
	}
	
	private void writeFile(ArrayList<Account> accountList) throws Exception {
		ObjectOutputStream oos = 
				new ObjectOutputStream(
						new FileOutputStream(accountsFile));
		oos.writeObject(accountList);
		oos.close();
	}
	/*********************************************/

	/*
	 * Create // 추가의 단위는 1개, 중복체크
	 */
	
	public boolean create(Account account) throws Exception{
		if(!this.isDuplicateNo(account.getNo())) {
			ArrayList<Account> accountList = this.readFile();
			accountList.add(account);
			return true;
			
		}else {
			return false;
		}
			
	
	}

	private boolean isDuplicateNo(int no) throws Exception {
		boolean isDuplicate = false;
		ArrayList<Account> accountList = this.readFile();
		for (Account account : accountList) {
			if(account.getNo()==no) {
				isDuplicate = true;
				break;
			}
		}
		return isDuplicate;
	}

	/*
	 * ReadOne ReadAll
	 */
	public Account readOne(int no) throws Exception {
		ArrayList<Account> accountList = this.readFile();
		Account findAccount = null;
		for (Account account : accountList) {
			if(account.getNo()==no) {
				findAccount = account;
			}
		}
		return findAccount;
	}

	
	public ArrayList<Account> readAll() throws Exception {
		ArrayList<Account> accountList = this.readFile();
		return accountList;
	}

	/*
	 * Update
	 */
	public void update() {

	}

	/*
	 * Delete
	 */
	public void delete() {

	}

}

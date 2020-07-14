package com.itwill.account;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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

public class AccountDaoFileImpl implements AccountDao {
	
	/*
	 * Account 데이터 소스(파일,테이블,메모리)
	 */
	
	private File accountsFile;
	public AccountDaoFileImpl() throws Exception { // 초기화 작업
	
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
	
	@Override
	public boolean create(Account account) throws Exception{
		if(!this.isDuplicateNo(account.getNo())) {
			ArrayList<Account> accountList = this.readFile();
			accountList.add(account);
			this.writeFile(accountList);
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
	@Override
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

	
	@Override
	public ArrayList<Account> readAll() throws Exception {
		ArrayList<Account> accountList = this.readFile();
		return accountList;
	}
	/*
	 * ReadByOwner
	 */

	@Override
	public ArrayList<Account> readByOwner(String ownerStr) throws Exception {
		ArrayList<Account> accountList = this.readFile();
		ArrayList<Account> findAccounts = new ArrayList<Account>();
		for (Account account : accountList) {
			if(account.getOwner().equals(ownerStr)) {
				findAccounts.add(account);
			}
		}
		return findAccounts;
	}
	/*
	 * Update
	 */
	/*public void update(Account updateAccount) throws Exception {   //DTO 로 쓰임. 가지고 있는 번호로 데이터 찾아서 나머지 모든 데이터 세팅
		ArrayList<Account> accountList = this.readFile();
		for (Account account : accountList) {
			if(account.getNo() == updateAccount.getNo()) {
				account.setOwner(updateAccount.getOwner());
				account.setBalance(updateAccount.getBalance());
				account.setIyul(updateAccount.getIyul());
				break;
			}
		}
		this.writeFile(accountList);
	}
	*/
	@Override
	public void update(Account updateAccount) throws Exception {   //updateAcocunt 외부 생성, DTO 로 쓰임. 가지고 있는 번호로 데이터 찾아서 나머지 모든 데이터 세팅
		ArrayList<Account> accountList = this.readFile();
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getNo()==updateAccount.getNo()) {
				accountList.set(i,updateAccount);   //i번째 있는 데이터 대체
				break;
		}
	  }
		this.writeFile(accountList);  //data 저장
	}

	
	
	@Override
	public void update(int no,String owner,int balance,double iyul) throws Exception {   //객체지향 원칙과 어긋남, 둘다 쓰면 오버로딩(update 2개)
		ArrayList<Account> accountList = this.readFile();
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getNo()==no) {
				accountList.get(i).setOwner(owner);
				accountList.get(i).setBalance(balance);
				accountList.get(i).setIyul(iyul);
				break;
			}
		}
		this.writeFile(accountList);
	}
	

	/*
	 * Delete
	 */
	@Override
	public void delete(int no) throws Exception {
		ArrayList<Account> accountList = this.readFile();
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getNo()==no) {
				accountList.remove(i);
				break;
			}
		}
		this.writeFile(accountList);

	}
	


}

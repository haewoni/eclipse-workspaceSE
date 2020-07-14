package com.itwill.account;

import java.util.ArrayList;

public interface AccountDao {

	/*********************************************/

	/*
	 * Create // 추가의 단위는 1개, 중복체크
	 */

	boolean create(Account account) throws Exception;

	/*
	 * ReadOne ReadAll
	 */
	Account readOne(int no) throws Exception;

	ArrayList<Account> readAll() throws Exception;
	/*
	 * ReadByOwner
	 */

	ArrayList<Account> readByOwner(String ownerStr) throws Exception;

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
	void update(Account updateAccount) throws Exception;

	void update(int no, String owner, int balance, double iyul) throws Exception;

	/*
	 * Delete
	 */
	void delete(int no) throws Exception;

}
package com.itwill.객체파일저장;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.itwill.account.Account;

public class 객체파일저장Main {

	public static void main(String[] args) throws Exception {
		String title = "제목"; //객체1
		Integer count = 56;    //객체2
		Account acc1 = new Account(2321,"김수한무",98564,2.13265465);  //Account 객체3 생성
		
		ArrayList<Account> accountList = new ArrayList<Account>();  //Account 리스트 객체4 생성
		accountList.add(new Account(8888,"팔팔팔",45354,0.1));
		accountList.add(new Account(8989,"팔구팔",9090909,9.0));
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(
						new FileOutputStream("objectToFile.ser"));   //스트림
		
		oos.writeObject(title);
		oos.writeObject(count);
		oos.writeObject(acc1);
		oos.writeObject(accountList);
		System.out.println("--------------[objectToFile.ser-->writeObject()]-----------------");


	}

}

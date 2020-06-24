package com.itwill04.array;

import java.io.ObjectInputStream.GetField;

public class AccountArrayMain {

	public static void main(String[] args) {
		Account acc1 = new Account(1111, "MIN", 89000, 5.9);

		Account[] accounts = { acc1, new Account(2222, "AIM", 45000, 2.7), new Account(3333, "XIM", 34000, 3.7),
				new Account(4444, "ZIM", 12000, 1.7), new Account(5555, "SIM", 97000, 5.7),
				new Account(6666, "BIM", 88000, 3.7), new Account(7777, "CIM", 11000, 9.7),
				new Account(8888, "YIM", 21000, 8.7), new Account(9999, "QIM", 71000, 2.7) };

		System.out.println("1.은행총계좌수:" + accounts.length);
		System.out.println("2.은행계좌전체출력");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}

		System.out.println("3.은행계좌들 총잔고:");
		int totBalance = 0;
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i].getBalance());
		}

		System.out.println(totBalance);
		System.out.println("4.은행계좌들중에서 계좌번호 3333번계좌한개찾아 출력 ");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 3333)
				accounts[i].print();
		}

		System.out.println("5.은행계좌들중에서 계좌잔고 50000원이상 계좌들찾아 출력 ");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= 50000)
				accounts[i].print();
		}
		System.out.println("6.은행계좌들중에서 계좌이율 5.0이상 계좌들찾아 출력 ");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul() >= 5.0)
				accounts[i].print();
		}
		System.out.println("7.6666번계좌 5000원 입금");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 6666) {
				accounts[i].print();
				accounts[i].deposit(5000);
				accounts[i].print();
			}		

		}

		System.out.println("8.8888번계좌 3000원 출금[Quiz]");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==8888) {
				accounts[i].print();
				accounts[i].withdraw(3000);
				accounts[i].print();
			}
		}

		System.out.println("9.계좌를 잔고순으로 오름(내림)차순정렬[Quiz]");
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if (accounts[i].getBalance() > accounts[i+1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j]= tempAccount;
				}
				
			}
			
		}

		System.out.println("10.6666계좌의 이율을 9.0로변경");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==6666) {
				accounts[i].print();
				accounts[i].setIyul(9.0);
				accounts[i].print();
			}
		}

		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}

	}

}

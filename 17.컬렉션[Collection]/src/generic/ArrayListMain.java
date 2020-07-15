package generic;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {

	public static void main(String[] args) {
		System.out.println("--------Object[]----------");
		Object[] anyTypeArray = new Object[5];
		Account acc1 = new Account(1111,"KING",33000,0.05);
		Account acc2 = new Account(2222,"KING",23000,0.1);
		Account acc3 = new Account(3333,"YONG",89000,0.2);
		Account acc4 = new Account(4444,"SANG",12000,0.5);
		Account acc5 = new Account(5555,"KING",99000,0.8);
		anyTypeArray[0] = acc1;
		anyTypeArray[1] = acc2;
		anyTypeArray[2] = acc3;
		anyTypeArray[3] = acc4;
		anyTypeArray[4] = acc5;    //상위로의 캐스팅
		
		for (int i = 0; i < anyTypeArray.length; i++) {
			Account tempAccount = (Account)anyTypeArray[i];
			tempAccount.print();
			}
		System.out.println();
		System.out.println("-------------ArrayList[참조형]---------------");
		ArrayList<Account> accountList = new ArrayList<Account>();
		System.out.println(accountList.toString());
		System.out.println("#size:"+accountList.size());
		
		System.out.println("***************1.add*****************");  ///추가
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		accountList.add(new Account(6666,"SIX",6000,6.0));
		accountList.add(0,new Account(1000,"FIRST",100000,1.0));   //0번 자리에 대입
		System.out.println("#size:"+accountList.size());
		//accountList.add(acc3);  --->중복허용
		System.out.println(accountList);  // ??????
		System.out.println();
		
		System.out.println("***************2.set*****************");  //3번 자리에 대입, 원래 있던 값은 사라짐?
		accountList.set(3, new Account(4445,"FOUR",44000,0.4));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList.toString());
		System.out.println();
		
		System.out.println("***************3.get*****************"); //읽기
		Account getAccount = accountList.get(1);
		getAccount.print();
		getAccount = (Account)accountList.get(4);
		getAccount.print();
		System.out.println();
		
		System.out.println("***************4.remove*****************"); //Last In First Out ?
		accountList.remove(accountList.size()-1);
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println();
		
		System.out.println("***************전체출력****************");
		for (int i = 0; i < accountList.size(); i++) {
			accountList.get(i).print();
		}
		System.out.println();
		
		System.out.println("--------------------전체출력[enhanced for]--------------------");  //for each 문
		for (Account account : accountList) {
			account.print();
						
		}
		System.out.println();
		
		System.out.println("**************계좌번호 3333번 계좌 출력******************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getNo()==3333) {
				tempAccount.print();
				break;
			}
			
		}
		System.out.println();
		
		System.out.println("**************계좌번호 5555번 계좌 출력******************");
		for (int i = 0; i < accountList.size(); i++) {
		Account tempAccount = (Account) accountList.get(i);
		if (tempAccount.getNo()==5555) {
			tempAccount.print();
			break;
		}
		
	}
		System.out.println();
		
		System.out.println("**************계좌이름 KING 계좌들 출력******************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);   //accountList ArrayList 타입을 Account로 형변환?캐스팅?
			if (tempAccount.getOwner().equals("KING")) {
				tempAccount.print();
			}
			
		}
		System.out.println();
		
		System.out.println("**************계좌번호 5555번 계좌 한개 삭제******************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getNo()==5555) {
				System.out.println("before remove size:"+accountList.size());
				accountList.remove(i);  //ArrayList
				System.out.println("after remove size:"+accountList.size());
				break;
			}
			
		}
		System.out.println(accountList);
		System.out.println();
		
		System.out.println("*****************계좌이름 KING인 계좌들 삭제**********************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				accountList.remove(i);
				i--;    /////사이즈 줄어들어서 다음거 검사x
			}
		}
		System.out.println(accountList);
		System.out.println();
		
		/*****************iteration*********************/
		System.out.println("##################### iteration ######################");
		Iterator<Account> accountIter = accountList.iterator();
		while(accountIter.hasNext()) {
			//System.out.println(accountIter.next());
			Account tempAccount = accountIter.next();
			tempAccount.print();
			
		}
	}
}


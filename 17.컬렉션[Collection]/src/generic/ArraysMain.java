package generic;

import java.util.Arrays;

import org.omg.CORBA.OMGVMCID;

public class ArraysMain {

	public static void main(String[] args) {
		int[] intArray1= {1,3,5,7,9};
		int[] intArray2= {1,3,5,7,9};
		String[] strArray1= {new String("one"),"two","three"};
		String[] strArray2= {new String("one"),"two","three"};
		Account[] accounts= {
				new Account(1111,"ONE",50000,2.5),
				new Account(2222, "KIM", 56000, 0.9),
				new Account(3333, "PAR", 12000, 1.9),
				new Account(4444, "CHO", 89000, 4.9),
				new Account(5555, "SIM", 34000, 0.6),
				new Account(6666, "KIM", 77000, 0.1),
				new Account(7777, "KIM", 11000, 0.3),
				new Account(8888, "GIM", 21000, 2.4),
				new Account(9999, "QIM", 99000, 3.3)
		};
		
		System.out.println("1.배열의 내용비교");
		boolean isSame=Arrays.equals(intArray1, intArray2);
		System.out.println(">>>"+isSame);
		isSame=Arrays.equals(strArray1, strArray2);
		System.out.println(">>>"+isSame);
		System.out.println();
		
		System.out.println("2.배열의 원소채우기");
		int[] intArray3=new int[10];
		Arrays.fill(intArray3, 7);
		for (int tempi:intArray3) {
			System.out.print(tempi+",");
		}
		System.out.println();
		
		Arrays.fill(accounts, new Account(1000,"THOU",34000,9.0));
		for (int i = 0; i < accounts.length; i++) {
	    accounts[i].print();   
		}
		System.out.println();
		
		System.out.println("3.배열복사");
		int[] intArray1Copy = Arrays.copyOf(intArray1,10);  //int 초기화 값 0으로 복사
		for (int i:intArray1Copy) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
		Account[] copyAccounts = Arrays.copyOf(accounts, 9);   ///배열 복사, 배열보다 많이 복사하면 Account객체는 null 뜸
		for (Account account : copyAccounts) {
			account.print();
		} 
		
		System.out.println();
		
		int[] intArray2Copy = new int[intArray2.length];
		System.arraycopy(intArray2, 0, intArray2Copy, 0, intArray2.length);   //??????????
		for (int i : intArray2Copy) {
			System.out.println(i+" ");
		}
		System.out.println("--------------sort[기본형]------------------");
		//String
		int[] scoreArray = {90,34,23,88,56,11};
		Arrays.sort(scoreArray);
		for (int score : scoreArray) {
			System.out.println(score+" ");
		}
		String[] nameArray = {"KIM","AIM","FIM","BIM","QIM"};    //compareTo 이용해서 sorting 사전순
		Arrays.sort(nameArray);
		for (String name : nameArray) {
			System.out.println(name+" ");
		}  
		System.out.println();
		//Wrapper
		System.out.println("-----------------sort[참조형]--------------");
		Integer[] wia = {
			new Integer(90),67,12,56,89,23,99	
			
		};
		Arrays.sort(wia);
		for (Integer wi : wia) {
			System.out.println(wi.intValue()+" ");
		}
		System.out.println("-------------ComparableAsc--------------------");
		System.out.println();
		
		Arrays.sort(accounts);
		/*
		 * 1.Account 를 Comparable<T> interface type으로 형변환 한다.
		 * 2. Comparable.compareTo()메쏘드를 호출한다.
		 * 3. 반환값이 양수이면 교체,음수이면 교체안함
		 */
		for (Account acc : accounts) {
			acc.print();
			
		}
		System.out.println("----------------BalanceDescComparator----------------");
		Arrays.sort(accounts, new BalanceDescComparator());
		for (Account acc : accounts) {
			acc.print();
			
		}
		System.out.println("----------------NameAscComparator----------------");
		Arrays.sort(accounts, new NameAscComparator());
		for (Account acc : accounts) {
			acc.print();
			
		}
	}

}

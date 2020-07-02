package com.itwill04.array;
/*
 * 로또 번호 6개(1set)를 가지고 있는 객체
 */

/*public class Lotto {
	private int[] noArray;
	public Lotto() {
		noArray= new int[6];
		this.generateNumber();		
	}
	private void generateNumber() {
		for (int i = 0; i < noArray.length; i++) {
			noArray[i] = (int)(Math.random()*45)+1;
		for (int j = 0; j < i; j++) {
			if(noArray[i]==noArray[j]) {
				System.out.println("--중복--");
				i--;
				break;
			}
		}
	}
}
*/
public class Lotto {
	//변수선언
	private int[] noArray; 
	//객체 생성
	public Lotto() {
		noArray = new int[6];
		this.generateNumber();
		
	}
	
	//번호 생성 메소드 
	private void generateNumber() {
		for (int i = 0; i < noArray.length; i++) {
			noArray[i] = (int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				if(noArray[i]==noArray[j]) {
					System.out.println("--중복--");
					i--;
					break;
				}
				
			}
		}
	}


/*	
	public void print() {
		for (int i = 0; i < noArray.length; i++) {
			System.out.print(noArray[i]+"");
		}
		System.out.println();
		
	}
	*/
	//프린트 메소드
	public void print() {
		for (int i = 0; i < noArray.length; i++) {
			System.out.println(noArray[i]+"");
		}
		System.out.println();
	}
}

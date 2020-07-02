package com.itwill04.array;

public class LottoMain {

	public static void main(String[] args) {
		
		
		int [] lottoNo = new int[6]; //정수형 객체 담을 배열 6개짜리 생성
		for (int i = 0; i < lottoNo.length; i++) {
			//중복체크
			System.out.println("count:"+i);
			lottoNo[i] = (int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				if(lottoNo[i]==lottoNo[j]) {
					System.out.println("---중복----");
					i--;
					break;
				}
			}
		}
		
		 
		for (int i = 0; i < lottoNo.length; i++) {
			System.out.print(lottoNo[i]+" ");
		}
		/*
		 * 번호 6개 출력
		
		System.out.println();
		System.out.println("--------Lotto---------");
		Lotto lotto1=new Lotto();
		lotto1.print();
		System.out.println("--------Lotto[]---------");
		Lotto[] lottoArray= new Lotto[10];
		for (int i = 0; i < lottoArray.length; i++) {
			lottoArray[i].print();
		}
		
		/*lottoArray[0]=new Lotto();
		lottoArray[1]=new Lotto();
		lottoArray[2]=new Lotto();
		lottoArray[3]=new Lotto();
		lottoArray[4]=new Lotto();
		lottoArray[5]=new Lotto();
		lottoArray[6]=new Lotto();
		lottoArray[7]=new Lotto();
		lottoArray[8]=new Lotto();
		lottoArray[9]=new Lotto();
		
	}
	*/
		for (int i = 0; i < lottoNo.length; i++) {
			System.out.println(lottoNo[i]+"");
		}
		System.out.println();
		System.out.println("------Lotto-------");
		//생성자
		Lotto lotto1 = new Lotto();
		lotto1.print();
		System.out.println("------Lotto[]-----"); 
		//로또 객체 10개 담을 배열 객체 생성
		Lotto[] lottoArray = new Lotto[10];
		//출력
		for (int i = 0; i < lottoArray.length; i++) {
			lottoArray[i].print();
		}

	}
}

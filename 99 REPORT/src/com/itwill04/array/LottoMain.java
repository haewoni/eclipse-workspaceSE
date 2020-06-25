package com.itwill04.array;

public class LottoMain {

	public static void main(String[] args) {
		
		int[] lottoNo=new int[6];  
		/*
		 * 번호 6개(1set) 생성
		 */
		for (int i = 0; i < lottoNo.length; i++) {
			//중복체크
			System.out.println("count:"+i);
			lottoNo[i] = (int)(Math.random()*45)+1;
		}
		/*
		 * 번호 6개 출력
		 */
		for (int i = 0; i < lottoNo.length; i++) {
			System.out.print(lottoNo[i]+" ");
		}
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
		*/
	}


}

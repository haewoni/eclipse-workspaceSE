package com.itwill04.array;

public class CarArrayMain {
	public static void main(String[] args) {
		/*
		 * NullPointerException
		 */
		//배열객체생성
		Car[] carArray= {
				null,null,new Car("7891", 5),null,null,	
				null,null,new Car("1890", 11),null,null,
				null,null,null,null,null,
				null,new Car("4234", 9),null,null,null,
				null,null,null,new Car("4567", 11),null,
				new Car("6777", 10),null,null,null,null
			};
		
		System.out.println("1.전체차량출력");
		for (int i=0; i < carArray.length; i++) {
			if(carArray[i]!=null)
				carArray[i].printNo();	
		}
		
		
		
		
		System.out.println("2.주차전체구획수:"+carArray.length);
		int count = 0;
		System.out.println();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				count++;
			}
		}
		
		
		System.out.println("3.주차가능주차구획수:" + count);
		
		
		
		System.out.println("4.입차");   ///ipcha 메소드
		Car car1=new Car("3166",7);
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				carArray[i]=car1;
				break;
			}
		}
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null)
			carArray[i].printNo();
		}
		
		/*
		 * 1.차량객체생성 
		 * 2.빈자리찾아서대입
		 */
		
		System.out.println("5.차량번호 4567번  차 한대 정보출력");
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getNo().equals("4567")) {
				carArray[i].printNo();
				break;
			}
		}
	
		
		System.out.println("6.입차시간 8시이후 차 여러대 정보출력");
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getInTime()>=8) {
				carArray[i].printNo();
			}
		}
		
		
		System.out.println("7.7891번차량 12시 출차");
		
		 // 1 . 7891번차량찾기 
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getNo().equals("7891")) {
		// 2 . 출차 
				carArray[i].setOutTime(12);
		// 3 . 영수증출력 
				carArray[i].calculateFee();
				carArray[i].print();
		// 4 . 주소값--> null
				carArray[i]=null;
				
				
			}
		}
		
		
		
		 
		
	      }
		

}

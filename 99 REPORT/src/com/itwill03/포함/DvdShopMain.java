package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		/*
		 * Dvd객체생성
		 */
		
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		
		DvdMember member1 = new DvdMember(01,"ALEX","010-1234-5678",null);
		
		member1.setDvd(new Dvd(8888,"Her","Science"));
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		member1.print();
	}

}

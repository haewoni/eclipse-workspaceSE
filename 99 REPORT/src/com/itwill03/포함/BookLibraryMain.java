package com.itwill03.포함;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		/*
		 * 책객체생성
		 */
		BookMember mem1= 
				new BookMember(1,"010-1234-5678", "TOM",null);
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		mem1.setBook(new Book(05,"자바프로그래밍입문","IT","가바기초"));
		
		 /* 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		mem1.print();

		
	}

}

package com.itwill.review;

public class AServiceMain {

	public static void main(String[] args) {
		// 객체 생성
		AService aService = new AService();
		// 객체 호출
		aService.a();
		int no = 90;
		aService.b(no);
		aService.b(8907090);
		aService.c(30, "김경호");
		aService.c(88, "최경녀");
		aService.d(5, "신명숙", 'F');
		aService.e(1, "KIM", 100, 45, 89);
		aService.e(2, "JIM", 67, 89, 99);

		Student st1 = new Student();
		st1.no = 9090;
		st1.name = "구공탄";
		st1.kor = 9090;
		st1.eng = 98;
		st1.math = 97;
		System.out.println("st1:"+st1);
		aService.f(st1);

	}

}

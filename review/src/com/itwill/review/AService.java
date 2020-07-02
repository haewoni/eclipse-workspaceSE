package com.itwill.review;

public class AService {
	//변수 선언
	private int member1;
	private int member2;
	private int member3;
	private int member4;
	
	
	///멤버 메소드
		public void a() {
			System.out.println("a()메소드 실행");
			return;   //생략 가능
		}
		
		public void b(int no) {
			System.out.println("b(int no)메소드 실행:인자데이터 "+no);

		}
		
		public void c(int no,String name) {
			System.out.println("c(int no,String name)메소드 실행:인자데이터 "+no+" "+name);

		}
		
		public void d(int no,String name,char c) {
			System.out.println("c(int no,String name,char c)메소드 실행:인자데이터 "+no+" "+name+" "+c);
			
		}

		public void e(int no, String name, int kor, int eng, int math) {
			// TODO Auto-generated method stub
			
		}

		public void f(Student student) {
			System.err.println("f(Student student) 인자:"+student);
			System.err.println(student.no);
			System.err.println(student.name);
			System.err.println(student.kor);
			System.err.println(student.eng);
			System.err.println(student.math);
		
			
		}
		

}

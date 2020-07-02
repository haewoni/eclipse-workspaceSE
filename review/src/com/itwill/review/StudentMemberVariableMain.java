package com.itwill.review;

//메인 메소드 메커니즘 외우기
public class StudentMemberVariableMain {
	public static void main(String[] xxx/*식별자 변경가능*/)  {
		//학생 데이터 담기. 지역변수(로컬변수)
		int no;
		String name;
		int kor,eng,math,tot;
		char grade;
		
		//변수 초기화.리터럴
		no = 1;
		name = "신혜원";
		kor=89;
		eng=97;
		math=88;
		tot=kor+eng+math;
		grade='A';
		System.out.println(no);
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(tot);
		System.out.println(grade);
		System.out.println("----------------------------------");
		//출력
		System.out.println(no);
		System.out.println(grade);
		System.out.println(name);
		
		//객체생성. 인스턴스
		 Student st1 = new Student();
		 st1.no=111;
		 st1.kor=78;
		 st1.eng=67;
		 st1.math=99;
		 st1.tot=st1.kor+st1.eng+st1.math;
		 st1.grade='A';
		 st1.name="김수한";
		 
		 System.out.println(st1.no);
		 System.out.println(st1.name);
		 System.out.println(st1.kor);
		 System.out.println(st1.eng);
		 System.out.println(st1.tot);
		 System.out.println(st1.grade);
		
		
	}

}

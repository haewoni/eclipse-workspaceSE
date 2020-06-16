package com.itwill00.member_field;



public class StudentMemberFieldMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(2명)
		 */
		
	
		/*
		 학생객체데이타(번호,이름,국어,영어,수학)입력(2명)
		 */
		Student stud1 = null;
		stud1 = new Student();
		stud1.no = 1;
		stud1.name = "TOM";
		stud1.kor = 55;
		stud1.eng = 83;
		stud1.math = 60;
		
		Student2 stud2 = null;
		stud2 = new Student2();
		stud2.no = 2;
		stud2.name = "ALEX";
		stud2.kor = 90;
		stud2.eng = 48;
		stud2.math = 66;
		
		
		/*
		 학생총점,평균,평점계산후 멤버변수에 대입
		 */
		stud1.tot = (stud1.kor+stud1.eng+stud1.math);
		stud2.tot = (stud2.kor+stud2.eng+stud2.math);
		stud1.avg = (stud1.tot/3);
		stud2.avg = (stud2.tot/3);

		
		
		/*
		 * 학생데이타 출력
		 */
		
		System.out.println("---------------학생 성적출력------------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s\n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("----------------------------------------------");
		System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
				           stud1.no,stud1.name,stud1.kor,stud1.eng,stud1.math,334,34.88,'A',0);
		System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
				2,"ALEX", 45, 56,78,334,34.88,'A',0);
		System.out.println("----------------------------------------------");
	}

}

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
		stud1.eng = 82;
		stud1.math = 90;
		stud1.rank = 1;
		
		Student stud2 = null;
		stud2 = new Student();
		stud2.no = 2;
		stud2.name = "ALEX";
		stud2.kor = 89;
		stud2.eng = 48;
		stud2.math = 59;
		stud2.rank = 2;
		
		/*
		 학생총점,평균,평점계산후 멤버변수에 대입
		 */
		stud1.tot = (stud1.kor+stud1.eng+stud1.math);
		stud2.tot = (stud2.kor+stud2.eng+stud2.math);
		
		stud1.avg = (double)stud1.tot/3;
		stud2.avg = (double)stud2.tot/3;
		
		switch ((int)stud1.avg/10 ) {
		case 9:
			stud1.grade = 'A';
			break;
		case 8:
			stud1.grade = 'B';
			break;
		case 7:
			stud1.grade = 'C';
			break;
		case 6:
			stud1.grade = 'D';
			break;
		default: stud1.grade = 'F';
			break;
		}
		switch ((int)stud2.avg/10 ) {
		case 9:
			stud2.grade = 'A';
			break;
		case 8:
			stud2.grade = 'B';
			break;
		case 7:
			stud2.grade = 'C';
			break;
		case 6:
			stud2.grade = 'D';
			break;
		default: stud2.grade = 'F';
		break;
		}

		
		
		/*
		 * 학생데이타 출력
		 */
		
		System.out.println("---------------학생 성적출력------------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s\n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("----------------------------------------------");
		System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
				           stud1.no,stud1.name,stud1.kor,stud1.eng,stud1.math,stud1.tot,stud1.avg,stud1.grade,stud1.rank);
		System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
				stud2.no,stud2.name,stud2.kor,stud2.eng,stud2.math,stud2.tot,stud2.avg,stud2.grade,stud2.rank);
		System.out.println("----------------------------------------------");
	}

}

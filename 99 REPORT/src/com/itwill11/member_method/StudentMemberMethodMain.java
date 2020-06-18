package com.itwill11.member_method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student stud1 = new Student();
		Student stud2 = new Student();
		Student stud3 = new Student();
		
		/*
		 * ???????석차 구하기
		 */
		
		/*
		 학생객체데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		stud1.info(1,"TOM",65,87,90);
		stud2.info(2,"ALEX",95,70,55);
		stud3.info(1,"BEN",60,80,40);
		
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		stud1.calTot();
		stud2.calTot();
		stud3.calTot();
		
		stud1.calAvg();
		stud2.calAvg();
		stud3.calAvg();
		
		stud1.calGrade();
		stud2.calGrade();
		stud3.calGrade();
		
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stud1.print();
		stud2.print();
		stud3.print();
		
	  }
   }		
		
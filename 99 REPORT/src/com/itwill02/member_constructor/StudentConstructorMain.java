package com.itwill02.member_constructor;



public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  -1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student stud1 = new Student();
		stud1.setStudentData(01, "Alex", 90, 95, 85);
		Student stud2 = new Student(02,"Tom",89,70,95);
		Student stud3 = new Student(03,"Sam",43,95,88);
		
		
		
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
		 */
		
		stud1.calculateTotal();
		stud2.calculateTotal();
		stud3.calculateTotal();
		
		stud1.calculateAvg();
		stud2.calculateAvg();
		stud3.calculateAvg();
		
		stud1.calculateGrade();
		stud2.calculateGrade();
		stud3.calculateGrade();
		
		
	
		/*
		 * 학생데이타3명 출력메쏘드 호출
		 */
		stud1.headerPrint();
		stud1.print();
		stud2.print();
		stud3.print();
		
		
		/*
		 * 학생 student1 의 이름변경
		 * 
		 * 학생 student1 의 총점데이타 반환받은후 출력
		 * 
		 * 학생 student2 의 학점데이타 반환받은후 출력
		 */
		System.out.println("---------------------------------------------------------------------");
		
		/*
		stud1.setName("Alexa");
		System.out.println(stud1.getName());
		*/
		stud1.setName("Alexa");
		
		char stud2Grade = stud2.getGrade();
		System.out.println(stud2Grade);
		
		
		
		/*
		 
		System.out.println(stud1.getTot());
		
		stud2.getGrade();
		System.out.println(stud2.getGrade());
		*/

	}

}

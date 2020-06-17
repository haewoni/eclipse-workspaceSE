package com.itwill11.member_method;

/*
 * 성적처리를위해 필요한 학생객체를 만들기 위한 클래스
 */
public class Student {
	/*
	 * << 속성 >>
	 */
	private String name;
	private int no, kor, eng, math, tot, rank;
	private char grade;
	private double avg;


	/*
	 * << 기능 >>
	 */

    
	public void info(int no, String name, int kor, int eng, int math) {
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.rank = rank;
		this.grade = grade;
		this.avg = avg;
	}

	public void calTot() {
		this.tot = (this.kor + this.eng + this.math);
	}

	public void calAvg() {
		this.avg = (double) this.tot / 3;
	}

	public void calGrade() {
		switch ((int)this.avg/10 ) {
		case 9:
			this.grade = 'A';
			break;
		case 8:
			this.grade = 'B';
			break;
		case 7:
			this.grade = 'C';
			break;
		case 6:
			this.grade = 'D';
			break;
		default: this.grade = 'F';
		break;
		}
		
	}

	public void print() {
		System.out.printf("%s %s %s %s %s %s %s %s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.println("----------------------------------------------");
		System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n", no, name, kor, eng, math, tot, avg, grade, rank);
		System.out.println("----------------------------------------------");

	}

}

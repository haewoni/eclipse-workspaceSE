package practice;

public class Student {

	/*
	 * << 속성 >> 번호 이름 국어 영어 수학 총점 평균 평점 석차 << 기능 >> 데이타입력,총점계산,평균계산,평점계산, 출력
	 */

	// 멤버변수 선언
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	private int rank;

	// 멤버메쏘드 선언
	public void info(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	public void calTot() {
		this.tot = (this.eng + this.math + this.kor);

	}

	public void calAvg() {
		this.avg = (double) this.tot / 3;
	}

	public void calGrade() {
		switch ((int) this.avg / 10) {
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
		default:
			this.grade = 'F';
			break;
		}
	}

	public void print() {
		System.out.println("%s %s %s %s %s %s %s %s %n", );
		System.out.printf("%d %s %d %d %d %d %.1f %s %n", 
				this.no, this.name, this.kor, this.eng, this.math, this.tot, this.avg, this.grade);
	}

}

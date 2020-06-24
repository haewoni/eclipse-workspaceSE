
public class IfNested {

	public static void main(String[] args) {

		int kor = 89;
		char grade = ' ';
		/*
		 * 점수의유효성체크
		 */
		if (kor < 0 || kor > 100) {
			System.out.println("점수는 0~100 사이의 정수입니다.");
			return;//주실행흐름이 JVM으로 return시점에서 되돌아간다
		}

		/*
		 * 평점계산
		 */

		if (kor >= 90) {
			grade = 'A';
		} else {
			if (kor >= 80) {
				grade = 'B';
			} else {
				if (kor >= 70) {
					grade = 'C';
				} else {
					if (kor >= 60) {
						grade = 'D';
					} else {
						grade = 'F';
					}
				}
			}
		}

		System.out.printf("1.당신의학점은 %c 입니다.\n", grade);
		
		if(kor>=90) {
			grade='A';
		}else if (kor>=80) {
			grade='B';
		}else if (kor>=70) {
			grade='C';
		}else if (kor>=60) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.printf("2.당신의학점은 %c 입니다.\n", grade);
		
		
		return;
	}

}

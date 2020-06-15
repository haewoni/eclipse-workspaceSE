
public class IfNested {

	public static void main(String[] args) {

		int kor = -45;
		char grade = ' ';
		/*
		 * 점수의 유효성 체크
		 */
		if ((kor < 0) || (kor > 100)) {
			System.out.println("점수는 0~100 사이의 정수입니다.");
			return;

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
		System.out.printf("1. 당신의 학점은 %c 입니다.", grade);
		if (kor >= 90) {
			grade = 'A';
		} else if (kor >= 80) {
			grade = 'B';
		} else if (kor >= 70) {
			grade = 'C';
		} else if (kor >= 60) {
			grade = 'D';
		} else if (kor >= 50) {
			grade = 'F';
		}

	}
}

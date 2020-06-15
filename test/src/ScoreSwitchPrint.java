
public class ScoreSwitchPrint {

	public static void main(String[] args) {
		/*
		 * 학생2명 데이타를 담을변수선언
		 */
		int no1, no2;
		String name1, name2;
		int kor1, kor2;
		int eng1, eng2;
		int math1, math2;
		int tot1, tot2;
		double avg1, avg2;
		char grade1, grade2;
		int rank1, rank2;

		/*
		 * 학생2명 기본데이타대입 학번,이름,국어,영어,수학
		 */
		no1 = 1;
		no2 = 2;
		name1 = "TOM";
		name2 = "ALEX";
		kor1 = 80;
		kor2 = 43;
		eng1 = 56;
		eng2 = 53;
		math1 = 78;
		math2 = 76;
		rank1 = 2;
		rank2 = 3;

		/*
		 * 국어,영어,수학점수의 유효성체크 - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하세요 - 유효하지않은 데이타가 입력되면 프로그램종료
		 */
		if ((kor1 > 100) || (kor1 < 0) || (kor2 > 100) || (kor2 < 0) || (eng1 > 100) || (eng1 < 0) || (eng2 > 100)
				|| (eng2 < 0) || (eng2 > 100) || (eng2 < 0) || (math1 > 100) || (eng2 < 0)) {
			System.out.println("점수는 0~100 사이의 숫자입니다");
			return;
		}

		/*
		 * 학생 2명 기본 데이터(번호,이름,국어,영어,수학)를 이용해서 총점,평균,평점 계산 후 대입
		 */
		tot1 = kor1 + eng1 + math1;
		tot2 = kor2 + eng2 + math2;
		avg1 = (double) tot1 / 3;
		avg2 = (double) tot2 / 3;

	

		switch ((int) avg1 / 10) {
		case 9:
			grade1 = 'A';
			break;
		case 8:
			grade1 = 'B';
			break;
		case 7:
			grade1 = 'C';
			break;
		case 6:
			grade1 = 'D';
		default:
			grade1 = 'F';
			break;
		}

		
		switch ((int) avg2 / 10) {
		case 9:
			grade2 = 'A';
			break;
		case 8:
			grade2 = 'B';
			break;
		case 7:
			grade2 = 'C';
			break;
			
		case 6:
			grade2 = 'D';
		default:
			grade2 = 'F';
			break;
		}

		/*
		 * - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하세요 - 출력포맷 - 평균은 소수점이하 2째자리수에서 반올림하세요(casting
		 * 활용)[옵션] - 석차는 구하지마세요
		 * 
		 * 
		 * 학생 2명 성적 출력 출력포맷 ---------------학생 성적출력------------------- 학번 이름 국어 영어 수학 총점
		 * 평균 평점 석차 ----------------------------------------------- 1 김경호 45 56 78 334
		 * 34.8 A 0 2 김경수 45 56 78 334 34.8 A 0
		 * -----------------------------------------------
		 */
		System.out.println("--------------학생 성적출력---------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.println("-------------------------------------");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %2c %3d\n", no1, name1, kor1, eng1, math1, tot1, avg1, grade1,
				rank1);
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %2c %3d\n", no2, name2, kor2, eng2, math2, tot2, avg2, grade2,
				rank2);

	}
}

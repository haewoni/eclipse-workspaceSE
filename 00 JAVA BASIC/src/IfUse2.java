
public class IfUse2 {

	public static void main(String[] args) {
		/*
		 * 짝수, 홀수판별
		 */
		int inputNo = 11;
		if(inputNo%2==0) {
			System.out.println(inputNo+"는 짝수입니다");
		} else {
			System.out.println(inputNo+"는 홀수입니다");
		}
		/*
		 * 4의배수판별
		 */
		if(inputNo%4==0) {
			System.out.printf("%d 는 4의 배수\t입니다\n",inputNo);
		} else {
			System.out.printf("%d 는 4의 배수가\t아닙니다\n",inputNo);
		}
		/*
		 * 공배수
		 */
		int number=12;
		if(number%3==0 && number%4==0 ) {
			System.out.printf("%d 는 3의 배수이면서 4의 배수입니다\n", number);
		/* 
		* 점수의 유효성체크
		*/
		int kor=90;
		if(kor>=0 && kor<=100) {
			System.out.printf("%d 은 유효한 점수입니다",kor);
		} else {
			System.out.printf("%d 은 유효한 점수가 아닙니다",kor);
		}
		
		/*
		 * 윤년여부출력(if문)
		 */
		
		/*
		 * 문자판단
		 *   1.한글여부
		 *   2.알파벳대문자
		 *   3.소문자
		 *   4.숫자 형태의 문자('1','0'등)
		 *   
		 * 아이디 첫글자의 유효성 판단(if)
		 *   1.아이디의 첫글자는 알파벳 대문자, 소문자만 가능
		 */
	
			
	}


  }
}
	

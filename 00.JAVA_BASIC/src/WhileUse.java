
public class WhileUse {

	public static void main(String[] args) {
		/*
		 * 1~10사이의 정수출력
		 */
		int i=0;
		while (i < 10) {
			int su = i+1;
			System.out.print(su+",");
			i++;
		}
		System.out.println();
		/*
		 * 1~10사이의 정수중 홀수만출력
		 */
		int j=0;
		while(j<10) {
			int su=j+1;
			if(su%2==1) {
				System.out.print(su+",");
			}	
			j++;
		}
		System.out.println();
		/*
		 * 1~10사이의 정수중 4의배수만출력
		 */
		int k=0;
		while(k<10) {
			int su=k+1;
			if(su%4==0) {
				System.out.print(su+",");
			}
			k++;
		}
		System.out.println();
		/*
		 * 1~100 사이의 정수중 3과4의배수만출력
		 */
		int l=1;
		while(l <= 100) {
			if(l%3==0 && l%4==0) {
				System.out.print(l+",");
			}	
			l++;
		}
		System.out.println();
		/* Quiz:
		 * 1 ~ 2020 년사이의 년도중 윤년만 출력
		 */
		
		/*
		 * 1~100사이의 정수합
		 * 1~100사이의 정수중 홀수합(Quiz)    
		 * 1~100사이의 정수중 짝수합(Quiz)    
		 */
		int tot = 0;
		int oddTot=0;
		int evenTot=0;
		int m = 1;
		while(m <= 100) {
			//tot = tot + m;
			tot += m;//연산후대입연산자
			if(m%2==0) {
				evenTot+=m;
			}else {
				oddTot+=m;
			}
			m++;
		}
		System.out.println("1~100사이의 정수합:"+tot);
		System.out.println("1~100사이의 홀수합:"+evenTot);
		System.out.println("1~100사이의 짝수합:"+oddTot);
		/*
		 * 문자출력
		 *  대문자
		 *  
		 *  ABCDEF\n
		 *  GHIJKL
		 *  MNOP..
		 */
		char c1='A';
		int count1=0;
		while(c1 <= 'Z') {
			System.out.print(c1+" ");
			c1++;
			count1++;
			if(count1%5==0) {
				System.out.print("\n");
				//System.out.println();
			}
		}
		System.out.println();
		/*
		 * 숫자형문자
		 */
		char c2='0';
		
		while(c2<='9') {
			System.out.print(c2+" ");
			c2++;
		}
		
		System.out.println();
		/*
		 * 한글출력
		 */
		char c3='가';
		int count3=0;
		while(c3<='힣'){
			System.out.print(c3);
			c3++;
			count3++;
			if(count3%30==0) {
				System.out.println();
			}
		}
		System.out.println();
	}

}









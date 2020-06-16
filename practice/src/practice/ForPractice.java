package practice;

public class ForPractice {

	public static void main(String[] args) {
		{
			int k = 0;
			while (k < 10) {
				System.out.println("k=" + k);
				k++;
			}
		}
		System.out.println("----while---");
		int k = 0;
		while (k < 0) {
			System.out.println("k=" + k);
			k++;
		}
		System.out.println("----for i증가----");
		for (int i = 0; i < 10; i++) {
			System.out.println("i=");
		}
		System.out.println("-----for i 감소----");
		for (int i = 10; i > 0; i--) {
			System.out.println("i=");
		}
		System.out.println("------홀수출력 1~10------");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.printf("%d,", i);
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("-----홀수짝수합 1~100-----");
		int tot = 0;
		int evenTot = 0;
		int oddTot = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenTot += i;
			} else {
				oddTot += i;
			}
			tot += i;
		}
		System.out.println("홀수합:" + oddTot);
		System.out.println("짝수합:" + evenTot);
		System.out.println("홀수합:" + tot);
		
		System.out.println();
		
		System.out.println("--------문자출력------"); /////?실행순서
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			if (c == 'z') {
				continue;
			}
			System.out.print(",");
		}

		System.out.println();
		System.out.println("--------3과 4의 최소공배수-------");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println("i=" + i);
				break;
			}
		}

	}
}

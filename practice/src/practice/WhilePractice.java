package practice;

public class WhilePractice {
	public static void main(String[] args) {

		int i = 1;
		while (i < 10) {
			int j = 2;
			while (j < 10) {

				System.out.printf("%d*%d=%2d\t", j, i, i * j);
				j++;
			}
			System.out.println();
			i++;

		}

	}
}
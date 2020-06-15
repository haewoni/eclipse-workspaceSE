package practice;

public class SwitchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char medalColor;
		int rank = 2;
		
		switch (rank) {
		case 1 :
			medalColor = 'G';			
			break;
		case 2 :
			medalColor = 'S';			
			break;
		case 3 :
			medalColor = 'B';			
			break;

		default:
			medalColor = 'A';
			break;
		}
		
		System.out.println(medalColor);

	}

}

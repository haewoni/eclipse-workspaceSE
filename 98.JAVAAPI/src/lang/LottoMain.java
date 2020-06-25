package lang;

public class LottoMain {

	public static void main(String[] args) {
	
		int[] lottoNo=new int[6];  
		
		for (int i = 0; i < lottoNo.length; i++) {
			//중복체크
			System.out.println("count:"+i);
			lottoNo[i] = (int)(Math.random()*45)+1;
		}
		for (int i = 0; i < lottoNo.length; i++) {
			System.out.print(lottoNo[i]+" ");
		}

	}

}

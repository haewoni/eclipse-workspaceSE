
/*
 * 형변환(Casting)
 */

public class TypeCasting {

	public static void main(String[] args) {
		byte b = (byte)127;  //예외 - 정수형 리터럴일때
		short s = (short)32767; //예외
		char c = 'A';
		int i = 2147483647;
		long l = 2147483648L;
		float f = 3.14f;  // = (float)3.14
		double d = 3.14;
		
		/*
		 * 자동 형변환
		 */
		double dr = b;
		dr=s;
		dr=c;
		dr=i;
		dr=l;
		dr=f;
		
		/*
		 * 강제(명시적)형변환
		 */
		int iresult = (int)1;
		System.out.println("long--> int casting : "+iresult);
		iresult = (int)f;
		System.out.println("float--> int casting : "+iresult);
		iresult = (int)d;
		System.out.println("double--> int casting : "+iresult);
		
		double davg = 85.665;
		System.out.println(davg);
		int iavg = (int)davg;
		System.out.println(iavg);
		
		/*
		 * 연산시 형변환
		 * - 연산항 중 가장 큰 타입으로 모든 항이 형변환 된다.
		 */
		double dresult = 23 + 0.1 + 90 + 's';
		
		int tot = 61 + 42 + 81;
		System.out.println("tot"+tot);
		double avg = tot/3.0;
		System.out.println("avg"+avg);
		
		System.out.println("------------연산시의 형변환 예외(byte,short)-------------");
		byte bb=90;
		short ss=89;
		int ii=78;
		long ll=90;
		
		long llresult= bb+ss+ii+ll;
		System.out.println("long-->"+llresult);
		
		int ssresult = bb+ss;
		System.out.println("byte,short의 연산은 모든 항이 int로 형변환 후 연산된다"+ssresult);
		
		
	}

}

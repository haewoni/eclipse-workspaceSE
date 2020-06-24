/*
		형변환(Casting)--> 숫자형데이타간에만 가능
		
		    - 형식 :  (데이타타입)변수or숫자형리터럴;
		    
		    - 자동(묵시적)형변환(작은데이타-->큰데이타) upcasting
			     byte-->short-->int-->long-->float-->double
			     
		    - 강제(명시적)형변환(큰데이타-->작은데이타) downcasting
			     double-->float-->long-->int-->short-->byte
*/
public class TypeCasting {

	public static void main(String[] args) {
		
		byte b =127;
		short s =32767;
		char c='A';
		int i=2147483647;
		long l=2147483648L;
		//float f = (float)3.14;
		float f = 3.14f;
		double d=3.14;
		
		/*
		 * 자동형변환
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
		int iresult = (int)l;
		System.out.println("long --> int casting : "+iresult);
		iresult=(int)f;
		System.out.println("float --> int casting : "+iresult);
		iresult=(int)d;
		System.out.println("double --> int casting : "+iresult);
		
		double  davg = 85.665;
		System.out.println(davg);
		int iavg =(int)davg;
		System.out.println(iavg);
		
		/*
		 * 연산시의 형변환
		 *   -연산항들중에 가장큰타입으로 모든항이 형변환된다.
		 */
		
		double dresult = 23 + 0.1+ 90 + 's';
		
		int tot = 61 + 42 + 81;
		System.out.println("tot:"+tot);
		double avg = tot/3.0;
		System.out.println("avg:"+avg);
		
		
		System.out.println("----------연산시의 형변환예외(byte,short)------------");
		byte bb=90;
		short ss=89;
		int ii=78;
		long ll=90;
		
		long llresult = bb+ss+ii+ll;
		System.out.println("long-->"+llresult);
		
		int ssresult = bb+ss;
		System.out.println("byte,short의연산은 모든항이 int 로형변환후 연산된다");

	}

}









public class VariableTypes {

	public static void main(String[] args) {
		/*
		 * 논리형
		 * 	 - 논리형리터럴(true,false)
		 */
		boolean bool1,bool2,bool3;
		bool1 = true;
		bool2 = false;
		/*
	    Type mismatch: cannot convert from char to boolean
		bool3 = 'A';
		*/
		System.out.println(bool1);
		System.out.println(bool2);
		
		
		/*
		 * 문자형
		 *  - 문자형리터럴('A','가'...)
		 */
		char munja1,munja2,munja3,munja4,munja5,munja6,munja7;
		munja1 = 'A';
		munja2 = '힣';
		munja3 = 65; 

		int intAny  = 65;
		//char char65= intAny;
		
		int  munja33 = 65;
		munja4 = 44032;
		munja5 = '\u0041';
		munja6 = '\uac00';
		munja7 = munja1;
		
		
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja33);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println(munja6);
		System.out.println(munja7);
		
		
		
		/*
		 *숫자 : 정수형
		 *  - 정수형리터럴(1,34,777)
		 */
		byte b;
		short s;
		int i;
		long l;
		
		b = 127;
		s = 32767;
		i = 2147483647;
		l = 2147483648L;
		
		/*
		 *숫자 : 실수형
		 *	 - 실수형리터럴(1.0, .1 , 3.1415)
		 */
		float f;
		double d;
		
		f = 3.14159F;
		d = 3.14159;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		System.out.println("-----------문자열형------------");
		String str1;
		str1 = "오늘은";
		String str2="수요일";
		String str3="변수를 공부합니다.";
		
		int month = 6;
		int day = 10;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String message = str1+" "+month+"월 "+day+"일 "+str2+" "+str3;
		
		
		System.out.println(message);
		
		
		
		
		
		
		
		
		
	}

}










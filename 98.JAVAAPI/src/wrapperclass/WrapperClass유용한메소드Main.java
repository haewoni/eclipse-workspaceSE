package wrapperclass;

public class WrapperClass유용한메소드Main {

	public static void main(String[] args) {
		int y = 214748647;
		String yStr = Integer.toString(y);
		System.out.println("int--> String");
		System.out.println(yStr);
		String yStr2 = y+"";
		System.out.println(yStr2);
		String yStr3 = Integer.toBinaryString(y);
		System.out.println(yStr3);
		
		System.out.println("String---> 기본형");
		int i = Integer.parseInt("23445534");
		System.out.println(i);
		double d = Double.parseDouble("3.14159");
		System.out.println(d);
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		/*
		 * 연산자 오버로딩( + )
		 *   - 연산항이 문자열일 경우에 concatenate(연관시키다, 연쇄)
		 */
		int number = 4545;
		String numStr = number+"";
		System.out.println(numStr);
		String numStr2 = 1+2+3+"4";
		System.out.println(numStr2);
		String numStr3 = "1"+2+3+4;
		System.out.println(numStr3); //연산결과는 () 붙이기
		double dNumber = 3.14159;
		String numStr4 = dNumber+"";
		for (int j = 0; j < numStr4.length(); j++) {
			char tc = numStr4.charAt(j);
			System.out.println(tc+"");
		}
		System.out.println();
		System.out.println("------------Character--------------");
		Character wc1 = new Character('김');
		Character wc2 = '김';
		char c1 = wc1.charValue();
		char c2 = wc2.charValue();
		int  i3 = wc2;
		
		System.out.println("------------------String--->char,car[]");   //스트링에서 캐릭터,캐릭터배열로 바꾸는 작업 빈번
		char fc = "김경호".charAt(0);
		System.out.println(fc);
		/*
		String s1 = "김";
		char s2 = '김';
		*/
		char[] ca = "오늘은 비오는 일요일 강사는 아침부터 지랄을 하고"
		.toCharArray();
		for (int j = 0; j < ca.length; j++) {
			System.out.println(ca[j]+" , ");
		}
		System.out.println();
		
		System.out.println("------------------char,car[]--->String");
		char c90 = '김';
		String s90 = String.valueOf(c90);
		String s91 = c90+"";
		
		char[] c92 = {'J','A','V','A'};
		String s92 =  new String(c92);
		String s93 = String.valueOf(c92);
		System.out.println(s92);
		System.out.println(s93);
		
		String strs = "Hello Java####**!@#@!$123 한글 ";
		
		for (int j = 0; j < strs.length(); j++) {
			char tc = strs.charAt(j);
			int type = Character.getType(tc);
			System.out.println("------------>type:"+type);
			if(type==Character.UPPERCASE_LETTER) {
				System.out.println("UPPERCASE_LETTER:"+tc);
			}
			if(type==Character.LOWERCASE_LETTER) {
				System.out.println("LOWERRCASE_LETTER:"+tc);
			}
			if(type==Character.DECIMAL_DIGIT_NUMBER) {
				System.out.println("DECIMAL_DIGIT_NUMBER:"+tc);
			}
			if(type==Character.SPACE_SEPARATOR) {
			}
			
			if(Character.isSpaceChar(tc)) {
				System.out.println("Character.isSpaceChar"+tc);
				
			}
			if(Character.isAlphabetic(tc)) {
				System.out.println("Character.isAlphabetic"+tc);
				
			}
			if(Character.isDigit(tc)) {
				System.out.println("Character.isDigit"+tc);  
				
			}
		}
		
	}

}

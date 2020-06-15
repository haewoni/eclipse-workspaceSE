
public class RelationalOperator {

	public static void main(String[] args) {
	    /*
	            관계(비교)연산
	       - 형태: >, < , >=, <=, ==, !=
	       - 관계연산의 결과값은 논리형 데이터이다 (true,false)
	     */
		
		int a = 10;
		int b = 20;
		boolean result;
		
		result = a > b;
		System.out.println(result);
		result = a < b;
		System.out.println(result);
		result = a >= b;
		System.out.println(result);
		result = a <= b;
		System.out.println(result);
		result = a == b;
		System.out.println(result);
		result = a != b;
		System.out.println(result);
		char c1='가';
		char c2='R';
		char c3='A';
		char c4='B';
		result = c1 < c2;
		System.out.println(result);
	    System.out.println((int)c1);
	    System.out.println((int)c2);
        result = c3 < c4;
	    System.out.println(result);
	}

}

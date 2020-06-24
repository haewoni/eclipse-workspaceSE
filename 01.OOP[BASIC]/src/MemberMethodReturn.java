
public class MemberMethodReturn {
	
	int method1() {
		System.out.println("MemberMethodReturn.method1()실행");
		int result = 2 + 9;
		/*
		 * - 실행흐름을 호출한곳으로반환
		 * - 실행흐름을 호출한곳으로데이타반환
		 * - return 할데이타가있는 경우에는 return문 반드시기술하여야 한다 
		 */
		return result;
	}
	boolean isMarried() {
		System.out.println("MemberMethodReturn.isMarried()실행");
		return false;
	}
	
	int add(int a,int b) {
		int r=a+b;
		return r;
	}
	
}

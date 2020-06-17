
public class MemberMethodReturn {
	int method1() {
		
		int result = 2 + 9;
		/*
		 * - 실행흐름을 호출한 곳으로 반환
		 * - 실행흐름을 호출한 곳으로 데이터 반환
		 * - return 할 데이터가 있는 경우에는 return문을 반드시 기술
		 */
		
		
		return result;
		
	}
	boolean isMarried() {
		return false;
	}
	
	int add(int a,int b) {
		int r=a+b;
		return r;
	}
	

}

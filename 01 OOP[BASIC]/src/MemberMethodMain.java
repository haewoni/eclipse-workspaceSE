
public class MemberMethodMain {

	public static void main(String[] args) {
		MemberMethod mm= new MemberMethod();
		/*
		 * 멤버필드 접근
		 * 참조변수.멤버필드이름
		 */
		mm.member1=457676;
		/*
		 * 멤버메소드 실행(호출)
		 * 참조변수, 메소드이름()
		 */
		System.out.println("main흐름 start");
		System.out.println("main흐름1");
		/*
		 * 멤버메소드실행(호출)
		 *   -형식: 참조변수, 메소드이름()
		 *   -mm객체의 method1 메소드블럭을 실행하기 위해 main 실행 흐름을 method1 블록으로 보낸다
		 */
		
		mm.method1();
		System.out.println("main흐름2");
		mm.method2(3);
		System.out.println("main흐름3");
		mm.method3("김경호는 잘생겼다.",10);
		mm.method3("김경호는 못생겼다.",3);
		
		
		System.out.println("main흐름4");
		mm.method4("김경호","안녕하세요",2);
		mm.method4("김태희","뭐하세요!!!",3);
		
		System.out.println("main흐름 end");
		return;

	}
	

}

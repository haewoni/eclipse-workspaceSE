
public class MemberMethodMain {

	public static void main(String[] args) {
		MemberMethod mm=new MemberMethod();
		/*
		 * 멤버필드접근
		 *  참조변수.멤버필드이름
		 */
		mm.member1=457676;
		
		System.out.println("main흐름 start");
		System.out.println("main흐름1");
		/*
		 * 멤버메쏘드실행(호출)
		 *  - 형식:참조변수.메쏘드이름()
		 *  - mm객체의 method1메쏘드 블록을 실행하기위해
		 *    main실행흐름을 method1블록으로 보낸다
		 */
		mm.method1();
		System.out.println("main흐름2");
		mm.method2(3);
		System.out.println("main흐름3");
		mm.method3("김경호는 잘생겼다.", 10);
		mm.method3("김경호는 못생겼다.", 3);
		System.out.println("main흐름4");
		mm.method4("김경호", "안녕하세요", 2);
		mm.method4("김태희", "뭐하세요!!!", 3);
		
		System.out.println("main흐름5");
		
		
		System.out.println("main흐름 end");
		return;
	}

}

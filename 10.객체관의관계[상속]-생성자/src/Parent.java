
public class Parent extends Object {
	public int member1;
	public int member2;
	public Parent() {
		/*
		 * - 클래스의 생성자 첫번째 라인에서는
		 *   반드시 부모 클래스의 생성자가 호출 되어야한다.
		 * - 부모클래스의 생성자를 호출하지 않을 시에는
		 *   부모의 기본 생성자가 자동으로 호출된다. --->super();
		 * - 부모클래스의 기본 생성자 호출은 생략 가능하다.
		 */
		super();
		System.out.println("Parent() 기본 생성자");
	}
	
	public Parent(int member1, int member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
		System.out.println("Parent(int member1, int member2)생성자");
	}

	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}

}

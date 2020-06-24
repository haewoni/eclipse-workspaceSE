
public class Child extends Parent {
	public int member3;

	public Child() {
		/*
		 * - 클래스의 생성자 첫번째 라인에서는
		 *   반드시 부모 클래스의 생성자가 호출 되어야한다.
		 * - 부모클래스의 생성자를 호출하지 않을 시에는
		 *   부모의 기본 생성자가 자동으로 호출된다. --->super();
		 * - 부모클래스의 기본 생성자 호출은 생략 가능하다.
		 */
		super();
		System.out.println("Child() 디폴트 생성자");
	}

	public Child(int member1, int member2, int member3) {
		//super() 두 번 호출하면 에러
		super(member1, member2);
		this.member3 = member3;
		System.out.println("Child(int member1, int member2, int member3)호출");
	}

	public void method3() {
		System.out.println("Child.method3()");
	}

}

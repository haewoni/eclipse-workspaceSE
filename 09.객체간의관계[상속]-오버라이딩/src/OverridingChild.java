
public class OverridingChild extends Overriding {
	/*
	 * public void method1() {
		System.out.println("Overriding.method1()");
	}
	public void method2() {
		System.out.println("Overriding.method2()");
	}
	 */
	public void method2() {
		System.out.println("-----재정의 method2 start-----");
		System.out.println("Overriding.method2()를 OverridingChild에서 재정의");
		System.out.println(this.toString());
		System.out.println(super.toString());
		super.method2();
		/*
		 * super: this와 같은 self 참조변수
		 *       - this와 같은 주소를 가리킨다.
		 *       - 상속 받은 재정의된 은폐된 메소드를 호출할 때 사용
		 *       - 같은 주소 내에서만 가능
		 */
		/*
		 * 상속 받은(부모) method2는 은폐되고, (Child의)재정의 된 메소드만 호출
		 */
		System.out.println("-----재정의 method2 end-----");
	}
	public void method3() {
		System.out.println("OverridingChild.method3()");
	}
	

}

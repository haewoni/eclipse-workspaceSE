/*
 객체의 형변환
   1. 부모-자식 관계에 있는 클래스 틀에서만 가능하다.
   
   2. 자식객체를 부모클래스 타입으로 형변환
       - 자동으로 이루어진다(묵시적)
       Child c = new Child();
       Parent pppp = c; 
       
   3. 부모 객체를 자식 클래스타입으로 형변환
       - 원칙적으로는 불가능하다
       - 부모의 탈을 쓴 자식객체 는 가능하다.
       Parent p=new Parent();
       Child cccc = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */

public class ParentChildObjectCastingMain {
	public static void main(String[] args) {
		System.out.println("-----------------CHILD-----------------");
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		c1.method5();
		/*
		 * 2. 자식객체를 부모클래스 타입으로 형변환 - 자동으로 이루어진다(묵시적) Child c = new Child(); Parent pppp
		 * = c;
		 */
		System.out.println("-------------Child-->Parent------------");
		Parent p1 = c1;
		p1.method1();
		p1.method2();
		/*
		 * 재정의 된 메소드는 Parent Type으로도 자식의 메소드 호출 가능   
		 */
		
		p1.method3();
		p1.method4();


		System.out.println("--------------Parent-->Child-----------");
		/*
		 * 3. 부모 객체를 자식 클래스타입으로 형변환 - 원칙적으로는 불가능하다
		 */
		Parent p2 = new Parent();
		// Child c2 =(Child)p2;

		// - 부모의 탈을 쓴 자식객체 는 가능하다.

		Parent p3 = new Child();
		Child c3 = (Child) p3;

	}

}

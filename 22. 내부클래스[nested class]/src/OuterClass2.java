
public class OuterClass2 {
	public static void main(String[] args) {
		OuterClass2 oc2 = new OuterClass2();
		//oc2.outer_class_method1();
		oc2.outer_class_method2();
	}
	
	public int outer_class_member_field;
	public void outer_class_method1() {
		AClassChild acc= new AClassChild();
		acc.print();
		BClassChild bcc = new BClassChild();
		bcc.method1();
		CIntefaceImpl cii = new CIntefaceImpl();
		cii.method_one();
		cii.method_two();
		
		Object oc = new Object() {
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "익명클래스 재정의된 toString";
			}
		}; 
		System.out.println(oc);
		
	}
	public void outer_class_method2() {
		/*
		 * 익명 로컬 이너클래스(anonymous local inner class)
		 */
		AClass acc = new AClass() {
			@Override
			public void print() {
				System.out.println("익명클래스에서 AClass.print() 재정의");
			}
		};
		
	}
	
	/***************member inner class 1*****************/
	public class AClassChild extends AClass{
		@Override
		public void print() {
			System.out.println("AClassChild에서 AClassChild.print() 재정의");
		}
	}
	
	/***************member inner class 2*****************/
	public class BClassChild extends BClass{
		@Override
		public void method1() {
			System.out.println("BClassChild BClass.method1() 재정의--구현");
			
		}
		
	}

	/************member inner class 3*****************/
	public class CIntefaceImpl implements CInterface{

		@Override
		public void method_one() {
			System.out.println("CIntefaceImpl에서 CInterface.method_one()재정의(구현)");
			
		}

		@Override
		public void method_two() {
			System.out.println("CIntefaceImpl에서 CInterface.method_two()재정의(구현)");
			
			
		}
		
	}
}

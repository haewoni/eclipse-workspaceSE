
public class OuterClass {
	public OuterClass() {
		// TODO Auto-generated constructor stub
	}
	private InnerClass ic;
	public int outer_member_field;
	public void outer_member_method() {
		System.out.println("OuterClass.outer_member_method()");
	}
	/************외부클래스에서 내부 클래스의 사용************/
	public void outer_inner_use() {
		/*
		 * InnerClass의객체 생성
		 */
		InnerClass innerObject = new InnerClass();
		this.ic = innerObject;
	}
	
	/*****Nested Class[Inner Class]*****/
	public class InnerClass{
		public int inner_member_field;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		/*
		 * 
		 * InnerClass의 사용 이유
		 *   - 내부 클래스(객체)에서 
		 *     외부클래스(객체)의 멤버의 접급을 손쉽게 하기 위해 사용
		 */
		
		 public void inner_outer_access() {
			 /*
			 OuterClass.this.outer_member_field = 758973;
			 OuterClass.this. outer_member_method();
			 */
			 outer_member_field = 758973;
			 outer_member_method();
		 }
		
	}
}

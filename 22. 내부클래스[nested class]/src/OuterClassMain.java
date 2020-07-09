
public class OuterClassMain {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.outer_member_field = 9090;
		oc.outer_member_method();
		
		OuterClass.InnerClass ic =  oc.new InnerClass();  //이너 클래스 객체 생성
		ic.inner_member_field=7878;
		ic.inner_member_method();
		
		
		

	}

}

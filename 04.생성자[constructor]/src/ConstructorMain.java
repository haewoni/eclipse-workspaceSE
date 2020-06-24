/*
생성자(constructor)
1. 클래스 이름과동일하며 리턴타입을 명시하지않는 메쏘드(???)
2. 하나의 클래스에는 반드시 하나이상의 생성자가 존재하여야한다
--> 생성자를 정의하지않을경우 컴파일러는 인자가하나도없는
    생성자[디폴트(기본) 생성자] 를 자동으로 넣어서 컴파일한다.    
3. 객체생성시 단한번 호출된다.
4. 주로 객체멤버변수 초기화의 용도로 사용한다.
5. 객체를 생성할려면 반드시 생성자를 호출하여야한다.
	
	-형태: 
	 	public class Test{
	 		//생성자의 정의(선언)
	 	    public Test(){
	 	    }
	 	}
	 	
    -사용: 
           Test t = new Test(); 
	 	   클래스명 참조변수이름 = new 클래스명();
	 	   new 라는 연산자는 반드시 생성자 앞에있어야하며
	 	   이연산자에의해 객체를 생성한다.
*/
class Constructor{
	private int member1;
	private int member2;
	/*
	 * 생성자 오버로딩
	 */
	public Constructor() {
		System.out.println("Constructor()기본생성자메쏘드 실행:"+this);
		this.member1=900;
		this.member2=700;
	}
	public Constructor(int member1) {
		System.out.println("Constructor(int member1) 생성자메쏘드 실행:"+this);
		this.member1=member1;
		this.member2=9999;
	}
	public Constructor(int member1,int member2) {
		System.out.println("Constructor(int member1,int member2) 생성자메쏘드 실행:"+this);
		this.member1=member1;
		this.member2=member2;
	}
	public void setConstructorData(int member1,int member2) {
		this.member1=member1;
		this.member2=member2;
	}
	
	public void print() {
		System.out.println("member1:"+this.member1);
		System.out.println("member2:"+this.member2);
	}
}
public class ConstructorMain {

	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		/*
		 * - 객체생성후 바로 생성자가호출
		 * - 생성자메쏘드는 실행후에 객체의 주소를반환한다.
		 */
		System.out.println(c1);
		c1.print();
		
		Constructor c2=new Constructor();
		c2.print();
		Constructor c3=new Constructor(8989);
		c3.print();
		Constructor c4=new Constructor(1, 2);
		c4.print();
		Constructor c5=new Constructor();
		c5.setConstructorData(3333, 4444);
		c5.print();
		c5.setConstructorData(5555, 6666);
		c5.print();
		
		DefaultConstructor dc=new DefaultConstructor();
		System.out.println(dc);
	}

}












public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		* 객체 생성 후 주소 값 참조변수 대입
		*/
		MemberField mf1 = new MemberField();
		/*
		 * 객체의 참조 변수를 통한 멤버필드(변수)에 데이터 대입
		 * 멤버 변수 접근 방법
		 *   --> 참조변수.식별자(멤버변수의 이름)
		 */
		
		mf1.member1=12;
		mf1.member2=3.14;
		mf1.member3='꿈';
		mf1.member4="문자열";
	
		MemberField mf2 = new MemberField();

		mf2.member1=78;
		mf2.member2=2.14;
		mf2.member3='깨';
		mf2.member4="스트링";
		
		System.out.println("------"+mf1+"------");
		System.out.println(mf1.member1);
		System.out.println(mf1.member2);
		System.out.println(mf1.member3);
		System.out.println(mf1.member4);
		System.out.println("------"+mf2+"------");
		System.out.println(mf2.member1);
		System.out.println(mf2.member2);
		System.out.println(mf2.member3);
		System.out.println(mf2.member4);
	}

}

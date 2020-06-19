
public class MemberField {
	/*
	 * 멤버변수 선언
	 * 
	 * 0. 멤버변수 생성 초기화 --> 초기화 작업 없다면 자동 초기화 
	 * 1. 멤버필드 생성 초기화
	 * 
	 * 
	 *   int     : 0
	 *   double  : 0.0
	 *   char    : \u0000
	 *   boolean : false
	 *   참조변수: null
	 */
	public int member1=67676;
	public double member2;
	public char member3;
	public boolean member4;
	public Account member5=new Account(34324,"JIM",56211,0.02);
	
	public MemberField() {
		/*
		 * 2.생성자초기화
		 */

	
		this.member1=9999;
		this.member2=9.9999;
		this.member3='A';
		this.member4=true;
		this.member5= new Account(1223,"SONG",90000,3.8);
		
	
//	
	}
}

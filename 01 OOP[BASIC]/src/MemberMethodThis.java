
public class MemberMethodThis {
	
	int memberField1;
	char memberField2;
	double memberField3;
	
	void setMemberMethodThis(int memberField1,char memberField2,double memberField3) {
		this.memberField1=memberField1;
		this.memberField2=memberField2;
		this.memberField3=memberField3;
		
	}
	void setMemberField1(int memberField1) {
		this.memberField1=memberField1;
	}
	
	
	void print() {
		int localVariable=908;
		/*
		 * this :
		 *   - self 참조변수
		 *  - print 메소드를 가지고 있는 객체의 주소값
		 */
		 
		 
	    System.out.println("localVariable="+localVariable);
	    System.out.println("this주소--->"+this);
		System.out.println(this.memberField1);
		System.out.println(this.memberField2);
		System.out.println(this.memberField3);
			
	}
	
	void setMemberField1() {
		
	}
}


public class MemberMethodThisMain {

	public static void main(String[] args) {
		System.out.println("----------------mmt1----------------");
		MemberMethodThis mmt1 = new MemberMethodThis();
		/*
		mmt1.memberField1=12121;
		mmt1.memberField2='김';
		mmt1.memberField3=3.14159;
		*/
		mmt1.setMemberMethodThis(12121, '김', 3.14159);
		mmt1.setMemberField1(77777);
		
		
		System.out.println("mmt1주소-->"+mmt1);
		mmt1.print();
		System.out.println("-----------------mmt2---------------");
		
		MemberMethodThis mmt2 = new MemberMethodThis();
		/*
		mmt2.memberField1=423;
		mmt2.memberField2='꿈';
		mmt2.memberField3=0.23584;
		*/
		mmt2.setMemberMethodThis(423, '꿈', 0.23594);
		System.out.println("mmt2주소-->"+mmt2);
		mmt2.print();
	}

}
